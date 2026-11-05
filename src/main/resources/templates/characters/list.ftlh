<#import "../layout.ftlh" as layout>
<@layout.displayPage title="Character Gallery">
    <h1>Character Gallery</h1>

    <form action="/characters" method="get" style="margin-bottom: 2rem; display: flex; gap: 0.5rem;">
        <input type="text" name="search" value="${search!''}" placeholder="Search characters..." style="width: 300px;"/>
        <button type="submit" class="btn">Search</button>
        <#if search?? && search != "">
            <a href="/characters" class="btn" style="background: #6c757d;">Clear</a>
        </#if>
    </form>

    <#if characters?? && characters?size gt 0>
        <div style="display: grid; grid-template-columns: repeat(auto-fill, minmax(250px, 1fr)); gap: 1.5rem;">
            <#list characters as character>
                <div class="card" style="margin-bottom: 0; display: flex; flex-direction: column; justify-content: space-between;">
                    <div>
                        <img src="${character.imageUrl!''}" alt="${character.name}" style="width: 100%; height: 160px; object-fit: cover; border-radius: 4px;" onerror="this.src='https://via.placeholder.com/150'">
                        <h3 style="margin: 0.75rem 0 0.5rem 0;">${character.name}</h3>
                        <p style="margin: 0.25rem 0;"><strong>Role:</strong> ${character.role!''}</p>
                        <p style="margin: 0.25rem 0;"><strong>Level:</strong> ${character.level!''}</p>
                    </div>
                    <div style="margin-top: 1rem;">
                        <a href="/characters/${character.id}" class="btn">View Details</a>
                    </div>
                </div>
            </#list>
        </div>
    <#else>
        <div class="card">
            <p>No characters found.</p>
        </div>
    </#if>
</@layout.displayPage>

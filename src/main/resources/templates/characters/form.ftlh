<#import "../layout.ftlh" as layout>
<@layout.displayPage title="${(character.id??)?then('Edit Character', 'Add Character')}">
    <div class="card" style="max-width: 600px;">
        <h1>${(character.id??)?then('Edit Character', 'Add New Character')}</h1>
        
        <form action="${(character.id??)?then('/characters/edit/' + character.id, '/characters/new')}" method="post">
            <div style="margin-bottom: 1rem;">
                <label style="display: block; font-weight: bold; margin-bottom: 0.25rem;">Name:</label>
                <input type="text" name="name" value="${character.name!''}" required style="width: 100%;">
            </div>

            <div style="margin-bottom: 1rem;">
                <label style="display: block; font-weight: bold; margin-bottom: 0.25rem;">Role:</label>
                <select name="role" required style="width: 100%;">
                    <#list roles as r>
                        <option value="${r}" <#if character.role?? && character.role == r>selected</#if>>${r}</option>
                    </#list>
                </select>
            </div>

            <div style="margin-bottom: 1rem;">
                <label style="display: block; font-weight: bold; margin-bottom: 0.25rem;">Level:</label>
                <input type="number" name="level" value="${character.level!''}" required style="width: 100%;">
            </div>

            <div style="margin-bottom: 1.5rem;">
                <label style="display: block; font-weight: bold; margin-bottom: 0.25rem;">Image URL:</label>
                <input type="text" name="imageUrl" value="${character.imageUrl!''}" style="width: 100%;">
            </div>

            <div>
                <button type="submit" class="btn">Save Character</button>
                <a href="/characters" class="btn" style="background: #6c757d; margin-left: 0.5rem;">Cancel</a>
            </div>
        </form>
    </div>
</@layout.displayPage>

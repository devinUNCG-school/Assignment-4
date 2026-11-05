<#import "../layout.ftlh" as layout>
<@layout.displayPage title="Character Details">
    <div class="card">
        <h1>${character.name}</h1>
        <img src="${character.imageUrl!''}" alt="${character.name}" style="max-width: 300px; height: auto; border-radius: 8px; margin-bottom: 1rem;" onerror="this.src='https://via.placeholder.com/150'">
        
        <p><strong>ID:</strong> ${character.id}</p>
        <p><strong>Role:</strong> ${character.role!''}</p>
        <p><strong>Level:</strong> ${character.level!''}</p>
        
        <div style="margin-top: 2rem; display: flex; gap: 0.5rem;">
            <a href="/characters" class="btn" style="background: #6c757d;">Back to Gallery</a>
            <a href="/characters/edit/${character.id}" class="btn">Edit</a>
            <a href="/characters/delete/${character.id}" class="btn btn-danger" onclick="return confirm('Are you sure you want to delete this character?');">Delete</a>
        </div>
    </div>
</@layout.displayPage>

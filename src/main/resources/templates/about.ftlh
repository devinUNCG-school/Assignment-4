<#import "layout.ftlh" as layout>
<@layout.displayPage title="About">
    <div class="card">
        <h1>About Character Manager</h1>
        <img src="https://via.placeholder.com/800x300" alt="About banner" style="width: 100%; height: 200px; object-fit: cover; border-radius: 4px; margin-bottom: 1rem;">
        <p>This web application seamlessly connects a server-rendered FreeMarker front end with a persistent PostgreSQL database backend.</p>
        
        <h2>How It's Built</h2>
        <p>The app is organized into distinct structural tiers:</p>
        <ul>
            <li><strong>Database & Entity Layer:</strong> Uses Spring Data JPA with PostgreSQL hosted on Neon to manage persistent character records.</li>
            <li><strong>Service Layer:</strong> Encapsulates core business logic and database querying operations.</li>
            <li><strong>Controller Layer:</strong> Spring MVC controllers route incoming HTTP requests, process form submissions, and populate model attributes.</li>
            <li><strong>View Layer:</strong> FreeMarker template files render dynamic HTML elements utilizing a shared navigation layout.</li>
        </ul>
    </div>
</@layout.displayPage>

<#macro displayPage title>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${title}</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f4f4f9; color: #333; }
        nav { background-color: #333; color: #fff; padding: 1rem 2rem; display: flex; justify-content: space-between; align-items: center; }
        nav a { color: #fff; text-decoration: none; margin-left: 1.5rem; font-weight: bold; }
        nav a:hover { text-decoration: underline; }
        .container { max-width: 1000px; margin: 2rem auto; padding: 0 1rem; }
        .card { background: #fff; border-radius: 8px; box-shadow: 0 2px 4px rgba(0,0,0,0.1); padding: 1.5rem; margin-bottom: 1.5rem; }
        .btn { display: inline-block; background: #007bff; color: white; padding: 0.5rem 1rem; border-radius: 4px; text-decoration: none; }
        .btn:hover { background: #0056b3; }
        .btn-danger { background: #dc3545; }
        .btn-danger:hover { background: #bd2130; }
        .alert { padding: 1rem; background: #d4edda; color: #155724; border-radius: 4px; margin-bottom: 1rem; }
        input, select { padding: 0.5rem; border: 1px solid #ccc; border-radius: 4px; }
    </style>
</head>
<body>
    <nav>
        <span style="font-size: 1.2rem; font-weight: bold;">Character Manager</span>
        <div>
            <a href="/characters">Home</a>
            <a href="/about">About</a>
            <a href="/characters/new">Add a Character</a>
        </div>
    </nav>
    <div class="container">
        <#nested>
    </div>
</body>
</html>
</#macro>

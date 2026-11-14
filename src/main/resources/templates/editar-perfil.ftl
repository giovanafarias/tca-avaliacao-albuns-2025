<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Heartbeat - Perfil</title>
    <link rel="stylesheet" href="/css/forms.css">
    <link rel="stylesheet" href="/css/edit.css">
    <link href="https://fonts.googleapis.com/css2?family=Molle:ital@1&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:wght@400&icon_names=account_circle,bookmark,delete,edit,favorite,home,settings" rel="stylesheet"/>
</head>

<body>
    <div class="box">
        <h1>Edite seu perfil</h1>

        <label for="foto">Foto de perfil:</label>

        <#if usuario.foto?has_content>
            <form action="/remover-foto/${usuario.username}" method="post">
                <button type="submit">Remover foto</button>
            </form>
        </#if>

        <br>

        <form method="post" enctype="multipart/form-data" action="/editar-perfil/${usuario.username}">            
            <#if usuario.foto?has_content>
                <img src="/uploads/${usuario.foto}" alt="Foto de perfil" class="foto-perfil">
                <p>${usuario.foto}</p>
                <input type="file" name="foto" id="foto" accept="image/.jpg">
            <#else>
                <input type="file" name="foto" id="foto" accept="image/.jpg">
            </#if>

            <label for="nome">Nome</label>
            <input type="text" id="nome" name="nome" value="${usuario.nome}" required>

            <#if erro?has_content><p>${erro}</p></#if>
            <label for="username">Username</label>
            <input type="text" id="username" name="username" value="${usuario.username}" required>

            <p>Altere e-mail ou senha nas configurações.</p>

            <div class="buttons">
                <a href="/perfil/${usuario.username}">Volte</a>
                <button type="submit">Salvar</button>
            </div>
        </form>
    </div>
</body>
</html>

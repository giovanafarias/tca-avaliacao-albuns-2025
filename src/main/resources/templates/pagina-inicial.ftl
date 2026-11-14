<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Heartbeat</title>
    <link rel="stylesheet" href="/css/home.css">
    <link href="https://fonts.googleapis.com/css2?family=Molle:ital@1&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:wght@400&icon_names=account_circle,bookmark,favorite,home,settings" rel="stylesheet"/>
</head>

<body>
    <div class="container">
        <aside class="sidebar">
            <div class="icon"><a href="/perfil/${usuario.username}"><span class="material-symbols-outlined">account_circle</span></a></div>
            <div class="icon"><span class="material-symbols-outlined">home</span></div>
            <div class="icon"><span class="material-symbols-outlined">favorite</span></div>
            <div class="icon"><span class="material-symbols-outlined">bookmark</span></div>
            <div class="icon"><span class="material-symbols-outlined">settings</span></div>
        </aside>

        <main class="main-content">
            <header>
                <h1 class="logo">
                    Heartbeat 
                    <img src="/uploads/logo.png" alt="Logo Heartbeat">
                </h1>

                <div class="search-bar">
                    <input type="text" placeholder="Pesquise...">
                    <button>Buscar</button>
                </div>
            </header>

            <section class="albums">
                <#if albuns?has_content>
                    <#list albuns as album>
                        <div class="album">
                            <img src="uploads/${album.capa}" alt="${album.titulo}">
                            <p><strong>${album.titulo}</strong> - ${album.artista.nome}</p>
                        </div>
                    </#list>
                <#else>
                    <p>Nenhum álbum encontrado.</p>
                </#if>
            </section>
        </main>
    </div>
</body>
</html>

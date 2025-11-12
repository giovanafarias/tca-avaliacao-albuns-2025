<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Heartbeat - Perfil</title>
    <link rel="stylesheet" href="/css/perfil.css">
    <link href="https://fonts.googleapis.com/css2?family=Molle:ital@1&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:wght@400&icon_names=account_circle,bookmark,delete,edit,favorite,home,settings" rel="stylesheet"/>
</head>

<body>
    <div class="container">
        <aside class="sidebar">
            <div class="icon"><span class="material-symbols-outlined">account_circle</span></div>
            <div class="icon"><a href="/home"><span class="material-symbols-outlined">home</span></a></div>
            <div class="icon"><span class="material-symbols-outlined">favorite</span></div>
            <div class="icon"><span class="material-symbols-outlined">bookmark</span></div>
            <div class="icon"><span class="material-symbols-outlined">settings</span></div>
        </aside>

        <main class="main-content">

            <div class="profile-section">
                <div class="profile-info">
                    <div class="profile-pic">
                        <#if usuario.foto?has_content>
                            <img src="/uploads/${usuario.foto}" alt="Foto de ${usuario.nome}">
                        <#else>
                            <span class="material-symbols-outlined">account_circle</span>
                        </#if>
                    </div>

                    <h2>${usuario.nome}</h2>
                    <p class="username">@${usuario.username}</p>


                    <a href="/editar-perfil/${usuario.username}"><button class="edit-btn">Editar</button></a>
                </div>

                <div class="reviews-section">
                    <h2>Suas Reviews</h2>

                    <#if avaliacoes?has_content>
                        <#list avaliacoes as review>
                            <div class="review-card">
                                <div class="review-header">
                                    <#if usuario.foto?has_content>
                                        <img src="/uploads/${usuario.foto}" alt="Foto de ${usuario.nome}">
                                    <#else>
                                        <span class="material-symbols-outlined">account_circle</span>
                                    </#if>
                                    <div class="review-header-space">
                                        <p><strong>${usuario.nome}</strong> para Álbum <strong>“${review.album.titulo}”</strong></p>
                                        <span class="nota">Nota: ${review.nota}/10</span>
                                    </div>
                                </div>
                                <div class="comentario-container">
                                    <p class="comentario">${review.comentario}</p>
                                    <div class="comentario-icons">
                                        <a href="/editar-review/${usuario.username}/${review.album.titulo}"><span class="material-symbols-outlined">edit</span></a>
                                        <span class="material-symbols-outlined">delete</span>
                                    </div>
                                </div>

                            </div>
                        </#list>
                    <#else>
                        <p class="aviso">Você ainda não fez nenhuma review.</p>
                    </#if>
                </div>
            </div>
        </main>
    </div>
</body>
</html>

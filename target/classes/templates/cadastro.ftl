<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agenda INFO24</title>
    <link rel="stylesheet" href="css/login-cadastro.css">
</head>
<body>

    <div class="box">
        <img src="uploads/logo.png" alt="Logo">
        <h1>Heartbeat</h1>

        <form method="post" action="/cadastro">
            <label for="nome">Nome</label>
            <input type="text" id="nome" name="nome" placeholder="Seu nome">

            <label for="username">Username</label>
            <input type="text" id="username" name="username" placeholder="Nome de usuário">

            <label for="email">E-mail</label>
            <input type="email" id="email" name="email" placeholder="Digite seu email">

            <label for="senha">Senha</label>
            <input type="password" id="senha" name="senha" placeholder="Digite sua senha">

            <div class="buttons">
                <a href="/">Volte</a>
                <button type="submit">Cadastrar</button>
            </div>
        </form>
    </div>

</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Heartbeat - Login</title>
    <link rel="stylesheet" href="css/login-cadastro.css">
</head>
<body>
  <div class="box">
    <img src="uploads/logo.png" alt="Logo">
    <h1>Heartbeat</h1>
    <form action="/login" method="post">
      <label for="usuario">Nome de usuário</label>
      <input type="text" id="usuario" name="username" placeholder="Digite seu nome">
      
      <label for="senha">Senha</label>
      <input type="password" id="senha" name="senha" placeholder="Digite sua senha">

        <div class="buttons">
          <a href="cadastro">Cadastre-se</a>
          <button type="submit">Entrar</button>
        </div>
      </form>
  </div>
</body>
</html>

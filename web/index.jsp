<!DOCTYPE html>
<html>
<head>
<title>Calculadora IMC</title>

<style>

body{
font-family: Arial, Helvetica, sans-serif;
background: linear-gradient(135deg,#74b9ff,#a29bfe);
height:100vh;
display:flex;
justify-content:center;
align-items:center;
margin:0;
}

.container{
background:white;
padding:40px;
border-radius:12px;
box-shadow:0px 10px 25px rgba(0,0,0,0.2);
width:350px;
text-align:center;
}

.logo{
width:80px;
margin-bottom:10px;
}

h2{
margin-bottom:20px;
color:#333;
}

input,select{
width:100%;
padding:10px;
margin:8px 0;
border-radius:6px;
border:1px solid #ccc;
font-size:14px;
}

button{
width:100%;
padding:12px;
background:#6c5ce7;
border:none;
color:white;
font-size:16px;
border-radius:6px;
cursor:pointer;
transition:0.3s;
}

button:hover{
background:#4834d4;
}

.logo{
width:120px;
margin-bottom:15px;
}

</style>

</head>

<body>

<div class="container">

<img src="imagenes/logo.png" class="logo">

<h2>Calculadora IMC</h2>

<form action="calcular" method="post">

<input type="text" name="nombre" placeholder="Nombre" required>

<input type="number" name="edad" placeholder="Edad" required>

<select name="sexo">
<option value="">Sexo</option>
<option value="Masculino">Masculino</option>
<option value="Femenino">Femenino</option>
</select>

<input type="text" name="estatura" placeholder="Estatura (m)" required>

<input type="text" name="peso" placeholder="Peso (kg)" required>

<button type="submit">Calcular IMC</button>

</form>

</div>

</body>
</html>
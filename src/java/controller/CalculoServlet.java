package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calcular")
public class CalculoServlet extends HttpServlet {

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

String nombre = request.getParameter("nombre");

int edad = Integer.parseInt(request.getParameter("edad"));
String sexo = request.getParameter("sexo");

double estatura = Double.parseDouble(request.getParameter("estatura"));
double peso = Double.parseDouble(request.getParameter("peso"));

response.setContentType("text/html");

if(edad < 15){

response.getWriter().println("Edad no válida. Debe ser mayor a 15.");
return;

}

if(estatura < 1 || estatura > 2.5){

response.getWriter().println("Estatura no válida.");
return;

}

if(peso <= 0){

response.getWriter().println("Peso no válido.");
return;

}

double imc = Math.round((peso/(estatura*estatura)) * 100.0) / 100.0;

String clasificacion="";

if(imc < 18.5){

clasificacion="Bajo peso";

}else if(imc < 25){

clasificacion="Peso normal";

}else if(imc < 30){

clasificacion="Sobrepeso";

}else{

clasificacion="Obesidad";

}

response.getWriter().println("<!DOCTYPE html>");
response.getWriter().println("<html>");
response.getWriter().println("<head>");
response.getWriter().println("<title>Resultado IMC</title>");

response.getWriter().println("<style>");

response.getWriter().println("body{font-family:Arial;background:linear-gradient(135deg,#74b9ff,#a29bfe);height:100vh;display:flex;justify-content:center;align-items:center;margin:0;}");

response.getWriter().println(".container{background:white;padding:40px;border-radius:12px;box-shadow:0px 10px 25px rgba(0,0,0,0.2);width:400px;text-align:center;}");

response.getWriter().println(".resultado{font-size:22px;margin:20px 0;color:#333;}");

response.getWriter().println("table{width:100%;border-collapse:collapse;margin-top:20px;}");

response.getWriter().println("td,th{border:1px solid #ccc;padding:8px;}");

response.getWriter().println("th{background:#6c5ce7;color:white;}");

response.getWriter().println("a{display:inline-block;margin-top:20px;padding:10px 20px;background:#6c5ce7;color:white;text-decoration:none;border-radius:6px;}");

response.getWriter().println("</style>");

response.getWriter().println("</head>");
response.getWriter().println("<body>");

response.getWriter().println("<div class='container'>");

response.getWriter().println("<h2>Resultado del IMC</h2>");

response.getWriter().println("<p><b>Nombre:</b> "+nombre+"</p>");
response.getWriter().println("<p><b>Edad:</b> "+edad+"</p>");
response.getWriter().println("<p><b>Sexo:</b> "+sexo+"</p>");

response.getWriter().println("<div class='resultado'>Tu IMC es: "+imc+"</div>");

response.getWriter().println("<h3>Clasificación: "+clasificacion+"</h3>");

response.getWriter().println("<table>");

response.getWriter().println("<tr><th>IMC</th><th>Clasificación</th></tr>");
response.getWriter().println("<tr><td>Menor a 18.5</td><td>Bajo peso</td></tr>");
response.getWriter().println("<tr><td>18.5 - 24.9</td><td>Normal</td></tr>");
response.getWriter().println("<tr><td>25 - 29.9</td><td>Sobrepeso</td></tr>");
response.getWriter().println("<tr><td>30 o más</td><td>Obesidad</td></tr>");

response.getWriter().println("</table>");

response.getWriter().println("<a href='index.html'>Calcular de nuevo</a>");

response.getWriter().println("</div>");

response.getWriter().println("</body>");
response.getWriter().println("</html>");

}

}
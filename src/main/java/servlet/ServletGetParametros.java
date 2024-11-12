package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//Implementamos el path de acceso al Servlet
@WebServlet("/parametros")
public class ServletGetParametros extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Le decimos al servidor que tipo de contenido me va
        //a devolver
        resp.setContentType("text/html");
        //Recibimos parametros por medio de get
        String saludo = req.getParameter("saludo");
        //Implementamos la variable PrintWriter
        PrintWriter out = resp.getWriter();

        //Creo la plantilla html
        out.print("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<title>Hola Parametros get</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Parametros get</h1>");
        out.println("<h2>Salundo: " + saludo + "</h2>");
        out.println("</body>");
        out.println("</html>");


    }
}

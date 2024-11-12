package servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//Necesitamos un Path una llave o una key para acceder al servlet
@WebServlet("/holaServlet")
public class Servlet extends HttpServlet  {

    //Sobreescribimos el método get
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        //Escribimos la respuesta en html
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Salundando Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hola saludando desde el Servlet</h1>");
        out.println("</body>");
        out.println("</html>");

    }

}

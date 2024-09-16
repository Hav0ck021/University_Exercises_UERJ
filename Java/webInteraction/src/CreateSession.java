import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CreateSession {
    public void doGet(){
        HttpSession sessao = request.getSession(true);
        sessao.setAttribute("site", "http://www.multitecnus.com");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String pagina =
                "<html>" +
                        "<head>" +
                        "<title>Servlet chamado de cria Session.html</title>" +
                        "</head>" +
                        "<body>" +
                        "<a href=\"./ResgataSession\">Chama a servlet \"Resgata Session\"</a>" +
                        "</body>" +
                        "</html>";

        System.out.println(pagina);
    }
}

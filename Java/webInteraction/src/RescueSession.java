import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RescueSession {
    public void doGet(){
        PrintWriter out = response.getWriter();
        System.out.println("Chamada de CriaSession<br />");
        HttpSession sessao = request.getSession(true);
        response.setContentType("text/html");
        System.out.println("Valor resgatado: " + sessao.getAttribute("site") + "<br />");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        System.out.println("Id da session: " + sessao.getId() + "<br />");
        System.out.println("Acesso : " + sdf.format(new Date(sessao.getLastAccessedTime())));
    }
}


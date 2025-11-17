import java.io.*;
import javax.servlet.*;

public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet Initialized");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<h2>This is the service() method.</h2>");
        out.println("<p>Servlet is handling the request...</p>");
    }
    @Override
    public void destroy() {
        System.out.println("Servlet Destroyed");
    }
}

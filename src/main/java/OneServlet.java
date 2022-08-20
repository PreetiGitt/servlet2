import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
// Without Annotation
public class OneServlet extends HttpServlet {
    String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h3 >New Project with Tomcat 10</h3>");
        out.println(getStr());

    }
    @Override
    public void init(ServletConfig config) throws ServletException{
        System.out.println("Servlet Interface- parametrised");
        String str= config.getInitParameter("NameAsKey_Burger");
        setStr(str);
        System.out.println(str);
    }
    @Override
    public  void init(){
        System.out.println("GenericServlet Method--Non Param");
    }
}

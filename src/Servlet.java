import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/CalculateDiscount")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float discountPercent = Float.parseFloat(request.getParameter("Discount_Percent"));
        float listPrice = Float.parseFloat(request.getParameter("List_Price"));
        double discountAmount = discountPercent * listPrice * 0.01/100;
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Discount Amount: " + listPrice + "</h1>");
        printWriter.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        printWriter.println("<h1>Discount Price: " + (listPrice - discountAmount) + "</h1>");
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

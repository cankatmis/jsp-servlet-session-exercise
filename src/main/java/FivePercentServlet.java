import com.example.jspservletsessionexercise.Employee;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "FivePercentServlet", value = "/FivePercentServlet")
public class FivePercentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Employee oldest=(Employee)request.getServletContext().getAttribute("oldestFive");
        oldest.setSalary(oldest.getSalary()*1.05);

        request.setAttribute("percentEmp",oldest);
        request.getRequestDispatcher("bonus.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

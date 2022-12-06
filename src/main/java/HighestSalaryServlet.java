import com.example.jspservletsessionexercise.Employee;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "HighestSalaryServlet", value = "/HighestSalaryServlet")
public class HighestSalaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Employee> emp = (ArrayList<Employee>) getServletContext().getAttribute("employees");

        Employee e = new Employee(" ", 0, 0);
        for (Employee em: emp) {
            if (em.getSalary() > e.getSalary()){
                e = em;
            }
        }
        request.setAttribute("messagehighest", "Highest Paid Employee");
        request.setAttribute("highestemployee",e);

        request.getRequestDispatcher("empmanagement.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

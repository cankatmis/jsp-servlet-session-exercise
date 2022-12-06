import com.example.jspservletsessionexercise.Employee;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "OldestEmployeeServlet", value = "/OldestEmployeeServlet")
public class OldestEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Employee> emp = (ArrayList<Employee>) getServletContext().getAttribute("employees");

        Employee e = new Employee(" ", 0, 0);
        for (Employee em: emp) {
            if (em.getAge() > e.getAge()){
                e = em;
            }
        }
        request.setAttribute("message", "Oldest Employee");
        request.setAttribute("employeeservlet",e);

        request.getRequestDispatcher("empmanagement.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

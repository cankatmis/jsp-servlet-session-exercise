import com.example.jspservletsessionexercise.Employee;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;

@WebServlet(name = "XMLSaveServlet", value = "/XMLSaveServlet")
public class XMLSaveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getParameter("name") != null){
            Employee toSave=(Employee)request.getServletContext().getAttribute("name");
            try {
                FileOutputStream fos = new FileOutputStream("test.xml");
                XMLEncoder xe = new XMLEncoder(fos);
                xe.writeObject(toSave);
                xe.close();
            }
            catch(IOException e){
                System.out.println("An error has occured " + e.getMessage());
            }
            String saved="The object is saved successfully.";
            request.setAttribute("saved",saved );

            request.getRequestDispatcher("empmanagement.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

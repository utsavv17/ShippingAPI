package controller;

// ShippingDetailsServlet.java
import DAO.ShippingDetailsDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ShippingDetails;

@WebServlet("/shipping-details")
public class ShippingDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Retrieve data from the request
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String pincode = request.getParameter("pincode");
        int poId = Integer.parseInt(request.getParameter("poId"));
        int customerId = Integer.parseInt(request.getParameter("customerId"));

        // Create ShippingDetails object
        ShippingDetails shippingDetails = new ShippingDetails();
        shippingDetails.setAddress(address);
        shippingDetails.setCity(city);
        shippingDetails.setPincode(pincode);
        shippingDetails.setPoId(poId);
        shippingDetails.setCustomerId(customerId);

        // Add shipping details to the database
        ShippingDetailsDAO dao = new ShippingDetailsDAO();
        dao.addShippingDetails(shippingDetails);

        // Send response
         RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
        dispatcher.forward(request, response);
          }
}

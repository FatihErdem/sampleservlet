package tr.org.lkd.lyk2015.sampleservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;


@WebServlet(urlPatterns = "/list")
public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {


        req.setAttribute("todos", Storage.getAll());
        req.getRequestDispatcher("WEB-INF/list.jsp").forward(req, res);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {


        String[] ids = req.getParameterValues("id");

        for (String doneId : ids) {

            Storage.markAsDone(Long.parseLong(doneId));
        }

        res.sendRedirect("list");
    }
}


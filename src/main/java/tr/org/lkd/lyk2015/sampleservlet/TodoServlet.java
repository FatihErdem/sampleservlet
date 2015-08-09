package tr.org.lkd.lyk2015.sampleservlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/todo")
public class TodoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.getRequestDispatcher("WEB-INF/todo.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

//        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String description = req.getParameter("description");
//        String date = req.getParameter("date");
        String done = req.getParameter("done");

//        System.out.println(id);
        System.out.println(name);

        Todo myTodo = new Todo();
//        myTodo.id = Integer.parseInt(id);
        myTodo.name = name;
        myTodo.description = description;
        myTodo.done = Boolean.valueOf(done);

        Storage myStorage = new Storage();
        myStorage.Push(myTodo);

        req.getRequestDispatcher("WEB-INF/todo.jps").forward(req, res);


    }
}

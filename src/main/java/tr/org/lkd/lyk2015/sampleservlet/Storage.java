package tr.org.lkd.lyk2015.sampleservlet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Storage {

    private Map<Long, Todo> todos = new HashMap<>();
    private Long idCounter = 100L;


    public void add(Todo todo) {
        todo.setId(idCounter++);
        todos.put(todo.getId(), todo);
    }

    public Todo getById(Long id) {
        return todos.get(id);
    }

    public Collection<Todo> getAll() {
        return todos.values();
    }

    public void markAsDone(Long id) {
        Todo todo = todos.get(id);
        todo.setDone(true);
    }
}

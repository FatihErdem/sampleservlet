package tr.org.lkd.lyk2015.sampleservlet;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Storage  {

    static Map<Integer, Todo> myMap = new HashMap<Integer, Todo>();

    Random r = new Random();
    int i = r.nextInt(15);

    public void Push(Todo myTodo){
        myMap.put(i , myTodo);
    }

}

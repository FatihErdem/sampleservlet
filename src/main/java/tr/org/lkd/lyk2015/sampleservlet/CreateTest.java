package tr.org.lkd.lyk2015.sampleservlet;

import java.util.Calendar;

public class CreateTest {


    public CreateTest() {
        Todo t1 = new Todo("test todo 1", "test lorem ipsum 1", Calendar.getInstance());
        Todo t2 = new Todo("test todo 2", "test lorem ipsum 2", Calendar.getInstance());
        Todo t3 = new Todo("test todo 3", "test lorem ipsum 3", Calendar.getInstance());
        Todo t4 = new Todo("test todo 4", "test lorem ipsum 4", Calendar.getInstance());
        Todo t5 = new Todo("test todo 5", "test lorem ipsum 5", Calendar.getInstance());

        Storage.add(t1);
        Storage.add(t2);
        Storage.add(t3);
        Storage.add(t4);
        Storage.add(t5);
    }


}

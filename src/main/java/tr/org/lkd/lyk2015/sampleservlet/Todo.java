package tr.org.lkd.lyk2015.sampleservlet;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Todo {

    private Long id;
    private String name;
    private String desc;
    private Calendar dueDate;
    private Boolean done;

    public Todo() {

    }

    public Todo(String name, String desc, Calendar dueDate) {
        this.name = name;
        this.desc = desc;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getDate() {
        Date date = this.dueDate.getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String datetime = null;
        datetime = format1.format(date);

        return datetime;
    }
}

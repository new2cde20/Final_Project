import java.io.Serializable;
import java.util.ArrayList;

public class Vaccine implements Serializable {
    private String name;
    private String date;
    
    public Vaccine() {
        name = "";
        date = "";
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
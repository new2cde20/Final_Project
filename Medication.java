import java.io.Serializable;
import java.util.ArrayList;

public class Medication implements Serializable {
    private String name;
    private String dose;
    
    public Medication() {
        name = "";
        dose = "";
    }

    public String getName() {
        return name;
    }

    public String getDose() {
        return dose;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }
        
}
import java.io.Serializable;
import java.util.ArrayList;

public class Visit implements Serializable {
    private String date;
    private String reason;
    
    public Visit() {
        date = "";
        reason = "";
    }

    public String getDate() {
        return date;
    }

    public String getReason() {
        return reason;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
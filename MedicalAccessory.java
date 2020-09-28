import java.io.Serializable;
import java.util.ArrayList;

public class MedicalAccessory implements Serializable {
    private String medicalAid;
    
    public MedicalAccessory() {
        medicalAid = "";
    }

    public String getMedicalAid() {
        return medicalAid;
    }

    public void setMedicalAid(String medicalAid) {
        this.medicalAid = medicalAid;
    }
}
import java.io.Serializable;
import java.util.ArrayList;

public class Patient implements Serializable {
    private String name; // String which stores the patient's name
    private int age; // int which stores the patient's age
    private Double height; // Stores the patient's height
    private Double weight; // Stores the patient's weight
    private String eyeColor; // String which stores the patient's eye color
    private String hairColor; // String which stores the patient's hair color
    private ArrayList<Medication> medications; // ArrayList that stores patient's medications
    private ArrayList<MedicalAccessory> accessories; // ArrayList that stores patient's accessoriesf
    private ArrayList<Vaccine> vaccines; // ArrayList that stores vaccines
    private ArrayList<Visit> visits; // ArrayList that stores visits

    public Patient(String name, int age, Double height, Double weight, String eyeColor, String hairColor) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setEyeColor(eyeColor);
        setHairColor(hairColor);
        ArrayList<Medication> medications = new ArrayList<>();
        setMedications(medications);
        ArrayList<MedicalAccessory> accessories = new ArrayList<>();
        setAccessories(accessories);
        ArrayList<Vaccine> vaccines = new ArrayList<>();
        setVaccines(vaccines);
        ArrayList<Visit> visits = new ArrayList<>();
        setVisits(visits);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public ArrayList<Medication> getMedications() {
        return medications;
    }

    public ArrayList<MedicalAccessory> getAccessories() {
        return accessories;
    }

    public ArrayList<Vaccine> getVaccines() {
        return vaccines;
    }

    public ArrayList<Visit> getVisits() {
        return visits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setMedications(ArrayList<Medication> medications) {
        this.medications = medications;
    } 

    public void setAccessories(ArrayList<MedicalAccessory> accessories) {
        this.accessories = accessories;
    }

    public void setVaccines(ArrayList<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }

    public void setVisits(ArrayList<Visit> visits) {
        this.visits = visits;
    }

    public String toString() {
        return String.format("name: %s\nage: %d\nheight: %f\nweight: %f\neyecolor: %s\nhaircolor: %s",
         name, age, height, weight, eyeColor, hairColor);
    }

}

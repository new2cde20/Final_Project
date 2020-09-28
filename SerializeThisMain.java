import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import java.util.ArrayList;

import java.io.Serializable;
import java.util.Scanner;

class SerializeThisMain {
    public static void main(String[] args) {
        /*
        SerializeThis mySerializedFrame = new SerializeThis(); // Creates new frame object
        mySerializedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes program when you press "X" button
        mySerializedFrame.setSize(275,180); // Creates the size of the window
        mySerializedFrame.setVisible(true); // Sets it so that you can see the frame
        */

        Patient myPatient = new Patient("Conrad", 21, 70.0, 195.1, "hazel", "blonde");

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(myPatient);
        System.out.printf("%s",patients.toString());

        int usage = 0;
        
        while (usage !=6) {
            System.out.println("Welcome to SerializeThis!");
            System.out.println("Choose one of the following options:");
            System.out.println("1. Add new patient");
            System.out.println("2. Add a new medication to a patient");
            System.out.println("3. Add a new medical accessory to a patient");
            System.out.println("4. Add a new vaccine record to a patient");
            System.out.println("5. Add a new visit record to a patient");
            System.out.println("6. To exit out of this program");

            Scanner sc = new Scanner(System.in);
            usage = sc.nextInt();

        }

        // patients.add (new Patient("Janeise", 22, 66.0, 145.1, "dark brown", "blonde and black"));

        //patientReader -- have it deserialize from the same location
        //Maybe implement toostring in all classes

    }
}

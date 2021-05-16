import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import java.util.Random;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class SerializeThis extends JFrame implements ActionListener {

    public SerializeThis() {
        super("SerializeThis Project");
        setLayout(new FlowLayout());

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        // Create menu bar and menus. 
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        //JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
        //fileMenu.add(newMenuItem);

        JMenuItem openMenuItem = new JMenuItem("Open", KeyEvent.VK_O);
        openMenuItem.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                // Displays "Open" menu when you click the "Open" button
                int returnVal = fc.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File thisFile = fc.getSelectedFile(); // Returns file that user selects
                    try {
                    Desktop.getDesktop().open(thisFile); // Opens file in text editor of choice
                    System.out.println("Opening... " + thisFile.getName()); // Prints out file name to console
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                }
            }
        });
        fileMenu.add(openMenuItem);

        JMenuItem saveMenuItem = new JMenuItem("Save", KeyEvent.VK_S);
        saveMenuItem.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                // Displays "Save" menu when you click the "Save" button
                JFileChooser fc = new JFileChooser();
                int rVal = fc.showSaveDialog(null);
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                if (rVal == JFileChooser.APPROVE_OPTION) {
                    File someFile = fc.getSelectedFile();
                    try {
                    FileWriter fw = new FileWriter(someFile);
                    fw.write(""); // Allows user to write file name
                    System.out.println("Saving... " + someFile.getName()); // Prints out file name to console
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();

        JMenuItem exitMenuItem = new JMenuItem("Exit", KeyEvent.VK_X);
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Asks the user if they're sure they want to exit the program
                int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the program?", "Exit Program Message Box",
                JOptionPane.YES_NO_OPTION);
                
                // If the user selects yes, then the program closes
                if (confirmed == JOptionPane.YES_OPTION) {
                System.exit(0);
                }
            }
        });
        fileMenu.add(exitMenuItem);
        
        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);
        menuBar.add(editMenu);
        this.setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent a) {

    }
}
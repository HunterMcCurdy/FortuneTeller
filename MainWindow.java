import javafx.scene.control.Labeled;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;


public class MainWindow {
    private JFrame window;
    private JTextArea displayTA = new JTextArea(20, 50);;

    public MainWindow() {

    }


    public void initialize() {
        window = new JFrame();
        window.setTitle("FortuneTeller");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(1440, 1000);
        window.setLocationRelativeTo(null);
        window.setLayout(new BorderLayout(10, 5));
        window.setVisible(true);
    }

    public void createDisplayPanel() {
        JPanel displayPnl = new JPanel();
        displayTA.setEditable(false);
        displayTA. setFont(new Font("Serif", Font. PLAIN, 24));
        JScrollPane scroller = new JScrollPane(displayTA);
        displayPnl.add(scroller);
        window.add(displayPnl, BorderLayout.CENTER);



    }

    
    
    public void createImageIcon() {
        ImageIcon icon = new ImageIcon("src/fortuneteller.png");
        JLabel titleLbl = new JLabel("Welcome to the Fortune Teller!!", icon, JLabel.CENTER);
        titleLbl. setFont(new Font("Serif", Font. PLAIN, 48));
        titleLbl.setHorizontalTextPosition(JLabel.CENTER);
        titleLbl.setVerticalTextPosition(JLabel.BOTTOM);
        window.add(titleLbl, BorderLayout.NORTH);

    }

    public void createControlPanel() {
        JPanel controlPnl = new JPanel();
        controlPnl.setLayout(new GridLayout(1, 2));


        JButton quit = new JButton("Quit");
        JButton fortune = new JButton("Read my fortune!!");
        controlPnl.add(quit);
        controlPnl.add(fortune);
        quit.addActionListener((ActionEvent ae) -> System.exit(0));
        fortune.addActionListener((ActionEvent ae) -> fortunes());

        window.add(controlPnl, BorderLayout.SOUTH);
    }

    public void fortunes(){
        String[] myArray = {"You will get an “A” on a test",
                "You will be rich",
                "It ain’t about how hard ya hit. It’s about how hard you can get hit and keep moving forward.",
                "Make each day your masterpiece.",
                "It always seems impossible until it is done.",
                "You miss 100% of the shots you don’t take.",
                "Winners never quit and quitters never win.",
                "It’s not whether you get knocked down, it’s whether you get up.",
                "You are never too old to set another goal or dream a new dream.",
                "If you want the rainbow, you gotta put up with the rain.",
                "It’s not whether you get knocked down, it’s whether you get up.",
                "The harder the battle, the sweeter the victory.",};

        // Picking a random element from the array
        Random random = new Random();
        String randomElement = myArray[random.nextInt(myArray.length)];
        displayTA.append(randomElement + "\n");



    }



}













import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

//Option selection Screen

public class Setup extends JFrame {

    private static Text toptext = new Text(grab(0), 50, 50);
    private static Text infotext = new Text("Bitte trage oben die Optionen durch ein , getrennt ein! ", 50, 300);
    private static Button save = new Button ("Save", 200, 400);

    public Setup() {

        Setup.Handler handler = new Setup.Handler();
        save.addActionListener(handler);

        infotext.setEditable(false);

        this.add(save);
        this.add(infotext);
        this.add(toptext);

        this.setTitle("Setup");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(false);
        this.getContentPane().setBackground(Color.darkGray);

    }

    public static String grab(int a){

        File datei = null;
        Scanner scan = null;

        datei = new File("C:/Documents/jan_save/rand/options.txt");

        try {

            scan = new Scanner(datei);

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found!");

        }

        return scan.nextLine();

    }

    private static void save() {

        try {

            FileWriter outtop = new FileWriter("C:/Documents/jan_save/rand/options.txt");
            outtop.write(toptext.getText());
            outtop.close();

        }catch (Exception e) {

            System.out.println(e);

        }

    }

    private class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==save) {
                save();
                Main.screenload();
                setVisible(false);
            }

        }
    }

}

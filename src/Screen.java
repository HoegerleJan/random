import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

//Randomizer Screen

public class Screen extends JFrame {
    private static JTextField text = new JTextField("Options");
    private static Button rollbutton = new Button("Roll", 200, 250);
    private static Button editbutton = new Button("Edit", 350, 400);

    public Screen() {

        text.setForeground(Color.white);
        text.setBackground(Color.darkGray);
        text.setBounds(200,200,100,20);
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setVisible(true);
        text.setEditable(false);

        Handler handler = new Handler();
        rollbutton.addActionListener(handler);
        editbutton.addActionListener(handler);


        this.add(text);
        this.add(rollbutton);
        this.add(editbutton);

        this.setTitle("Generator");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(false);
        this.getContentPane().setBackground(Color.darkGray);

    }

    private void roll() {

        Random random = new Random();
        Scanner scan = null;
        String output;
        File datei = new File("C:/Documents/jan_save/rand/options.txt");

        try {

            scan = new Scanner(datei);

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found!");

        }

        String[] optionlist = scan.nextLine().split(",");

        output = optionlist[random.nextInt(optionlist.length)];

        text.setText(output.trim());

    }

    private class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==rollbutton) {
                roll();
            } else if (e.getSource()==editbutton) {
                Main.setupload();
                setVisible(false);
            }

        }
    }

}
import javax.swing.*;
import java.awt.*;

//Default Button

public class Button extends JButton {

    Button(String content, int cordx, int cordy) {

        this.setText(content);
        this.setForeground(Color.white);
        this.setBackground(Color.darkGray);
        this.setHorizontalAlignment(JTextField.CENTER);
        this.setVisible(true);
        this.setBounds(cordx,cordy,100,50);

    }

}

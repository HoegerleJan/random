import javax.swing.*;

public class Text extends JTextField {

    public Text(String content, int cordx, int cordy) {

        this.setText(content);
        this.setHorizontalAlignment(JTextField.CENTER);
        this.setVisible(true);
        this.setBounds(cordx,cordy,400,25);

    }

}

import java.io.File;
import java.io.FileWriter;

public class Main {

    private static Screen screen = new Screen();
    private static Setup setup = new Setup();


    public static void main(String[] args) {

        if(new File("C:/Documents/jan_save/rand/options.txt").canRead()) {

            screenload();

        } else {

            start();

            setupload();

        }

    }

    public static void start() {

        new File("C:/Documents/jan_save/rand").mkdirs();

        try {

            File top = new File("C:/Documents/jan_save/rand/options.txt");
            top.createNewFile();

        } catch (Exception e) {

            System.out.println(e);

        }

        try {

            FileWriter options = new FileWriter("C:/Documents/jan_save/rand/options.txt");
            options.write("Options");
            options.close();

        }catch (Exception e) {

            System.out.println(e);

        }

    }

    public static void screenload() {

        screen.setVisible(true);

    }

    public static void setupload() {

        setup.setVisible(true);

    }

}
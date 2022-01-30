import javax.swing.*;
import java.awt.*;

public class MainClass {

    public static MyPanel mypanel;
    public static JFrame frame;

    public MainClass() {
         frame = new MyFrame();
    }

    public static class MyFrame extends JFrame {

        public MyFrame() {
            this.setTitle("Paint2D");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            int height = dim.height;
            int width = dim.width;
            this.setLocation(width / 4, height / 4);
            this.setSize(width / 2, height / 2);
            mypanel = new MyPanel();
            this.add(mypanel);
            this.setVisible(true);
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(MainClass::new);

    }
}
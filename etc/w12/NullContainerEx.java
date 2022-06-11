package etc.w12;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx() {
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        JLabel la = new JLabel("Hello, press button");
        la.setLocation(130, 50);
        la.setSize(200, 20);
        c.add(la);
        /*
        JLabel la2 = new JLabel("2nd label");
        la2.setLocation(200, 80);
        la2.setSize(60, 20);
        la2.setOpaque(true);
        la2.setBackground(Color.yellow);
        c.add(la2);
        */
        for (int i = 1; i <= 9; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i * 15, i * 15);
            b.setSize(50, 20);
            c.add(b);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContainerEx();
    }
}

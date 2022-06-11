package etc.w13;

import javax.swing.*;
import java.awt.*;

public class ComboBoxEx extends JFrame {
    private String[] fruits = {"a", "b", "c", "d", "e", "f", "g"};
    private String[] names = {"1", "2", "3", "4", "5", "6"};

    public ComboBoxEx() {
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JComboBox<String> strCombo = new JComboBox<String>(fruits);
        c.add(strCombo);

        JComboBox<String> nameCombo = new JComboBox<String>();
        for (int i = 0; i < names.length; i++) {
            nameCombo.addItem(names[i]);
            c.add(nameCombo);
        }

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxEx();
    }
}

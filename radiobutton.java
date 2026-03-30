import javax.swing.*;

public class radiobutton {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Radio Example");

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        r1.setBounds(100, 50, 100, 30);
        r2.setBounds(100, 80, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        frame.add(r1);
        frame.add(r2);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

                       
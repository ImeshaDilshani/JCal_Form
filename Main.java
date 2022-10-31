import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Imesha Calc");
        frame.setContentPane(new CalForm().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);

    }
}

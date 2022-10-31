import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalForm {
    public JPanel contentPane;
    private JTextField textField1;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button19;
    private JButton button20;
    private JButton button3;
    private JButton button4;
    private JButton button2;
    private JButton button1;
    private JButton button18;


    double first;
    double second;
    double result;
    String operation;
    String answer;

    //btn 0,1,2,3,4,5,6,7,8,9
    public CalForm() {
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + button8.getText());
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText(textField1.getText() + button7.getText());
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText(textField1.getText() + button6.getText());
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText(textField1.getText() + button12.getText());
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText(textField1.getText() + button11.getText());
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText(textField1.getText() + button10.getText());
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText(textField1.getText() + button16.getText());
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText(textField1.getText() + button15.getText());
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText(textField1.getText() + button14.getText());
            }
        });


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + button2.getText());
            }
        });


        //btn CE
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText("");
            }
        });

        //btn .


        //btn +
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "+";
            }
        });

        //btn -
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "-";
            }
        });
        //btn *
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "*";
            }
        });
        //btn /
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "/";
            }
        });
        //btn =
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second = Double.parseDouble(textField1.getText());
                if (operation == "+") {
                    result = first + second;
                    answer = String.format("%.2f", result);
                    textField1.setText(answer);
                } else if (operation == "-") {
                    result = first - second;
                    answer = String.format("%.2f", result);
                    textField1.setText(answer);
                } else if (operation == "*") {
                    result = first * second;
                    answer = String.format("%.2f", result);
                    textField1.setText(answer);
                } else if (operation == "/") {
                    result = first / second;
                    answer = String.format("%.2f", result);
                    textField1.setText(answer);
                }
            }
        });
        //btn +/-
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField1.getText().contains("."))
                {
                    Double pm = Double.parseDouble(textField1.getText());
                    pm = pm * -1;
                    textField1.setText(String.valueOf(pm));
                }
                else
                {
                    long pm = Long.parseLong(textField1.getText());
                    pm = pm * -1;
                    textField1.setText(String.valueOf(pm));
                }


            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField1.getText().contains("."))
                {
                    textField1.setText(textField1.getText()+button18.getText());
                }
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backsplace=null;
                if (textField1.getText().length()>0)
                {
                    StringBuilder strB = new StringBuilder(textField1.getText());
                    strB.deleteCharAt(textField1.getText().length() - 1);
                    backsplace = String.valueOf(strB);
                    textField1.setText(backsplace);
                }
            }
        });

    }

}




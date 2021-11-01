import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CounterApp extends JFrame {
    private int value;

    public CounterApp(int initialValue) {
        setBounds(500,500,300,300);

        Font font = new Font("Arial", Font.BOLD, 18);
        Font font1 = new Font("Arial", Font.BOLD, 24);

        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setFont(font1);
        label1.setBounds(10, 10, 400, 32);
        add(label1);
        label1.setText(String.valueOf("Step value: "));

        JTextField counterInit = new JTextField("0");
        counterInit.setFont(font);
        counterInit.setBounds(10, 50, 200, 32);
        add(counterInit);
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font1);
        counterValueView.setBounds(80, 110, 60, 32);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView);
        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        decrementButton.setBounds(10,100,60,60);
        add(decrementButton);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        incrementButton.setBounds(150,100,60,60);
        add(incrementButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setFont(font);
        clearButton.setHorizontalAlignment(SwingConstants.CENTER);
        clearButton.setBounds(10,170,200,60);
        add(clearButton);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((value-Math.abs(Integer.parseInt(counterInit.getText())))>0) {
                    value=value - Math.abs(Integer.parseInt(counterInit.getText()));
                    counterValueView.setText(String.valueOf(value));
                }
                else {
                    value = 0;
                    counterValueView.setText(String.valueOf(value));
                }
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               value=value + Math.abs(Integer.parseInt(counterInit.getText()));
               counterValueView.setText(String.valueOf(value));
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value =0;
                counterValueView.setText(String.valueOf(value));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter {

    // Using Java Swing

    public static void Converter(){

        JFrame frame = new JFrame("LetsGrowMore :- CURRENCY");

        JLabel label1 , label2;

        JTextField text1, text2;

        // Creating three buttons
        JButton button1, button2, button3;

        label1 = new JLabel("Rupees : ");
        label1.setBounds(20,40,60,30);

        label2 = new JLabel("Dollars : ");
        label2.setBounds(170,40,60,30);

        text1 = new JTextField("0");
        text1.setBounds(80,40,50,30);

        text2 = new JTextField("0");
        text2.setBounds(240,40,50,30);

        button1 = new JButton("INR");
        button1.setBounds(50,80,60,15);

        button2 = new JButton("Dollar");
        button2.setBounds(190,80,60,15);

        button3 = new JButton("Close");
        button3.setBounds(150,150,60,30);

        // Adding action listner
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Converting to double
                double d = Double.parseDouble(text1.getText());

                // Converting rupees to dollars
                double d1 = (d / 81);

                /* Getting the String value of calculated value */

                String str = String.valueOf(d1);

                // Placing it in the box
                text2.setText(str);
            }
        });

        // Adding action Listner
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d2 = Double.parseDouble(text2.getText());
                // Converting Dollars to rupees

                double d3 = (d2 * 81);

                String str1 = String.valueOf(d3);
                // Placing it in the textbox

                text1.setText(str1);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        // Default method for closing the frame
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Adding the created Objects to the Frame

        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setLayout(null);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
    // Driver Code
    public static void main(String[] args) {
        Converter();
    }
}
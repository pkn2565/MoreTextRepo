import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class MoreText extends JFrame{
    private JTextField text;
    private JLabel label;
    private JTextField field;

    public MoreText(){
        text = new JTextField(10);
        label = new JLabel("0.0");
        field = new JTextField(10);
        JButton button = new JButton("Add");
        button.addActionListener(new CalculateHandle());

        FlowLayout flow = new FlowLayout();
        JPanel panel = new JPanel();

        panel.add(label);
        panel.add(text);
        panel.add(field);
        panel.add(button);
        setContentPane(panel);
    }
    public static void main(String[] args){
        MoreText calc = new MoreText();
        calc.setSize(1000,1000);
        calc.setTitle("Calculator");
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.pack();
        calc.setVisible(true);
        System.out.println(calc.getInsets());
    }
    private class CalculateHandle implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double in1 = Double.parseDouble(text.getText());
            double in2 = Double.parseDouble(field.getText());
            double result = in1 + in2;
            DecimalFormat form = new DecimalFormat("####.00");
            label.setText(String.valueOf(form.format(result)));
            System.out.println("You have added " + in1 + "and" + in2 + "and your sum is " + result);
        }
    }
}




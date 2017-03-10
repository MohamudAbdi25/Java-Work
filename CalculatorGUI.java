import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;



public class CalculatorGUI extends JFrame {


private Service sc; 
private NonService ns;


private JPanel buttonPanel; 
private JButton calcButton; 
private JButton exitButton; 

public CalculatorGUI() {

super("Rankens Automotive");
setLocationRelativeTo(null);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


setLayout(new BorderLayout());


sc = new Service();
ns = new NonService();


buildButtonPanel();


add(sc, BorderLayout.PAGE_START);

add(ns, BorderLayout.CENTER);

add (buttonPanel,BorderLayout.PAGE_END);

pack();
setVisible(true);
}


private void buildButtonPanel() {

buttonPanel = new JPanel();


calcButton = new JButton("Calculate Charges");
exitButton = new JButton("Exit");


calcButton.addActionListener(new CalcButtonListener());
exitButton.addActionListener(new ExitButtonListener());


buttonPanel.add(calcButton);
buttonPanel.add(exitButton);

}



private class CalcButtonListener implements ActionListener {
public void actionPerformed(ActionEvent e) {


double total; // The order total


total = sc.actionCalculate() + ns.getNonroutineServicesCost();


DecimalFormat dollar = new DecimalFormat("0.00");

JOptionPane.showMessageDialog(null, "Total: $"
+ dollar.format(total));

}
}


private class ExitButtonListener implements ActionListener {
public void actionPerformed(ActionEvent e) {

System.exit(0);
}
}

public static void main(String args[]) {

new CalculatorGUI();

}}



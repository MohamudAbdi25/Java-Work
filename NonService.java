
import java.awt.*;
import javax.swing.*;

public class NonService extends JPanel {
public final double perHourCharge = 20.00; 
private JLabel partsLabel; 
private JLabel laborLabel; 
private JTextField partsTextField; 
private JTextField laborTextField; 
private JPanel panel;

public NonService() {

partsLabel = new JLabel("Parts Charges:");
laborLabel = new JLabel("Hours of Labor:");

partsTextField = new JTextField(10);
laborTextField = new JTextField(10);


setBorder(BorderFactory.createTitledBorder("Nonroutine services"));

add(partsLabel);
add(partsTextField);
add(laborLabel);
add(laborTextField);

panel = new JPanel();
panel.setLayout(new GridLayout(3, 2));
setLayout(new GridLayout(2, 2));
}

public double getNonroutineServicesCost()
{
return Double.parseDouble(partsTextField.getText())+(Double.parseDouble(laborTextField.getText())*perHourCharge);
}
}

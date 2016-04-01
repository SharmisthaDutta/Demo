

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
 
public class Base implements Runnable {

    @Override
    public void run() {
        // Create the window
        JFrame f = new JFrame("Hello, !");
        // Sets the behavior for when the window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Add a layout manager so that the button is not placed on top of the label
        f.setLayout(new FlowLayout());
        // Add a label and a button
        f.add(new JLabel("Name"));
        f.add(new JTextField(50));
        f.add(new JLabel("Email-Id"));
        f.add(new JTextField(50));
        JButton b = (JButton) f.add(new JButton("Submit!"));
//        b.addActionListener(new ActionListener()
//        		{
//        	JDialog d=new JDialog(f, "Ok",true);
//        	d.setLocationRelativeTo(f);
//        	d.setVisible(true);
//        		});
        // Arrange the components inside the window
        f.pack();
        // By default, the window is not visible. Make it visible.
        f.setVisible(true);
    }
 
    public static void main(String[] args) {
        Base se = new Base();
        // Schedules the application to be run at the correct time in the event queue.
        SwingUtilities.invokeLater(se);
    }

}
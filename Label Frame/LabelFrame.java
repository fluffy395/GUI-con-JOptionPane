package IntFces;

// Jlabel components with text and icons
import java.awt.FlowLayout;
import javax.swing.JFrame; // provides the basic features of a window
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // load the images

public class LabelFrame extends JFrame {
    private JLabel label1; // JLabel with text only
    private JLabel label2; // JLabel built with text and an icon
    private JLabel label3; // JLabel with additional text and icon

    // LabelFrame constructor adds JLabel objects to JFrame
    public LabelFrame() {
        super("JLabel Test");
        setLayout(new FlowLayout()); // set the frame schema
        // JLabel constructor with a String argument
        label1 = new JLabel("Hello");
        label1.setToolTipText("This is label1");
        add(label1); // add tag1 to JFrame

        // JLabel constructor with string, Icon, and alignment arguments
        Icon elvis = new ImageIcon(getClass().getResource("Elvis Presley.png"));
        label2 = new JLabel("Rock and roll", elvis, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2); // add tag2 to JFrame

        label3 = new JLabel(); // JLabel constructor with no arguments
        label3.setText("Hello");
        label3.setIcon(elvis); // add icon to JLabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3); // add tag3 to JFrame
    }
}
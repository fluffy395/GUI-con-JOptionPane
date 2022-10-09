package IntFces;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
    private final JButton buttonJButtonSimple; // button with text only
    private final JButton buttonJButtonFancy; // button with icons

    // ButtonFrame adds JButton objects to JFrame
    public ButtonFrame() {
        super("Button Test");
        setLayout(new FlowLayout());

        buttonJButtonSimple = new JButton("Simple Button");
        add(buttonJButtonSimple);

        Icon bug1 = new ImageIcon(getClass().getResource("avicii.gif"));
        Icon bug2 = new ImageIcon(getClass().getResource("avicii2.gif"));
        buttonJButtonFancy = new JButton("FancyButton", bug1); // set the image
        buttonJButtonFancy.setRolloverIcon(bug2); // set the replacement image
        add(buttonJButtonFancy); // add fancyButtonJButton to JFrame

        // create new ButtonHandler to handle button events
        ButtonHandler handler = new ButtonHandler();
        buttonJButtonFancy.addActionListener(handler);
        buttonJButtonSimple.addActionListener(handler);
    }

    // inner class to handle button events
    private class ButtonHandler implements ActionListener {
        // handle button event
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
} // End ButtonFrame class
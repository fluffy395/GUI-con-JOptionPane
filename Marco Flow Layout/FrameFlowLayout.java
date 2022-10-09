package IntFces;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FrameFlowLayout extends JFrame {
    private final JButton buttonJButtonLeft; // button to set left alignment
    private final JButton buttonJButtonCentre; // button to set the alignment to center
    private final JButton buttonJButtonRight; // button to set the alignment to the right
    private final FlowLayout scheme; // schema object
    private final Container container; // container to set the schema

    // set up the GUI and register the button listeners
    public FrameFlowLayout() {
        super("FlowLayout Demo");

        scheme = new FlowLayout();
        container = getContentPane(); // get container for schema
        setLayout(scheme);
        // set buttonJButtonLeft and register listener component
        buttonJButtonLeft = new JButton("Left");
        add(buttonJButtonLeft); // add Left button to frame
        buttonJButtonLeft.addActionListener(
                new ActionListener() { // anonymous inner class
                    // process event of buttonJButtonIzquierda
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        scheme.setAlignment(FlowLayout.LEFT);

                        // realign attached components
                        scheme.layoutContainer(container);
                    }
                }
        );

        // set buttonJButtonCenter and register listener component
        buttonJButtonCentre = new JButton("Center");
        add(buttonJButtonCentre); // add Center button to frame
        buttonJButtonCentre.addActionListener(
                new ActionListener() { // anonymous inner class
                    // process event of buttonJButtonCentro
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        scheme.setAlignment(FlowLayout.CENTER);

                        // realign attached components
                        scheme.layoutContainer(container);
                    }
                }
        );

        // set RightButtonJButton and register listener
        buttonJButtonRight = new JButton("Right");
        add(buttonJButtonRight); // add Right button to frame
        buttonJButtonRight.addActionListener(
                new ActionListener() { // anonymous inner class

                    // process event of buttonJButtonRight
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        scheme.setAlignment(FlowLayout.RIGHT);

                        // realign attached components
                        scheme.layoutContainer(container);
                    }
                }
        );
    }
}
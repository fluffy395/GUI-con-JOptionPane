package IntFces;

// Fig. 12.16: TestButton.java
// ButtonFrame test.

import javax.swing.JFrame;

public class TestButton {
    public static void main(String[] args) {
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275, 110);
        buttonFrame.setVisible(true);
    }
} // end class TestButton
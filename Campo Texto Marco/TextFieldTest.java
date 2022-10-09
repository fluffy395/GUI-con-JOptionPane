package IntFces;

// Fig. 12.10: TextFieldTest.java
// Test FrameTextField.

import javax.swing.JFrame;

public class TextFieldTest {
    public static void main(String[] args) {
        FrameTextField FrameTextField = new FrameTextField();
        FrameTextField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FrameTextField.setSize(350, 100);
        FrameTextField.setVisible(true);
    }
} // end class TextFieldTest
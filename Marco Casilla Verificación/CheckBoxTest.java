package IntFces;

// Fig. 12.18: CheckBoxTest.java
// FrameCheckBox Test.

import  javax.swing.JFrame;

public class CheckBoxTest {
    public static void main(String[] args) {
        FrameCheckBox frameCheckBox = new FrameCheckBox();
        frameCheckBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCheckBox.setSize(600,100);
        frameCheckBox.setVisible(true);
    }
} // end class CheckBoxTest
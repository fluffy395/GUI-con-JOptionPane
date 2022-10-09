package IntFces;

// Fig. 12.22: TestFrameCombined.java
// FrameBoxCombined test.

import javax.swing.*;

public class TestFrameCombined {
    public static void main(String[] args) {
        FrameBoxCombined frameBoxCombined = new FrameBoxCombined();
        frameBoxCombined.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameBoxCombined.setSize(1366,768);
        frameBoxCombined.setVisible(true);
    }
}
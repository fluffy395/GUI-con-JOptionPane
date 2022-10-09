package IntFces;

// Fig. 12.40: DemoFlowLayout.java
// Test FrameworkFlowLayout.

import javax.swing.JFrame;

public class DemoFlowLayout {
    public static void main(String[] args) {
        FrameFlowLayout frameFlowLayout = new FrameFlowLayout();
        frameFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameFlowLayout.setSize(300, 75);
        frameFlowLayout.setVisible(true);
    }
} // end class DemoFlowLayout
package IntFces;

// Fig. 12.44: DemoGridLayout.java
// Test the FrameGridLayout.

import javax.swing.JFrame;

public class DemoGridLayout {
    public static void main(String[] args) {
        FrameGridLayout frameGridLayout = new FrameGridLayout();
        frameGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGridLayout.setSize(300, 200);
        frameGridLayout.setVisible(true);
    }
} // end of DemoGridLayout class
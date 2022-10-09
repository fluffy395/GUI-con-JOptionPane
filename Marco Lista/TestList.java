package IntFces;

// Fig. 12.24: TestList.java
// Selection of colors from a JList object.

import javax.swing.JFrame;

public class TestList {
    public static void main(String[] args) {
        FrameList frameList = new FrameList(); // create ListFrame object
        frameList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameList.setSize(800,600);
        frameList.setVisible(true);
    }
} // end class TestList
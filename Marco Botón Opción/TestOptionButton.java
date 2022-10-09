package IntFces;

// Fig. 12.20: TestOptionButton.java
// FrameButtonOption test.

import javax.swing.JFrame;

public class TestOptionButton {
    public static void main(String[] args) {
        FrameButtonOption frameButtonOption = new FrameButtonOption();
        frameButtonOption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameButtonOption.setSize(600,100);
        frameButtonOption.setVisible(true);
    }
}
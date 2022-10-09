package IntFces;

// Fig. 12.29: MouseTrackerFrame.java
// Test of MouseTrackerFrame.

import javax.swing.JFrame;

public class TrackerMouse {
    public static void main(String[] args) {
        MouseTrackerFrame MouseTrackerFrame = new MouseTrackerFrame();
        MouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MouseTrackerFrame.setSize(300, 100);
        MouseTrackerFrame.setVisible(true);
    }
} // end MouseTracker class
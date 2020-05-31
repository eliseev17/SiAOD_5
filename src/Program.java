import javax.swing.*;
import java.awt.*;

public class Program {
    static void createAndShowGUI(JImageDisplay imageDisplay) {
        JFrame frame = new JFrame("Кривая Серпинского");
        frame.add(imageDisplay, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public static void main(String[] args) {
        JImageDisplay imageDisplay = new JImageDisplay();
        createAndShowGUI(imageDisplay);
    }
}
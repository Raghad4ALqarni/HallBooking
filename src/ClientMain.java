import java.awt.*;
import javax.swing.*;

public class ClientMain {
        public static void main(String[] args) {
            
            EventQueue.invokeLater(() -> {
                var frame = new MainFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            });
            
        }
}

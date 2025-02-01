
import javax.swing.SwingUtilities;

public class WOWUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WOW1().setVisible(true);
            }
        });
    }
}

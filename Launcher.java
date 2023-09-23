import javax.swing.SwingUtilities;
public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow main = new MainWindow();
                main.initialize();
                main.createDisplayPanel();
                main.createImageIcon();
                main.createControlPanel();
                main.fortunes();

            }
        });
    }
}
/**
 * Created by Paul on 7/23/2017.
 */

import java.awt.EventQueue;
import javax.swing.JFrame;

public class UtilityTImerExample extends JFrame {

    public UtilityTImerExample() {
        initUI();
    }

    private void initUI() {
        add(new UtilityTimerBoard());

        setResizable(false);
        pack();

        setTitle("Star");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ex = new UtilityTImerExample();
                ex.setVisible(true);
            }
        });
    }
}

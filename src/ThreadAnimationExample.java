/**
 * Created by Paul on 7/23/2017.
 */

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ThreadAnimationExample extends JFrame {

    public ThreadAnimationExample() {
        initUI();
    }

    private void initUI() {
        add(new ThreadAnimationBoard());

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
                JFrame ex = new ThreadAnimationExample();
                ex.setVisible(true);
            }
        });
    }
}

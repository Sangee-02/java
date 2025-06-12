import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TimerApp extends JFrame implements ActionListener {
    private int seconds = 0;
    private Timer timer;
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;

    public TimerApp() {
        setTitle("Timer App");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Label to show time
        timeLabel = new JLabel("00:00", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Verdana", Font.BOLD, 40));
        add(timeLabel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel();
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Timer updates every second
        timer = new Timer(1000, e -> {
            seconds++;
            updateLabel();
        });

        // Button actions
        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    private void updateLabel() {
        int mins = seconds / 60;
        int secs = seconds % 60;
        timeLabel.setText(String.format("%02d:%02d", mins, secs));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == startButton) {
            timer.start();
        } else if (source == stopButton) {
            timer.stop();
        } else if (source == resetButton) {
            timer.stop();
            seconds = 0;
            updateLabel();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TimerApp().setVisible(true));
    }
}

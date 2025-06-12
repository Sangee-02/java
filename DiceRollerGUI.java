import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class DiceRollerGUI extends JFrame implements ActionListener {
    JLabel diceLabel;
    JButton rollButton;
    Random rand;

    public DiceRollerGUI() {
        setTitle("Dice Roller");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        diceLabel = new JLabel("Roll the Dice!", SwingConstants.CENTER);
        diceLabel.setFont(new Font("Arial", Font.BOLD, 30));
        add(diceLabel, BorderLayout.CENTER);

        rollButton = new JButton("Roll");
        rollButton.setFont(new Font("Arial", Font.BOLD, 20));
        rollButton.addActionListener(this);
        add(rollButton, BorderLayout.SOUTH);

        rand = new Random();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int roll = rand.nextInt(6) + 1;
        diceLabel.setText("🎲 " + roll);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DiceRollerGUI().setVisible(true));
    }
}

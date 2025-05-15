import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounterApp extends JFrame implements ActionListener {
    private JLabel counterLabel;
    private JButton clickButton;
    private int count = 0;

    public ClickCounterApp() {
        setTitle("Click Counter");
        counterLabel = new JLabel("Clicks: 0", SwingConstants.CENTER);
        clickButton = new JButton("Click Me");
        clickButton.addActionListener(this);

        setLayout(new BorderLayout());
        add(counterLabel, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;  // Increment the click counter
        counterLabel.setText("Clicks: " + count);
    }
}


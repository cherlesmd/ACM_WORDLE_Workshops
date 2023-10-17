package wordle_gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class WordleGUI extends JFrame {
	private JTextField[][] textRows;
    private int currRow;
    private State state;
    private JPanel panel;

    public WordleGUI() {
        setTitle("Tiles GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 700);

        // Create a panel to hold the components
        JPanel mainPanel = new JPanel(new BorderLayout());
        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 5));
        mainPanel.add(panel, BorderLayout.CENTER);
        // Create the input fields
        textRows = new JTextField[6][5];
        createInputField();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WordleGUI tilesGUI = new WordleGUI();
            tilesGUI.setVisible(true);
        });
    }
}

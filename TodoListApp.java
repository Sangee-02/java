import javax.swing.*;
import javax.swing.DefaultListSelectionModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoListApp extends JFrame implements ActionListener {
    DefaultListModel<String> listModel;
    JList<String> todoList;
    JTextField inputField;
    JButton addButton, deleteButton, clearButton;

    public TodoListApp() {
        setTitle("To-Do List");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Input panel
        JPanel inputPanel = new JPanel(new BorderLayout(5, 5));
        inputField = new JTextField();
        addButton = new JButton("Add");
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        // To-do list
        listModel = new DefaultListModel<>();
        todoList = new JList<>(listModel);
        todoList.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(todoList);

        // Buttons panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        deleteButton = new JButton("Delete Selected");
        clearButton = new JButton("Clear All");
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);

        // Add components to frame
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add listeners
        addButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == addButton) {
            String task = inputField.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement("• " + task);
                inputField.setText("");
            }
        } else if (source == deleteButton) {
            int selectedIndex = todoList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            }
        } else if (source == clearButton) {
            listModel.clear();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TodoListApp().setVisible(true);
        });
    }
}
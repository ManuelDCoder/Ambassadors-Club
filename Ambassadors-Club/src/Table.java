import javax.swing.*;

public class Table {
    private JPanel tablePanel;
    private JPanel searchPanel;
    private JPanel updateDeletePanel;
    private JScrollPane tableScrollPanel;
    private JTable table1;
    private JTextField searchTextField;
    private JButton searchButton;
    private JLabel enterNameLabel;
    private JButton updateButton;
    private JButton deleteButton;




    public static void main(String[] args) {
        JFrame table = new JFrame("Registered Members");

        table.setVisible(true);
        table.setContentPane(new Table().tablePanel);
        table.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        table.setLocation(500,200);
        table.setSize(400, 400);
    }
}

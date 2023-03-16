import javax.swing.*;
import java.util.Set;

public class GUIForm extends JFrame {
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JPanel panelMain;

    public GUIForm() {
        this.setTitle("FrameMain");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        button1.addActionListener(e -> {
            try {
                String a = textField1.getText();
                int n = Integer.parseInt(a);
                Set<String> b = Solution.generate(n);
                textField2.setText(b.toString());
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Некорректные данные", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}

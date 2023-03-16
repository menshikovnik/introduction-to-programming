package ru.vsu.cs.menshikovnik;

import javax.swing.*;

import static ru.vsu.cs.menshikovnik.Solution.findElement;

public class FrameMain extends JFrame {
    private JTextField textField1;
    private JPanel panelMain;
    private JButton ВведитепредложениеButton;
    private JTextField textField2;

    public FrameMain() {
        this.setTitle("FrameMain");
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        ВведитепредложениеButton.addActionListener(e -> {
            try {
                String text = (textField1.getText());
                String FioText = findElement(text);
                textField2.setText(String.format("%s", FioText));
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Некорректные данные", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    }

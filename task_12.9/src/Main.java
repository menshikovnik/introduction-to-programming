public class Main {
    public static void main(String[] args) {
        wimMain();
    }

    public static void wimMain() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIForm().setVisible(true);
            }
        });
    }
}
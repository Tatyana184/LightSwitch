import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Painting painting = new Painting();
        painting.setSize(300,400);
        painting.setTitle("��������");
        painting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painting.setVisible(true);
    }
}
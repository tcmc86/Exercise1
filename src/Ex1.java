import javax.swing.*;

public class Ex1 {
    public static void main(String[] args) {

        String name, className, snacksAsString;
        int snacks;

        name = JOptionPane.showInputDialog("Please enter your name: ");
        className = JOptionPane.showInputDialog("Please enter your class name: ");
        snacksAsString = JOptionPane.showInputDialog("Please enter the amount of snacks you would like: ");

        snacks = Integer.parseInt(snacksAsString);



        JOptionPane.showMessageDialog(null,"Name: " + name + "\nClass: " + className +
                                                                "\nSnacks: " + snacks,"Results",JOptionPane.PLAIN_MESSAGE);
    }
}

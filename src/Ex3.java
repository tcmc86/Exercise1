import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {

        String name, incomeAsString;
        float income;

        name = JOptionPane.showInputDialog("Please enter your name: ");
        incomeAsString = JOptionPane.showInputDialog("Please enter your taxable income: ");

        income = Float.parseFloat(incomeAsString);

        JOptionPane.showMessageDialog(null,"Name: " + name + "\nTaxable Income: " + income,"Results",
                JOptionPane.PLAIN_MESSAGE);


    }
}

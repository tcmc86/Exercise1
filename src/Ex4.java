import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {

        String numberAsString, output = "";
        int i = 1, total = 0, number;

        numberAsString = JOptionPane.showInputDialog("Please enter a number " + i);
        number = Integer.parseInt(numberAsString);

        while(!numberAsString.equals("q"))
        {

            total += number;
            i++;

            numberAsString = JOptionPane.showInputDialog("Please enter a number " + i);
        }

        JOptionPane.showMessageDialog(null,"Total: " + total +
                "\nNumbers: " + (i-1),"Result",JOptionPane.INFORMATION_MESSAGE);
    }
}

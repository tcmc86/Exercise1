import javax.swing.*;

public class Ex2 {


    public static void main(String[] args) {

        String firstName, initial, lastName, distanceAsString;
        float distance = 0;

        firstName = JOptionPane.showInputDialog("Please enter first name: ");
        initial = JOptionPane.showInputDialog("Please enter the initial: ");
        lastName = JOptionPane.showInputDialog("Please enter the last name: ");
        distanceAsString = JOptionPane.showInputDialog("Please enter the distance travelled in km: ");

        distance = Float.parseFloat(distanceAsString);

        JOptionPane.showMessageDialog(null, "First Name: " + firstName + "\nInitial: " + initial +
                "\nLast Name: " + lastName + "\nDistance Travelled: " + distance + "km", "Results", JOptionPane.PLAIN_MESSAGE);

    }
}











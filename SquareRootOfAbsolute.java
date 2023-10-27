/**
 * ACS-1903 Lab 7 Q8
 * @author (your name and student number)
 */
import javax.swing.JOptionPane;

public class SquareRootOfAbsolute{
    public static void main(String[] args){
        String xAsString = JOptionPane.showInputDialog("Enter a number: ");
        double x, y;
        
        // enter your code here
        x = Integer.parseInt(xAsString);
        y = Math.sqrt(Math.abs(x));
        
        JOptionPane.showMessageDialog(null, "y = " + (int)y);
    }
}

import javax.swing.*;

public class NumberProfileMain {
    public static void main(String[] args) {
        NumberProfile numberProfile=new NumberProfile();
        numberProfile.setNumber(Integer.parseInt(JOptionPane.showInputDialog("Enter the number:")));
        JOptionPane.showMessageDialog(null,numberProfile.getNumberProfile());
    }
}

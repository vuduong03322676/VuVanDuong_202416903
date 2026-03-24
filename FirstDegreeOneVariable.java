import javax.swing.JOptionPane;

public class FirstDegreeOneVariable {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Nhap so a:");
        String strNum2 = JOptionPane.showInputDialog("Nhap so b:");

        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);

        String result = "";

        if (a == 0) {
            if (b == 0) {
                result = "Phuong trinh co vo so nghiem";
            } else {
                result = "Phuong trinh vo nghiem";
            }
        } else {
            double x = -b / a;
            result = "Nghiem x = " + x;
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
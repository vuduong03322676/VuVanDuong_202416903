import javax.swing.JOptionPane;

public class FirstDegreeTwoVariables {
    public static void main(String[] args) {

        // Nhập dữ liệu
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a1:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Nhap b1:"));
        double c1 = Double.parseDouble(JOptionPane.showInputDialog("Nhap c1:"));

        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Nhap a2:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Nhap b2:"));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog("Nhap c2:"));

        // Tính định thức
        double D  = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;

        String result = "";

        if (D != 0) {
            double x = Dx / D;
            double y = Dy / D;
            result = "Nghiem duy nhat:\n";
            result += "x = " + x + "\n";
            result += "y = " + y;
        } else {
            if (Dx == 0 && Dy == 0) {
                result = "He phuong trinh co vo so nghiem";
            } else {
                result = "He phuong trinh vo nghiem";
            }
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
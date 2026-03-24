import javax.swing.JOptionPane;

public class DoubleNumbers {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Nhap so dau tien:");
        String strNum2 = JOptionPane.showInputDialog("Nhap so thu hai:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;

        String result = "";
        result += "Tong = " + sum + "\n";
        result += "Hieu = " + diff + "\n";
        result += "Tich = " + product + "\n";

        if (num2 != 0) {
            double quotient = num1 / num2;
            result += "Thuong = " + quotient;
        } else {
            result += "Khong the chia";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}

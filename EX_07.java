package ch_01;

import javax.swing.JOptionPane;

public class EX_07 {

    public static void main(String[] args) {
        int d = 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13);
        JOptionPane.showMessageDialog(null, "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)" + " = " + d);
    }
}

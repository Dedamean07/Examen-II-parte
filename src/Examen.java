
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 // @author Denis
 */
public class Examen {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        String a1, a2, a3, nom;
        Double num1, num2, num3, prome;
        int d;

        for (d = 1; d <= 3; d++) {
            nom = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");

            a1 = JOptionPane.showInputDialog("Ingrese la primera calificacion");
            a2 = JOptionPane.showInputDialog("Ingrese la seguda calificacion");
            a3 = JOptionPane.showInputDialog("Ingrese la tercera calificacion");


            num1 = Double.parseDouble(a1);
            num2 = Double.parseDouble(a2);
            num3 = Double.parseDouble(a3);

            prome = ((num1 + num2 + num3) / 3);

            JOptionPane.showMessageDialog(null, "El promedio del Alumno" + " " + nom + " " + "es" + " " + prome);

            if (prome >= 60) {
                JOptionPane.showMessageDialog(null, "Aprobado");
            } else {
                JOptionPane.showMessageDialog(null,"Reprobado");
            }
        }
    }
}
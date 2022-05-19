package dio.bootcamp.exceptions;

import javax.swing.*;

import static jdk.javadoc.internal.doclets.toolkit.util.DocPath.parent;

public class UncheckedExceptions {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try{int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(parent)
        }
    }
        { finally {
            System.out.println("Chegou no finally!");
            }

            System.out.println("O código continua...");
    }
    public static int dividir(int a, int b) { return a / b; }
}

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        int enteroUno, enteroDos;
        double parteDecimalUno, parteDecimalDos;
        float decimalUno, decimalDos;

        enteroUno = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el primer numero entero (X)"));
        enteroDos = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el segundo numero entero (X)"));

        parteDecimalUno = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese el primer numero parte decimal (X.XX)"));
        parteDecimalDos = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese el segundo numero parte decimal (X.XX)"));

        decimalUno = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero decimal (.XX)"));
        decimalDos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero decimal (.XX)"));

        Multiplicacion op1 = new Multiplicacion(enteroUno, enteroDos);
        Multiplicacion op2 = new Multiplicacion(parteDecimalUno, parteDecimalDos);
        Multiplicacion op3 = new Multiplicacion(decimalUno, decimalDos);
    }
}

import java.awt.geom.RectangularShape;

public class Multiplicacion
{
    public Multiplicacion(int numeroEnteroUno, int numeroEnteroDos)
    {
        int resultado = 0;
        resultado = numeroEnteroUno * numeroEnteroDos;
        System.out.println("El resultado de " + numeroEnteroUno + " * " + numeroEnteroDos + " es igual a " + resultado);
    }

    public Multiplicacion(double parteDecimalUno, double parteDecimalDos)
    {
        double resultado = 0;
        resultado = parteDecimalUno * parteDecimalDos;
        System.out.println("El resultado de " + parteDecimalUno + " * " + parteDecimalDos + " es igual a " + resultado);
    }

    public Multiplicacion(float decimalUno, float decimalDos)
    {
        float resultado = decimalUno * decimalDos;
        System.out.println("El resultado de " + decimalUno + " * " + decimalDos + " es igual a " + resultado);
    }
}

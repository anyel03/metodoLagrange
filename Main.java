import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //declaracion de variables
        int iteraciones=0;
        double valorEvaluar;

        iteraciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de iteraciones"));

        double[] ArrayX = new double[iteraciones],ArrayY = new double[iteraciones];

        for (int i = 0; i < ArrayX.length; i++) {
            ArrayX[i] = Double.parseDouble( JOptionPane.showInputDialog("Ingrese el valor de la casilla X" + i));
            ArrayY[i] = Double.parseDouble( JOptionPane.showInputDialog("Ingrese el valor de la casilla Y" + i));
        }

        valorEvaluar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a evaluar"));

        double respuesta;
        respuesta = new MetodoLagrange().Lagrange(iteraciones,valorEvaluar,ArrayX,ArrayY);
        JOptionPane.showMessageDialog(null,"el valor para "+valorEvaluar+" es: "+respuesta);
    }

}
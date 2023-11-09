public class MetodoLagrange {
    public double Lagrange(double numeroIntervalos, double valor, double[] xArray, double[] yArray) {

        double resultado = 0, L0=1;

        // recorrer los valores de y
        for (int i = 0; i < numeroIntervalos; i++) {

            // encontrar las secciones de L - recorrer los valores de x
            for (int j = 0; j < numeroIntervalos; j++) {
                if (i != j) {
                    L0 *= (valor - xArray[j]) / (xArray[i] - xArray[j]);
                }
            }
            System.out.println(yArray[i] * L0);
            // Resolver la ecuacion
            resultado += yArray[i] * L0;
            // reiniciar el valor de L
            L0 = 1;
        }
        return resultado;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        System.out.println("Ingress the primer number: ");
        Integer numero1 = solicitarNumero();

        System.out.println("Ingress the second number: ");
        Integer numero2 = solicitarNumero();

        System.out.println("Ingress the three number: ");
        Integer numero3 = solicitarNumero();

        calcularPromedio(numero1, numero2, numero3);

    }

    private static void calcularPromedio(Integer numero1, Integer numero2, Integer numero3){
        Integer sumatoria = numero1 + numero2 + numero3;
        Double valorPromedio = Double.valueOf(sumatoria) / 3;
        System.out.println("El valor del promedio para los tres numero es: " + valorPromedio);
    }
    private static Integer solicitarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
}

import java.util.Scanner;

public class Equacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float a = scan.nextFloat();
        scan.close();
        Double resultado = Math.abs(-7.0 / a);
        resultado = Math.sqrt(resultado);
        System.out.printf("%.2f", resultado);

    }
}

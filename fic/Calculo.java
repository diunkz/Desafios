import java.util.Scanner;

public class Calculo {
    public int num1, num2, num3;

    public Calculo() {

    }

    public Calculo(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int produto() {
        return this.getNum1() * this.getNum2() * this.getNum3();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculo calc = new Calculo();
        int entrada = scan.nextInt();
        calc.setNum1(entrada);
        entrada = scan.nextInt();
        calc.setNum2(entrada);
        entrada = scan.nextInt();
        calc.setNum3(entrada);

        scan.close();

        System.out.println(calc.produto());

    }

}
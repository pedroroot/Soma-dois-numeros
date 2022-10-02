import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double numero, numero1, numero2;
        Scanner console = new Scanner(System.in);
        System.out.println("Digite um numero. ");
        numero = console.nextDouble();
        System.out.println("Digite outro numero,");
        numero1 = console.nextDouble();
        numero2 = numero + numero1;
        System.out.println("A soma dos dois numeros é : " + numero2);
        console.close();
    }
}

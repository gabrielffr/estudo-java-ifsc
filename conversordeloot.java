import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

    Scanner leitor = new Scanner(System.in);

        double ouro;

        System.out.println("Qual a quantidade de ouro você possui no inventário?");
        ouro = leitor.nextDouble();

        double pratas = ouro * 50;

        System.out.println("Você possui o equivalente a: " + pratas + " pratas");

        leitor.close();

    }
}

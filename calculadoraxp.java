import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

    Scanner leitor = new Scanner(System.in);

        double primeira;
        double segunda;

        System.out.println("Quanto de XP você recebeu pela primeira missão?");
        primeira = leitor.nextDouble();

        System.out.println("Quanto de XP você recebeu pela segunda missão?");
        segunda = leitor.nextDouble();

        double sum = primeira + segunda;

        System.out.println("O total de XP que você recebeu pelas duas missões foi de: " + sum);

        leitor.close();

    }
}

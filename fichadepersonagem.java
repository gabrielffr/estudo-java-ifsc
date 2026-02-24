import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner leitor = new Scanner(System.in); 
    
    System.out.println("Qual o nome do seu herói?");
    String nome = leitor.nextLine();

    System.out.println("Qual a sua classe?");
    String classe = leitor.nextLine();

    System.out.println("Qual o seu nível atual?");
    int nivel = leitor.nextInt();

    System.out.println("Seja bem vindo(a)! " + nome + ", parabéns por ser " + classe + ". Ótimo nível, " + nivel + "! Isso é uma ótima conquista! ");

    leitor.close();

    }
}
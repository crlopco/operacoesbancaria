import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroExato = 10;

            System.out.println("Digite seu palpite ");
            int palpite = leitura.nextInt();        
     
        if (palpite == numeroExato) {
            System.out.println("O número informado é igual a 10");
        } el10se {
            System.out.println("O número informado é diferente de 10");
        }
    }
}
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int [] vetor = new int [3];
        int soma = 0, qtd=0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = ler.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (vetor [i] > 30){
                qtd++;
                soma += vetor[i];
            }
        }

        System.out.println("A quantidade de numeros maiores que 30 é: " +qtd);
        System.out.println("A soma dos valores maior que 30 é: " +soma);


    }
}

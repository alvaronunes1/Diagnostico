import java.util.Random;

public class Questao1 {
    public static void main(String[] args) {

        Random randomico = new Random();

        int [] vetor = new int [8];
        int somaTrinta = 0, qtd=0, somaTotal = 0;

        for (int i = 0; i < 8; i++)
            vetor[i] = randomico.nextInt(99);

        for (int i = 0; i < 8; i++) {
            if (vetor [i] > 30){
                qtd++;
                somaTrinta += vetor[i];
            }
            somaTotal+= vetor[i];
        }

        System.out.println("A quantidade de numeros maiores que 30 é: " +qtd);
        System.out.println("A soma dos valores maior que 30 é: " +somaTrinta);
        System.out.println("A soma de todos os valores do vetor: " +somaTotal);

        System.out.println("Números dos vetores: ");
        for(int num:vetor)
            System.out.print(num + " ");


    }
}

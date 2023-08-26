import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int [][] estoque = new int[4][5];

        boolean continuar = true;

        while (continuar){
            System.out.println("Digite qual armario você deseja selecioanr: (0 - 1 - 2 - 3 - 4) ");
            int armario = ler.nextInt();
            System.out.println("Digite qual prateleira você deseja selecioanr: (0 - 1 - 2 - 3) ");
            int prateleira = ler.nextInt();

            if(armario >=0 && armario < 5 && prateleira >=0 && prateleira <4){
                if(estoque[prateleira][armario] <10){
                    estoque[prateleira][armario]++;
                    System.out.println("Caixa adicionado com sucesso");
                }else {
                    System.out.println("Espaço insuficiente no armário");
                }
                } else {
                System.out.println("Armário ou prateleira inválida");
            }

            System.out.println("Deseja continuar  (true/false)");
            continuar = ler.nextBoolean();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(estoque[i][j] + "\t");
                }
                System.out.println();

            }
        }
    }
}

import java.util.Scanner;

public class Lista63 {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        int bim = 4;
        double soma = 0;
        double notas[] = new double[bim];
        // coleta de notas
        for (int i = 0; i <= (bim - 1); i++) {
            System.out.println("insira a nota do " + (i + 1) + "º bimestre");
            notas[i] = scanner.nextDouble();
        }
        // saida de media das notas
        for (int i = (bim - 1); i >= 0; i--) {
            soma += notas[i];
            System.out.println("notas bimestre " + notas[i]);

        }
        System.out.println("media das notas " + (soma / bim));
    }
}

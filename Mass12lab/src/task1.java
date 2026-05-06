import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите N (строки): ");
        int N = in.nextInt();
        System.out.print("Введите M (столбцы): ");
        int M = in.nextInt();

        int[][] B = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = 5 * (j + 1);
            }
        }

        System.out.println("Сформированная матрица:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%5d", B[i][j]);
            }
            System.out.println();
        }
    }
}

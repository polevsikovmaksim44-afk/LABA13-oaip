import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите N (строки): ");
        int N = in.nextInt();
        System.out.print("Введите M (столбцы): ");
        int M = in.nextInt();
        System.out.print("Введите D (множитель геометрической прогрессии): ");
        int D = in.nextInt();

        int[][] B = new int[N][M];

        System.out.println("Первая строка (сгенерирована случайно):");
        for (int j = 0; j < M; j++) {
            B[0][j] = r.nextInt(-15, 16);
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = B[i - 1][j] * D;
            }
        }

        System.out.println("Сформированная матрица:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%6d", B[i][j]);
            }
            System.out.println();
        }
    }
}

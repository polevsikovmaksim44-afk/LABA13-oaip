//laba 13 Задание 4
import java.util.Random;
import java.util.Scanner;

public class Mass {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int N = in.nextInt();
        System.out.print("M=");
        int M = in.nextInt();

        int[][] B = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = random.nextInt(2, 5);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%5d", B[i][j]);
            }
            System.out.println();
        }


    }
}

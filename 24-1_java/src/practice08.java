
import java.util.Random;

public class practice08 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.print("(" + (i + 1) + "차 실행) ");
            for (int j = 0; j < 10; j++) {
                int randomNumber = random.nextInt(100);
                System.out.print(randomNumber);
                if (j != 9) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

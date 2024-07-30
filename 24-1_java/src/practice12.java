import java.util.Scanner;

public class practice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N;

        while (true) {
            System.out.print("정수를 입력하세요: ");
            N = sc.nextInt();

            if (N <= 0) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            } else {
                break;
            }
        }

        int count = 0; // 출력된 숫자의 개수
        
        for (int i = 1; i <= N; i++) {
            if (i % 5 != 0) { // 5의 배수가 아닌 경우만 출력
                System.out.print(i + " ");
                count++;

                // 한 줄에 7개씩 출력되도록
                if (count % 7 == 0) {
                    System.out.println();
                }
            }
        }

        sc.close();
    }
}

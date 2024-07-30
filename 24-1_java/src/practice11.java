import java.util.Scanner;

public class practice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        int count =0;

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count+=1;
                    
                 
                }
            }

            if (count==2) {
                System.out.println("입력된 숫자 " + number + "은 소수입니다.");
            } else {
                System.out.println("입력된 숫자 " + number + "은 소수가 아닙니다.");
            }

            break;
        }

        scanner.close();
    }
}

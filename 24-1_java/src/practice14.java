import java.util.Random;
import java.util.Scanner;

public class practice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

 
      
         String hand[]={"바위","보","가위"};
         
         int x =random.nextInt(3);
         String computer = hand[x];
 

        // 사용자의 선택 입력 받기
        System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");
        String userChoice = sc.next();

        // 컴퓨터와 사용자의 선택 출력
        System.out.println("컴퓨터의 생성: " + computer);
        System.out.println("사용자의 선택: " + userChoice);

        // 가위바위보 승패 결정
        if (userChoice.equals(computer)) {
            System.out.println("비겼습니다.");
        } else if ((userChoice.equals("가위") && computer.equals("보")) ||
                   (userChoice.equals("바위") && computer.equals("가위")) ||
                   (userChoice.equals("보") && computer.equals("바위"))) {
            System.out.println("사용자가 이겼습니다.");
        } else {
            System.out.println("컴퓨터가 이겼습니다.");
        }

        sc.close();
    }
}

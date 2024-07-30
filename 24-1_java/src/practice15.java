import java.util.Random;
import java.util.Scanner;

public class practice15 {
	
	
	public static int whoswin(String com, String you) {
        if (you.equals(com)) {
            return 0;
        } else if ((you.equals("가위") && com.equals("보")) ||
                   (you.equals("바위") && com.equals("가위")) ||
                   (you.equals("보") && com.equals("바위"))) {
            return 1;
        } else {
            return -1;
        }

	}
	

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 컴퓨터의 선택을 문자열로 변환
        String hand[]={"바위","보","가위"};
        
        int x =random.nextInt(3);
        String computer = hand[x];

        // 사용자의 선택 입력 받기
        System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");
        String userChoice = sc.next();

        // 컴퓨터와 사용자의 선택 출력
        System.out.println("컴퓨터의 선택: " + computer);
        System.out.println("사용자의 선택: " + userChoice);

        // 가위바위보 승패 결정
        int result = whoswin(computer, userChoice);
        if (result == -1) {
            System.out.println("컴퓨터가 이겼습니다.");
        } else if (result == 1) {
            System.out.println("사용자가 이겼습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
        sc.close();

	}

}

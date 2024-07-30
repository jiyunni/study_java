import java.util.Random;
import java.util.Scanner;

public class practice16 {
	
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
        
		int win=0;
		int lose=0;
		int winwin=0;
		
		while(true) {

			System.out.println("현재 당신의 전적: "+ win +"승 "+lose+"패 "+winwin+"무");
			

	        // 컴퓨터의 선택을 위한 난수 생성
	        int computerChoice = random.nextInt(3); // 0부터 2까지의 난수 생성

	        // 컴퓨터의 선택을 문자열로 변환
	        String computer;
	        
	        switch (computerChoice) {
	            case 0:
	                computer = "가위";
	                break;
	            case 1:
	                computer = "바위";
	                break;
	            case 2:
	                computer = "보";
	                break;
	            default:
	                computer = "오류";
	        }

	        // 사용자의 선택 입력 받기
	        System.out.print("당신의 입력 (가위/바위/보/그만): ");
	        String userChoice = sc.next();
	        
	        if(userChoice.equals("그만")) {
	        	System.out.println("프로그램을 종료합니다.");
	        	break;
	        }

	        // 컴퓨터와 사용자의 선택 출력
	        System.out.println("컴퓨터의 선택: " + computer);
			
	        
	        int result = whoswin(computer, userChoice);
	        if (result == -1) {
	            System.out.println("컴퓨터가 이겼습니다.");
	            lose+=1;
	        } else if (result == 1) {
	            System.out.println("사용자가 이겼습니다.");
	            win +=1;
	        } else {
	            System.out.println("비겼습니다.");
	            winwin+=1;
	        } 
	        
	        
		}
		
		sc.close();
	}

}

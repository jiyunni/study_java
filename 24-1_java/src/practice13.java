import java.util.Scanner;
public class practice13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String su = "";
        String hee = "";

		while(true) {
			System.out.print("철수의 입력: ");
			su = sc.next();
			
			if(su.equals("가위") || su.equals("바위") || su.equals("보"))
				break;
			else
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");

		}
		
		
		while(true) {
			System.out.print("영희의 입력: ");
			hee = sc.next();
			
			if(hee.equals("가위") || hee.equals("바위") || hee.equals("보"))
				break;
			else
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}
		
		
		if(hee.equals(su))
			System.out.println("비겼습니다.");
		
		else if(hee.equals("가위")&&su.equals("보")||
				hee.equals("보")&&su.equals("바위")||
				hee.equals("바위")&&su.equals("가위"))
			System.out.println("영희가 이겼습니다.");
		else
			System.out.println("철수가 이겼습니다.");
		
		sc.close();
			
		
		
	}

}

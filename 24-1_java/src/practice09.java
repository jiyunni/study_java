import java.util.Scanner;

public class practice09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		//int number;
		
		while (true) {
			System.out.print("숫자를 입력하세요: ");
			int number = scanner.nextInt();
			
			if(number==0)
				break;
			else if(number <0)
				System.out.print("음수가 입력되었습니다. 다시 입력하세요.");
			else
				sum += number;
			
	
		}
        System.out.println("입력된 숫자들의 합은 " + sum + "입니다.");
        
        scanner.close();

	}

}

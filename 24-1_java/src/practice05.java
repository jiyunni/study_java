import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	       System.out.print("정수를 입력하세요: ");
	        int number = scanner.nextInt();
	        
	        int num;
	        
	        if(number<0)
	        	num = -number;
	        else
	        	num = number;
	        
	        
	        System.out.println("입력한 정수 " + number + "절대값은 "+ num +"입니다.");

	        scanner.close();

	}

}

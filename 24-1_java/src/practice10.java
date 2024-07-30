import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int number;
		int num =0;
		
		while (true) {
			System.out.print("숫자를 입력하세요: ");
			number = scanner.nextInt();
			
			if(number==0)
				break;
			else if(number <0)
				System.out.print("음수가 입력되었습니다. 다시 입력하세요.");
			else {
				sum += number;
				num++;
				}
			//num+=1;
			
	
		}
        System.out.println("입력된 숫자들의 합은 " + sum + "입니다.");
        System.out.println("입력된 숫자들 중에서 0보다 큰 숫자의 개수는 " + num + "입니다.");
        
		double avg = (double)sum/num;
        System.out.println("입력된 숫자들의 평균은 " + avg + "입니다.");
		

        
        scanner.close();

	}

}
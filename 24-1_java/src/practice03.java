import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("인치 값을 입력하세요: ");
        double inch = scanner.nextDouble();
        
        // 인치를 센티미터로 변환
        double centimeter = 2.54 * inch;
       

        // 센티미터를 정수형으로 변환하여 출력
        int centi = (int) centimeter;
        
        //int c = int(2.54*i);
        
        
        System.out.print("해당하는 센티미터 값은 "+ centi + "입니다.");
        
        scanner.close();

	}

}

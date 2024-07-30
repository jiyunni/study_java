import java.util.Scanner;

public class practice02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 화씨 온도 입력 받기
        System.out.print("화씨 온도를 입력하세요: ");
        int fahrenheit = scanner.nextInt();

        // 화씨를 섭씨로 변환
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        double c = (double)5/9 *(fahrenheit-32); 

        // 결과 출력
        System.out.println("해당하는 섭씨 온도는 " + celsius + "입니다.");
        System.out.println("해당하는 섭씨 온도는 " + c + "입니다.");


        scanner.close();
    }
}

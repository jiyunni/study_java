import java.util.Random;
import java.util.Scanner;

public class practice18 {
	
	
	public static int searchArray(int[]array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // 값을 찾으면 해당 인덱스 반환
            }
        }
        return -1; // 값을 찾지 못하면 -1 반환
	}
	public static void printArray(int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print("\t"); 

        }
        System.out.println(); // 한 줄에 모든 배열 요소 출력 후 개행
	}

	public static void main(String[] args) {
		
		Random random = new Random();
		int array[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(101); // 0부터 100까지의 난수 생성
            array[i]=randomNumber;
        }
        
		practice18.printArray(array);
		System.out.println("찾고 싶은 숫자를 입력하세요: ");
		int key = sc.nextInt();
		
		
        // searchArray 메소드를 사용하여 해당 숫자가 배열에 있는지 확인하고 인덱스 출력
        int index = searchArray(array, key);
        if (index != -1) {
            System.out.println("입력한 숫자 " + key + "는 배열의 " + index + "번 자리에 있습니다.");
        } else {
            System.out.println("입력한 숫자 " + key + "는 배열에 없습니다.");
        }
        
		sc.close();

	}

}

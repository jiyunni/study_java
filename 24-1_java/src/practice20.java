import java.util.Random;
import java.util.Scanner;

public class practice20 {
	
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
        Scanner sc = new Scanner(System.in);
        int array[] = new int[3];
        
        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(9) + 1; // 1부터 9까지의 난수 생성
        }
        
        printArray(array);
        
        
        int userArray[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "번째 숫자 입력 : ");
            userArray[i] = sc.nextInt();
        }
        
        
        int exactCount = 0;
        int valueCount = 0;
        
        for (int i = 0; i < 3; i++) {
            if (array[i] == userArray[i]) {
                exactCount++;
            } else if (searchArray(array, userArray[i]) != -1) {
                valueCount++;
            }
        }

        System.out.println("자리와 값이 모두 같은 숫자 : " + exactCount + "개");
        System.out.println("자리는 다르고 값만 같은 숫자 : " + valueCount + "개");

        sc.close();

	}

}

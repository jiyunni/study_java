import java.util.Random;

public class practice19 {
	
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
		int array[] = new int[5];
		int count = 0;
		
		while(true) {
			count++;
	        for (int i = 0; i < 5; i++) {
	            int randomNumber = random.nextInt(101); // 0부터 100까지의 난수 생성
	            array[i]=randomNumber;
	        }
	        System.out.println("("+count+"차 실행)");
	        printArray(array);
	        
	        int index = searchArray(array, 100);
	        
	   
	        if(index!=-1) {
	        	System.out.println(count + "차 실행에서 난수 100이 발생했으므로 프로그램을 종료합니다.");
	                break;
	        	}
	        else
	        	continue;
	    

		}


	}

}

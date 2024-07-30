import java.util.Random;

public class practice21 {

	public static void main(String[] args) {
		Random random = new Random();
		int Arrayint[] = new int[10];
		int sum=0;
		
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100)+1; // 1부터 100까지의 난수 생성
            Arrayint[i]=randomNumber;
        }
        
        for(int number:Arrayint ) {
        	System.out.print(number +" ");
        }
        
        System.out.println();
        
        for(int i=9; i>=0; i--) {
        	System.out.print(Arrayint[i]+" ");
        	
        }
        
        for(int number:Arrayint) {
        	sum+=number;
        }
        System.out.println();
        System.out.println("난수들의 총합: "+sum);
        System.out.println("난수들의 평균: "+(double)sum/10);
	}

}

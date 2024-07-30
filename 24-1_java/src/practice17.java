import java.util.Random;

public class practice17 {

	public static void main(String[] args) {
		Random random = new Random();
		int Arrayint[] = new int[10];
		int sum=0;
		
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(101); // 0부터 100까지의 난수 생성
            Arrayint[i]=randomNumber;
        }
        
        for(int i=0; i<Arrayint.length; i++) {
        	System.out.print(Arrayint[i]+"\t");
        	sum+=Arrayint[i];
        }
        
        System.out.println("");
        
        //for(i=s.length-1; i>=0; i--)
        for(int i=9; i>=0; i--) {
        	System.out.print(Arrayint[i]+"\t");
        }
        
        System.out.println("");
        
        double avg = (double) sum / 10;
		
		System.out.println("난수들의 총합: "+sum);
		System.out.println("난수들의 평균: "+avg);

	}

}

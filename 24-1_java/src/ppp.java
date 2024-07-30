
public class ppp {
	
	public static void main(String[] args) {
		
		int array[][]= new int[10][];
		
		for(int i=0; i<array.length; i++) {
			array[i]= new int[i+1];
			for(int j=0; j<=i; j++) {
				array[i][j]=j;
			}
					
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(array[i][j]+"");
			}
			System.out.println();
		}
	

	}

}

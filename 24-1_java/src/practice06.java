
public class practice06  {
    public static void main(String[] args) {
        // 구구단 표 출력
        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + " ");
                System.out.print("\t");
            }
            System.out.println();
          
        }
        System.out.println();
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + " ");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

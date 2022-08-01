import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇줄을 그릴것인가요?");
		int a = sc.nextInt();
		
		// 5 - > 2 
		// 3 - > 1 
		int j;
		int k = 2;
		for(int i = 0 ; i<a;i++ ) {
			for(j=0; j < a; j++) {		
				if(i<=a-3) {
					if ((j<=a-3+i)&&(j>=a-3-i)) {
						System.out.print("O");
					}
					else {
						System.out.print("X");
					}
				}
				else {
					if ((j<=a-3+i-k)&&(j>=a-3-i+k)) {
						System.out.print("O");
					}
					else {
						System.out.print("X");
					}
					k = k-2;
				}
				
			}
			System.out.println();
		}
	}		
}


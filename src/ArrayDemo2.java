import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int [] array = new int[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i <4 ; i++) {
			System.out.printf("%d번째 숫자를 넣으십시오\t",i+1);
			array[i] = sc.nextInt();
		}
		for(int i = 0 ; i <4 ; i++) {
			System.out.print("array[" +(i+1)+"] = " + array[i]+"\t");
			
		}
		
	}
}

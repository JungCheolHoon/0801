import java.util.Scanner;
public class Practice3 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("얼마를 넣으셨습니까?");
		int money = sc.nextInt();
		
		int [] wons = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		int [] moneys ;	//몇장씩 가지고 있나
		moneys = new int[10];
		
//		int [] rest ;	// 나머지값
//		rest = new int[10];
		
//		for(int i = 0 ; i <10 ; i++) {
//			rest[i] = money % wons[i];
//		}
		
		
//		for(int i = 1 ; i<10 ; i++) {
//			moneys[0] = money/wons[0];
//			moneys[i] = rest[i-1]/wons[i];
//		}
		
//		for(int i = 0 ; i <10 ; i++) {
//			System.out.printf("%d원 : %d\n", wons[i],moneys[i]);
//		}
		for(int i =0; i <10; i++) {
			moneys[i] = money/wons[i];
			money = money%wons[i];
		}
		for(int i = 0 ; i <10 ; i++) {
			System.out.printf("%d원 : %d\n", wons[i],moneys[i]);
		}
	}
}

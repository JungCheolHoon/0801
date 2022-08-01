import java.util.Scanner;
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int su1 = sc.nextInt();
		int [] su = new int[99];
		
		for(int i = 2 ; i<su.length+2;i++){
			while(su1%i==0) {
				su[i-2] ++;
				su1 = su1/i;
			}
		}
		int cnt2 =0;
		for(int i =0 ;i <su.length;i++) {
			for(int j = 0; j<su[i];j++) {
				System.out.print(i+2+"\t");
				cnt2++;
				if(cnt2==3) {
					System.out.println();
					cnt2=0;
				}
			}
		}
		System.out.println();

		
//		System.out.printf("1의 인수 : %d\n", (su1%2) );
//		for(int i=2 ; i<su.length+2;i++) {
//			System.out.printf("%d의 인수 : %d\n",i,su[i-2]);
//		}
		
		int cnt = 0;
		for(int i=0 ; i<su.length;i++) {
			if(su[i] >=1) {
				cnt++;
			}
		}
		
		int a=0;
		if(cnt==1) {
			for(int i=0 ; i<su.length;i++) {
				if(su[i]==1) {
					a= i+2;
				}
			}
			System.out.printf("소수가 %d로 맞습니다",a);
		}
		else
			System.out.println("소수가 아닙니다");
		
	}
}

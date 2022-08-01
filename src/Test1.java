
public class Test1 {
	public static void main(String[] args) {
		int [] su = {10,50,44,56,29,30,9,48,84,92};
		int [] up = su;
		int [] down = su;
		int sum = 0;
		
		for(int i = 0 ; i < su.length ; i ++) {
			sum += su[i];
		}
		
		double avg = (double)sum / su.length;
		int max =0;
		int min = 0;
		
		for(int i = 0 ; i <su.length-1 ; i ++) {
			for(int j = 0 ; j  <su.length-1; j++) {
				if(su[j] >su[j+1]) {
					max = su[j];
				}
				else {
					max = su[j+1];
				}
				if(su[j]>su[j+1]) {
					min = su[j+1];
				}
				else {
					min = min;
				}
			}
		}
		System.out.printf("합계 = %d , 평균 = %.1f , 최대값 = %d, 최소값 = %d\n\n",sum,avg,max,min);
		
		for(int i = 0 ; i <up.length-1 ; i ++) {
			for(int j = 0 ; j  <up.length-1; j++) {
				int temp = up[j];
				if(up[j] >up[j+1]) {
					temp = up[j+1];
					up[j+1] = up[j];
					up[j] = temp;
				}
			}
		}
		
		System.out.print("오름차순 정렬: \t");
		for(int su1 : up) {
			System.out.printf("%d\t",su1);
		}
		System.out.println("\n");
		
		for(int i = 0 ; i <down.length-1 ; i ++) {
			for(int j = 0 ; j  <down.length-1; j++) {
				int temp = down[j];
				if(down[j] <down[j+1]) {
					temp = down[j+1];
					down[j+1] = down[j];
					down[j] = temp;
				}
			}
		}
		
		System.out.print("내림차순 정렬: \t");
		for(int su1 : down) {
			System.out.printf("%d\t",su1);
		}
		
	}
}

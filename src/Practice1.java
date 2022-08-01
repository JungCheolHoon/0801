import java.util.*;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		
		int hour = num / 3600;
		int min = (num - hour*3600)/60;
		int second = num - hour*3600 - min*60;
		
		System.out.println(num + "초는 " + hour+"시간 " +min +"분 "+second + "초입니다.");
	}
}

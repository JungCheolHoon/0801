
public class ArrayDemo9 {
	public static void main(String[] args) {
		double [] original = {78.2 , 56.9 , 43.5};
		double [] target = {172.8, 185.4, 162.9, 152.1};
		
		target[0] = original[1];		// 값복사
		target = original;				// 주소복사
	
	}
}

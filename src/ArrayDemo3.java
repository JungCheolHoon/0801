
public class ArrayDemo3 {
	public static void main(String[] args) {
//		배열의 정수형 초기값
//		int [] array = new int[4];
//		for(int i = 0 ; i < array.length ; i++) {
//			System.out.printf("array[%d] = %d\t",i,array[i]);
//		}
		
//		실수형
//		double [] array = new double[4];
//		for(int i = 0 ; i < array.length ; i++) {
//			System.out.printf("array[%d] = %f\t",i,array[i]);
//		}
		
//		문자형 널값, \0 , \u0000
//		char [] array = new char[4];
//		for(int i = 0 ; i < array.length ; i++) {
//			System.out.printf("array[%d] = %c\t",i,array[i]);
//		}
//	}
	
//		//boolean 형 : false
//		boolean [] array = new boolean[4];
//		for(int i = 0 ; i < array.length ; i++) {
//			System.out.printf("array[%d] = %b\t",i,array[i]);
//		}
		
		//참조형 : 널번지, null
		String [] array = new String[4];
		for(int i = 0 ; i < array.length ; i++) {
			System.out.printf("array[%d] = %s\t",i,array[i]);
		}
		
	}
}

import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {

//		int [] array = new int[4];
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0 ; i <4 ; i++) {
//			System.out.printf("%d번째 숫자를 넣으십시오\t",i+1);
//			array[i] = sc.nextInt();
//		}
//		for(int i = 0 ; i <4 ; i++) {
//			System.out.print("array[" +(i+1)+"] = " + array[i]+"\t");
//			
//		}
		
		Student [] array = new Student[2];
		array[0]  = new Student();
		array[1] = new Student();
//		for(int i=0 ; i<2 ; i++) {
//			System.out.println(array[i]);
//		}
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i<2 ; i++) {
			System.out.printf("%d번째 학생의 이름 : ",(i+1));
			array[i].name = sc.nextLine();
			System.out.printf("%d번째 학생의 나이 : ",(i+1));
			array[i].age = sc.nextInt();
			sc.nextLine();
		}
	
		for(int j = 0; j<2; j++) {
			System.out.printf("%d번째 학생의 이름 : %s\n",(j+1),array[j].name);
			System.out.printf("%d번째 학생의 나이 : %d\n",(j+1),array[j].age);
		}
	
	
	}
}

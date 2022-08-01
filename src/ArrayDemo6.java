import java.util.Scanner;
public class ArrayDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student jimin = new Student();
		
		System.out.print("Name : ");
		jimin.name = sc.nextLine();
		System.out.print("Hakbun : ");
		jimin.hakbun = sc.nextLine();
		System.out.print("Korean : ");
		jimin.kor = sc.nextInt();
		sc.nextLine();
		System.out.print("English : ");
		jimin.eng = sc.nextInt();
		sc.nextLine();
		System.out.print("Math : ");
		jimin.mat = sc.nextInt();
		sc.nextLine();

		jimin.calcTot();
		jimin.calcAvg();
		jimin.calcGrade();
		jimin.calcCall();
		
//		jimin.avg = jimin.tot/3.;
//		jimin.tot = jimin.kor + jimin.eng + jimin.mat;
		
//		if(jimin.avg >=90) {
//			jimin.grade = 'A';
//		}else if(jimin.avg >=80){
//			jimin.grade = 'B';
//		}else if(jimin.avg >=70){
//			jimin.grade = 'C';
//		}else if(jimin.avg >=60){
//			jimin.grade = 'D';
//		}else {
//			jimin.grade = 'F';
//		}
		
//		System.out.printf("%s(%s) \t %d \t %d \t %d \t %d \t %.2f \t %c \n",jimin.name,jimin.hakbun,jimin.kor,jimin.eng,jimin.mat,jimin.tot,jimin.avg,jimin.grade);
		
	}
}

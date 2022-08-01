
public class ArrayDemo1 {
	public static void main(String[] args) {
		Student [] array = new Student[3] ;
		array[0] =  new Student();
		array[0].name = "한지민";
		array[0].age = 26;
		
		array[1] =  new Student();
		array[1].name = "김철수";
		array[1].age  = 36;
		
		array[2] =  new Student();
		array[2].name = "이영희";
		array[2].age = 46;
		int sum = 0 ;
		for(int i = 0 ; i <3 ; i++) {
			System.out.printf("%d번째 학생의 이름 : %s\t",i,array[i].name);
			System.out.printf(", 나이 : %d\n",array[i].age);
			sum += array[i].age;
		}
		System.out.println("평균나이= " + sum/3);
	}
}

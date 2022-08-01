
public class Student {
	String name, hakbun;	//member variable , instance variable 
	int kor,eng,mat,tot;
	double avg;
	char grade;

	void calcTot() {				//member method , instance method
		tot = kor + eng + mat;
	}
	void calcAvg(){
		avg = tot/3;
	}
	void calcGrade(){
		if(avg >=90) {
			grade = 'A';
		}else if(avg >=80){
			grade = 'B';
		}else if(avg >=70){
			grade = 'C';
		}else if(avg >=60){
			grade = 'D';
		}else {
			grade = 'F';
		}
		
	}
	void calcCall() {
		System.out.printf("%s(%s) \t %d \t %d \t %d \t %d \t %.2f \t %c \n",name,hakbun,kor,eng,mat,tot,avg,grade);
	}
}

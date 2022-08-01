import java.util.*;
public class ArrayDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제품이 몇개인가요?");
		int count = sc.nextInt();
		sc.nextLine();
		
		Product [] product = new Product[count];
		
		for(Product duct:product) {			//product는 배열선언 , duct는 배열내 객체를 선언(인스턴스화)
			duct = new Product();
			System.out.print("제품명을 입력하세요");
			duct.name = sc.nextLine();
			System.out.print("가격을 입력하세요");
			duct.price = sc.nextInt();
			sc.nextLine();
			System.out.print("색상을 입력하세요");
			duct.color = sc.nextLine();
			
			duct.display();
		}
		
	}
}

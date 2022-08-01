import java.util.Scanner;

public class ArrayDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product [] product = new Product[3];
		
		product[0] = new Product();
		product[1] = new Product();
		product[2] = new Product();
		
		for(int i=0;i<product.length;i++) {
			System.out.print("상품명을 입력하세요");
			product[i].name = sc.nextLine();
			System.out.print("상품가격을 입력하세요");
			product[i].price = sc.nextInt();
			sc.nextLine();
			System.out.print("상품색상을 입력하세요");
			product[i].color = sc.nextLine();
		}
		System.out.println("제품명\t제품가격\t제품색상");
		for(int i = 0 ; i < product.length ;i++) {
			
			System.out.println(product[i].name +"\t" + product[i].price +"원\t"+product[i].color);
		}
				
		
	}
}

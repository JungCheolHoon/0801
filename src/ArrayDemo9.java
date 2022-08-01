
public class ArrayDemo9 {
	public static void main(String[] args) {
//		double [] original = {78.2 , 56.9 , 43.5};
//		double [] target = {172.8, 185.4, 162.9, 152.1};
//		
//		target[0] = original[1];		// 값복사
//		target = original;				// 주소복사
	
//		int original = 5;
//		int target = 9;
//		System.out.printf("Before original = %d, Before target = %d\n",original,target);
//		int k = original;
//		original = target;
//		target = k;
//		System.out.printf("After original = %d, After target = %d\n",original,target);

//		Product [] pencil = new Product[3];
//		pencil[0] = new Product();
//		pencil[1] = new Product();
//		pencil[2] = new Product();
//		
//		pencil[0].name = "연필"; pencil[0].price = 200; pencil[0].color = "Black";
//		pencil[1].name = "마우스"; pencil[1].price = 50000 ; pencil[1].color = "Silver";
//		
//		System.out.println("Before");
//		pencil[0].display();
//		pencil[1].display();
//		
//		pencil[2] = pencil[0];
//		pencil[0] = pencil[1];
//		pencil[1] = pencil[2];
//		
//		System.out.println("After");
//		pencil[0].display();
//		pencil[1].display();
		
//		Bubble Sorting
		int [] original = {4,6,2,3,5,1,6,8,9,3,2};
		System.out.println("Before Sorting");
		for(int su : original) {
			System.out.printf("%d\t",su);
		}
		for(int i = 0 ; i < original.length -1 ; i++) {
			for(int j = 0; j <original.length-1; j ++) {
				if(original[j]>original[j+1]) {
					int temp = original[j];
					original[j] = original[j+1];
					original[j+1] = temp;
				}
			}
		}
		System.out.println("\nAfter Sorting");
		for(int su : original) {
			System.out.printf("%d\t",su);
		}
	}
}

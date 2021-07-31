package Starpartterns;

public class Trianglepattren {

	public static void main(String[] args) {

		//top to bottom
		for (int j=0; j<=5; j++) {
			
			for (int j2=0; j2<=j; j2++) {
				System.out.print("*");
			}
			System.out.println(j);
		}
		
		//bottom to top
		for (int i=0; i <=5; i++) {
			
			for (int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//second model pattern
		
		 for (int i=1; i<=5; i++) {
			for (int j=4;j>=i; j--) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		 
		 
		 for (int i=1; i<=15; i++) {
				for (int j=15;j>=i; j--) {
					System.out.print(" ");
				}
				for (int k=1; k<=i; k++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		 
		 
		int alpha=65;
		 for (int i=0; i<=5; i++) {
				for (int j=0;j<=i; j++) {
					System.out.print((char)(alpha+j)+ " ");
				}
				System.out.println();
			}
		
		
		
		
		
		
		
		
		
		
	}
}

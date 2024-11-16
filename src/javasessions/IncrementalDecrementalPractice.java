package javasessions;

public class IncrementalDecrementalPractice {

	public static void main(String[] args) {
		
		int i = 11;
		int j = i++ + ++i;
		System.out.println(j);
		
		int a = 11, b = 22, c;
		c = a + b + ++a + b++ + ++a + ++b;
		
		System.out.println("a = "+ a );
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
		
		for(int n=1; n<=50; n++) {
			System.out.println(n);//1
				if(n % 5 == 0) {
					System.out.println("Bye");//Bye
					break;
				}
		}

	}

}

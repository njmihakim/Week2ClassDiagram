import java.util.Scanner;

public class exercise1 {

	public static void main(String [] arg) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integer number :");
		int x = sc.nextInt();

		System.out.println("Enter double number :");
		double y = sc.nextDouble();

		System.out.println("Enter string :");
		String z = sc.next();

		System.out.println("Integer number is :" + x);
		System.out.println("Double number is :" + y);
		System.out.println("String number is :" + z);
		
		sc.close();

	}
}
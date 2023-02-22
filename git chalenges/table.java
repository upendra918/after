import java.util.Scanner;
public class TableOfInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        int n = a*b;
        System.out.println( a+ " x " + b + " = "+ n);
	}

}
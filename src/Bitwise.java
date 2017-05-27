import java.util.Scanner;

public class Bitwise {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter byte values like - '0 0,0 1,1 0,1 1' :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x&y;
		boolean a;
		if(x == 1 && y == 1){
		a = true;
		}
		else
		{ a = false;}
		
		System.out.println("The Bitwise value of x & y is : "+ z);
		System.out.println("The Logical value of x && y is : "+ a);
		
		sc.close();
	}

}

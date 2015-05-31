package Math;

import java.util.Scanner;


public class Sqrt {

	public static void main(String[] args) {
	int a ; 
	int b ; 
	 
	Scanner in = new  Scanner(System.in);
	System.out.println("Enter the number:");
	int t = in.nextInt();
	for(int i = 1 ; i<= t ; i++){
		System.out.println("Enter 2 numbers:");
		a = in.nextInt();
		b = in.nextInt();
		range(a,b);
		}
	in.close();

	}
public static void range(int a, int b) {
	
	
	int x = (int)Math.sqrt(a);
	int y = (int)Math.sqrt(b);
	
	if((x*x == a && y*y == b ) || x==1){
		 System.out.println((y-x)+1);  
	}
	else  System.out.println(y-x); 
	
	}
}


public class Swapping {
	static int add(int a, int b){
//		a = a ^ b;
//		b = b ^ a;
//		a = a ^ b;
		return a+b; 
	}
public static void main(String[] args) {
	int a=10,b=5;
	 a = a ^ b;
	 b = b ^ a;
	 a = a ^ b;
	System.out.println(add(2,5));
	}
}

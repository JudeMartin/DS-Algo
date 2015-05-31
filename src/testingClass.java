
public class testingClass {
public static void main(String[] args) {
	String str = "1234";
	 int a = Integer.parseInt(str);
	 String str1 = "1";
	 int b1= Integer.parseInt(str1);
	 System.out.println(String.valueOf(Integer.toBinaryString(a)));
	 System.out.println(String.valueOf(a));
	 
	 System.out.println(Integer.toBinaryString(a)+Integer.toBinaryString(b1));
	
	 
	 int charCode1 = Integer.parseInt(str, 2);
	 System.out.println(charCode1);

	 //String str = new Character((char)charCode).toString();
	 
	 
	 
	 
  //System.out.println("Hello Word");
	//System.out.println();

}
}

package Strings;

public class stringRotation {

	public static boolean isRotation(String str1, String str2){
	String buffer =  str1+str1;
	if(str1.length()==str2.length() && str1.length()>0){
		return isSubstring(buffer,str2);
		
	}
	return false;
	}
	 public static boolean isSubstring(String a ,String b){
		 if(a.indexOf(b)>0){return true;} else{return false;}
		 
	 }
	public static void main(String[] args) {
		String[][] pairs={{"jude","eduj"},{"waterbottle","lewaterbott"},{"flower","lowerf"}};
		for(String[] a : pairs){
			String word1 = a[0];
			String word2 = a[1];
			boolean is_Rotation = isRotation(word1, word2) ;
			System.out.println(word1+" "+word2+" "+is_Rotation);
		}
		System.out.println(isRotation("Vitamins","aminsVit"));
	}
}

package Strings;

public class stringSpacer {
public static void manipulatedString(char[] str,int length){
	int spacer=0,newlength,i=0;
	
	for(i=0;i<length;i++){
		if(str[i]==' '){
			spacer++;
		}
		
	}
		newlength = length + spacer*2;
		str[newlength]='\0';
		for(i=length-1;i>=0;i--){
			if(str[i]==' '){
				str[newlength -1]='0';
				str[newlength -2]='2';
				str[newlength -3]='%';
				newlength=newlength-3;
			}
		else{
			str[newlength-1]=str[i];
			newlength--;
			}
		
		}
	
	}
	
	public static void main(String[] args) {
			String s = "Good Morning Have a Nice Day";
			char[] arr= new char[s.length() + 5*2+1];
			for(int i = 0; i <s.length();i++){
				arr[i]=s.charAt(i);
			}
			manipulatedString(arr, s.length());
			System.out.println(String.valueOf(arr));
			
			
	}
}

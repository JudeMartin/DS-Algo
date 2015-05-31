package Math;


import java.io.IOException;

/*

public class leaves {
	
	 private static void findsquares(int begin, int end) {
	        int start = (int)Math.sqrt(begin);
	        int count = 0;
	        for (int i = start; ; i ++) {
	            int square = i * i;
	            if (square <= end && square >= begin )
	            	count++;
	            if (square > end)
	                break;
	        }
	        System.out.println(count);
	    }

	    private static void squaresFind() throws IOException {
	        System.out.println("Enter the count");
	        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
	      String numberofinputs = in.readLine();
	       int count = Integer.parseInt(numberofinputs);
	        System.out.println("Enter the two numbers seperated by a spacce ");
	        for (int i = 0; i < count; i++) {
	        	  
	        	  String two_num =in.readLine(); 
	            String[] num = two_num.split(" ");
	            findsquares(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
	        }
	    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		squaresFind();
		
	 }
	}


*/
public class leaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar  = {2,4,5};
		count(10,3,ar);
	}


    private static void count(int leaves, int caterpillars, int[] steps_array) {
        int count = 0;
        for (int i = 1; i <= leaves; i++) {
            boolean covered = false;
            for (int j = 0; j < steps_array.length; j++) {
                if (i % steps_array[j] == 0) {
                	covered = true;
                    break;
                }
            }
            if (!covered) {
            	count++;
            }
        }
        System.out.println("Count: " + count);
    }

}
package warmups;
import java.util.Scanner;
/**
*
* hackerrank.com
*
*/
public class LoveLetterMystery {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=0; i<t; i++){
			String s = in.next();
			System.out.println(output(s));
		}
		in.close();
	}
	
  
    static int output(String s){
    	int count = 0;
    	int l = s.length()/2;
    	for(int i=0; i<l; i++){
    		char begin = s.charAt(i);
    		char end = s.charAt(s.length()-i-1);
    		while(!(begin == end)){
    			if(begin<end) end--;
    			else begin--;
    			count++;
    		}
    	}
    	return count;
    }
}

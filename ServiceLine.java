package warmups;
import java.util.Scanner;
/**
 * hackerrank.com
 *
 */
public class ServiceLine {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt(); //denotes the length of the freeway
		 int t = in.nextInt(); //number of test cases
		
		 int[] nSpace = new int[n];
		 for(int i=0; i<n; i++){
			 nSpace[i] = in.nextInt();
		 }
		 for (int k=0; k<t; k++){
			 int i = in.nextInt();
			 int j = in.nextInt();
			 System.out.println(determine(i, j, nSpace));
		 }
		 in.close();
	 }
	 
	 static int determine(int i, int j, int[] nSpace){
		 int vehicle = 3;
		 for(int n=i; n<=j; n++){
			 if(nSpace[n] < vehicle){
				 vehicle = nSpace[n];
			 } 
		 }
		 return vehicle;
	 }
}

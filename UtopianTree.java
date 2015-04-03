package warmups;
import java.util.Scanner;
/**
 * hackerrank.com
 * @author Nancy
 *
 */
public class UtopianTree {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int n; //number of cycle
		 int t = in.nextInt();
		 for (int i=0; i<t; i++){
			 n = in.nextInt();
			 System.out.println(cycle(n));
		 }
		 in.close();
	 }
	 
	 static int cycle(int n){
		 int grow=1;
		 for(int i=0; i<n; i++){
			 if(i%2==0){
				 grow = grow*2;
			 }
			 else{
				 grow = grow +1;
			 }
		 }
		 return grow;
	 }
}

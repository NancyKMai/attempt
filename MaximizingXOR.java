package warmups;
import java.util.Scanner;
/**
 * hackerrank.com
 * @author Nancy
 *
 */
public class MaximizingXOR {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int l = in.nextInt();//first line
		 int r = in.nextInt();//second line
		 System.out.println(xOR(l,r));
		 in.close();
	 }
	 
	 static int xOR(int l, int r){
		 int high = 0;
		 int value;
		 for(int i=l; i<=r; i++){
			 for(int j=l; j<=r; j++){
				value = i^j;
				 if( value > high)
					 high=i^j;
			 }
		 }
		 return high;
	 }
}

package warmups;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * hackerrank.com
 *
 */
public class LonelyInteger {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 List<Integer> nMount =  new ArrayList<Integer>();
		 for(int i=0; i<n;i++){
			 nMount.add(in.nextInt());
		 }
		 System.out.println(lone(nMount));
		 in.close();
	}

	static int lone(List<Integer> nMount) {
		while(nMount.size()!=1){
			for(int i=0; i<nMount.size(); i++){
				for(int j=i+1; j<nMount.size(); j++){
					if(nMount.get(i)==nMount.get(j)){
						nMount.remove(j);
						nMount.remove(i);
					}
				}
			}
		}
		
		return nMount.get(0);
		
	}
}

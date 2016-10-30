package hw;
import java.util.*;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		double sum =0;
		for(int i =1;i<=n;i++){
			sum +=1f/((2*i-1)*(2*i));
		}
		System.out.println(sum);

	}

}

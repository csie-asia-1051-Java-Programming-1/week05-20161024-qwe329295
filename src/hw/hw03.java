package hw;
import java.util.*;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		double b = 0;
		while(b<=10000){
			a++;
			b = Math.pow(n,a);
			
		}
		System.out.println(a);
	}

}

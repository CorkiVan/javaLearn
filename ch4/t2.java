// created by dragon 
import java.lang.Integer;
public class t2{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++){
			for(int j=n-i;j>0;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
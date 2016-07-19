
public class t1 {
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"x"+j+"="+i*j);
				if(2<=i && j!=i) System.out.print(",");
			}

			System.out.println();
		}
	}
}
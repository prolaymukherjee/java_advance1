import java.util.Scanner;

public class ArrayAssiment {
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		int start,end,sum=0;
		prln("Enter your start Number::::");
		start=myScanner.nextInt();
		prln("Enter your End Number::::::");
		end=myScanner.nextInt();
		for(int i=start;i<=end;i++){
			prln(i);
			sum+=i;
		}
		
		prln("The total number "+sum);
		prln("------------THANK YOU--------------------");
		
		
		

	}
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}

}

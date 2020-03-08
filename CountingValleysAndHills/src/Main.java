//import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//Scanner sc=new Scanner(System.in);
	Hills hills=new Hills();
	int i=hills.hillsCount(10, "UDDUDUDUUD");
	System.out.println("Hills are: "+i);
	Valley valley=new Valley();
	int j=valley.CountValley(10, "UDDUDUDUUD");
	System.out.println("Vallies are: "+j);
	}

}

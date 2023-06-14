import java.util.*;

public class dice{
    public static void main(String args[])
    {
	int[] ran = new int[2];
	Random ran1 = new Random();

	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name ?");
	System.out.print(">");
	String name = sc.nextLine();
	System.out.println("Hello, " + name + "!");
	
	for (int i = 0 ; i < 2; i++){
	    ran[i] = ran1.nextInt(6) + 1;
	}

	int total = ran[0] + ran[1];

	System.out.println("Rolling dics...");
	System.out.println("Die 1:" + ran[0]);
	System.out.println("Die 2:" + ran[1]);
	System.out.println("Total value:" + (ran[0] + ran[1]));
	if(total > 7)
	    System.out.println(name + " won !");
	else
	    System.out.println(name +  " lost !");
    }
}

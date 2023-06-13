import java.util.*;

public class dice{
    public static void main(String args[])
    {
	int[] ran = new int[2];
	Random ran1 = new Random();

	for (int i = 0 ; i < 2; i++){
	    ran[i] = ran1.nextInt(6) + 1;
	}

	System.out.println("Rolling dics...");
	System.out.println("Die 1:" + ran[0]);
	System.out.println("Die 2:" + ran[1]);
	System.out.println("Total value:" + (ran[0] + ran[1]));
    }
}

package Day20_Test.org;

import java.util.Scanner;

public class Reverse_String_Pgm {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String RS = SC.next();
		int index = RS.length() - 1;
		for (int i = index; i >= 0; i--) {
			System.out.print(RS.charAt(i));
		}
		SC.close();
	}

}

import java.util.Scanner;

public class Decimaltooctal {

	public static void main(String[] args) {
		int decnum, rem, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any Decimal Number : ");
        decnum = scan.nextInt();
		
        quot = decnum;
		
        while(quot != 0)
        {
            octnum[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("Equivalent Octal Value of " + decnum + " is :\n");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
	}

}

//Nathan Poquiz
/*csc-321
 * lab #4
 */
import java.util.Scanner;
public class npoquiz4
{
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		int userinput = 0;
		int num = 0;
		while (num == 0)
		{
			System.out.println("Choose your favorite soda.");
                	System.out.println("1. Coca-Cola");
                	System.out.println("2. Pepsi");
                	System.out.println("3. Sprite");
                	System.out.println("4. Fanta");
                	System.out.println("Enter a number from 1-4: ");
                	userinput = keyboard.nextInt();

			if (userinput == 1)
			{
				System.out.println("You chose Coca-Cola.");
				num = 1;
			}
			else if (userinput == 2)
			{
				System.out.println("You chose Pepsi.");
				num = 2;
			}
			else if (userinput == 3)
			{
				System.out.println("You chose Sprite.");
				num = 3;
			}
			else if (userinput == 4)
			{
				System.out.println("You chose Fanta.");
				num = 4;
			}
			else
			{
				System.out.println("Invalid Number.");
			}

		}

	}
}


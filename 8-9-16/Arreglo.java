import java.util.Scanner;

public class Arreglo
{
	public static void main(String args[])
	{
		try
		{
			int [] arr = new int [5];
			int i;
			Scanner  ent = new Scanner(System.in);
			System.out.println("Dame los valores:");

			for(i=0; i<6; i++)
			{
				System.out.println("A["+i+"]: ");
				arr[i]=ent.nextInt();
			}
			
			System.out.println("Matriz:");

			for(i=0; i<6; i++)
			{
				System.out.println(" "+arr[i]);
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\nEl valor ingresado sobrepasa el l\u00edresult[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0];mite del arreglo");
		}
	}	
}
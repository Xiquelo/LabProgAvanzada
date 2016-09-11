package labprogramacion;
import java.util.Scanner;

public class LabProgramacion
{
	public static int Suma(int a, int b)
	{
		int c = 0;
		c = a + b;
		return c;
	}

	public static void main(String[] args)
	{
		int resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Uso de método suma");
		System.out.println("Ingresa un dígito:");
		int x = sc.nextInt();
		System.out.println("Ingresa otro dígito:");
		int y = sc.nextInt();

		resultado = Suma (x,y);

		System.out.println("El resultado es: "+resultado);
	}
}
import java.util.Scanner;
public class Contador{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		int cont;
		System.out.println("----------------------------------");
		System.out.println("-            CONTADOR            -");
		System.out.println("----------------------------------");
		System.out.println("Ingrese un numero para Contar:	");
			cont = sc.nextInt();
			for(int a=1; a<=cont; a++){
		System.out.println("Contando...	"+a);
		}
			System.out.println("                                   ");
			System.out.println("-----------------------------------");
			System.out.println("-   AlfrediHernandez 10-sep-2020  -");
			System.out.println("-----------------------------------");
	}
}
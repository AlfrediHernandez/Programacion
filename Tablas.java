import java.util.*;
public class Tablas{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		int tab,r;
		System.out.println("---------------------------------------------");
		System.out.println("-            TABLAS DE MULTIPLICAR          -");
		System.out.println("---------------------------------------------");
		System.out.println("Ingrese Numero de tabla que desea ver:	     ");
			tab = sc.nextInt();
			for(int a=1; a<=10; a++){
				r = tab * a;
				System.out.println(tab + " X " + a + " = "+r);
		}
		System.out.println("                                             ");
		System.out.println("---------------------------------------------");
		System.out.println("-        AlfrediHernandez 9-sep-2020        -");
		System.out.println("---------------------------------------------");
	}
}
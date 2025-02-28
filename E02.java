import java.util.Scanner;
public class E02{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int numero1, numero2;
		String salida;
	
		Syste.out.print( "Introduzca número entero: ");
		numero1=teclado.nextInt();
		System.out.print( "Introduzca número entero: ");
		numero2=teclado.nextInt();
		
		if (numero1%numero2==0){
			salida=String.format("El %d es divisor del %d\n",numero2,numero1);
		}
		else{
			salida=String.format("El %d NO es divisor del %d\n",numero2,numero1);
		}
		
		System.out.println(salida);
		
		
		
		
	}
	
}

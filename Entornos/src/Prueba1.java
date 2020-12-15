import java.util.Scanner;
public class Prueba1 {
	public static void main(String[] args) {
	    Scanner teclado;
	    teclado = new Scanner(System.in);
	    float numero1;

	    System.out.println("Dime las millas por favor");
	    numero1=teclado.nextFloat();
	    System.out.println("El resultado en metros es el siguiente:");
	    System.out.println(numero1 * 1609);
	 }
}

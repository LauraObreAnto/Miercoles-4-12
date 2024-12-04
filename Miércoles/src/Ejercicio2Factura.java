import java.util.Scanner;

public class Ejercicio2Factura {

	public static void main(String[] args) {
		
	System.out.println("Introduzca el número de factura:");
	Scanner sc=new Scanner(System.in);
	int numero=sc.nextInt();
	System.out.println("Introduzca el importe de la factura:");
	double importe=sc.nextDouble();
	Factura f=new Factura(numero, importe);
	System.out.println("El importe para " +f.getNumero() + " es " + f.getImporte());
	System.out.println("El importe con el IVA al 21% es " + f.masIVA());
	
//	Factura f=new Factura(1234, 100);
//	System.out.println("El importe para " +f.getNumero() + " es " + f.getImporte());
//	System.out.println("El importe con el IVA al 21% es " + f.masIVA());
//	
	

	}

}


public class Factura {
	private int numero;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	private double importe;
	
		
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	public Factura(int numero, double importe) {
		super();
		setNumero(numero);
		setImporte(importe);
	}
	
	public double masIVA () {
		return importe*1.21;
	}
	
}

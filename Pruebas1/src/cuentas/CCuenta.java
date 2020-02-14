package cuentas;

public class CCuenta {
	
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;
	
	public CCuenta()
	{
		
	}
	
	public CCuenta(String nom, String cue, double sal, double tipo) {
	
	  setNombre(nom);
	  cuenta=cue;
	  saldo=sal;
	}
	
	public double estado() {
		
		return saldo;
	}
	
	public void ingresar(double cantidad) throws Exception{
		
		if( cantidad<0)
			throw new Exception("No se puede ingresar una cantidad");
		saldo = saldo + cantidad;
	}
	
	public void retirar(double cantidad)throws Exception{
		
		if(cantidad<=0)
			throw new Exception ("No se puede retirar una cantidad negativa");
		if (estado()< cantidad)
			throw new Exception ("No hay suficiente saldo");
		saldo=saldo - cantidad;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

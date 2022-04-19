package com.liceolapaz.des.rml;

public class Entero implements Numero {
	private int valor;

	public Entero(int valor) {
		super();
		this.valor = valor;
	}
	

	public int getValor() {
		return valor;
	}


	@Override
	public Numero suma(Numero operando) {
		if(operando instanceof Entero) {
			Entero resultado;
			int nuevoValor = this.valor + ((Entero)operando).getValor();
			resultado = new Entero(nuevoValor);
			return resultado;
		}
		return null;
	}

	@Override
	public Numero resta(Numero operando) {
		if(operando instanceof Entero) {
			Entero resultado;
			int nuevoValor = this.valor - ((Entero)operando).getValor();
			resultado = new Entero(nuevoValor);
			return resultado;
		}
		return null;
	}

	@Override
	public Numero producto(Numero operando) {
		if(operando instanceof Entero) {
			Entero resultado;
			int nuevoValor = this.valor * ((Entero)operando).getValor();
			resultado = new Entero(nuevoValor);
			return resultado;
		}
		return null;
	}

	@Override
	public Numero division(Numero operando) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mostrar() {	
		return ""+this.valor;
	}
	
}

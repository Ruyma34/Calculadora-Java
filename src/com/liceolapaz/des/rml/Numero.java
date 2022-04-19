package com.liceolapaz.des.rml;

public interface Numero {
	public Numero suma(Numero operando);
	public Numero resta(Numero operando);
	public Numero producto(Numero operando);
	public Numero division(Numero operando);
	public String mostrar();
}

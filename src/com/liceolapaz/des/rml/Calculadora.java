package com.liceolapaz.des.rml;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//Mostrar menu principal
		mostrarMenu();
		
		//Pedir opcion al usuario
		pedirOpcion();
		//Leer la opcion y guardarla
		int pedirOpciones = leerOpcion();
		
		//Segun la opcion realizar ciertas acciones
		if(pedirOpciones==1||pedirOpciones==2||pedirOpciones==3||pedirOpciones==4) {
			mostrarSubmenu();
			pedirOpcion(); 
			//Leer la opcion y guardarla
			int pedirOpcionSubmenu = leerOpcion();
			Numero operando1 = null;
			Numero operando2 = null;
			Numero resultado = null;
			//Segun la opcion escogida
			switch(pedirOpcionSubmenu) {
			//Si la opcion submenu es uno
				case 1:
					//Pedir valor operando1
					pedirValor1();
					int valor1 = leerOpcion();
					pedirValor2();
					int valor2 = leerOpcion();
					//Realizaremos la operacion escogida en el menu principal
					operando1 = new Entero(valor1);
					operando2 = new Entero(valor2);
						switch(pedirOpciones) {
						case 1:
							resultado = operando1.suma(operando2);
							break;
						case 2:
							resultado = operando1.resta(operando2);
							break;
						case 3:
							resultado = operando1.producto(operando2);
							break;
						case 4:
							resultado = operando1.division(operando2);
							break;
						
						}
						if(resultado != null) {
							mostrarResultado(resultado);
						}
						
						else {
							System.out.println("Error al calcular resultado");
						}
					break;
				case 2:
					break;
				case 0: 
					break;
				default:
					System.out.println("Opcion no valida");
			}
		}
		
		//Si la opcion es 0
		else if(pedirOpciones==0) {
			System.exit(0);
		
		}
		
		//Si es otra opcion
		else {
			System.out.println("Opcion no valida");
		}

	}

	private static void mostrarResultado(Numero resultado) {
		System.out.println("El resultado es:" + resultado.mostrar());
		
		
	}

	private static void pedirValor2() {
			System.out.println("Escriba el valor del segundo operando");
	}

	private static void pedirValor1() {
		System.out.println("Escriba el valor del primer operando");
		
	}

	private static void mostrarSubmenu() {
		System.out.println("\r\nTipo de numeros\r\n"
				+"1. Numeros enteros\r\n"
				+"2. Numeros racionales\r\n"
				+"0. Cancelar\r\n"
				);
		
	}

	private static int leerOpcion() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}
	

	private static void pedirOpcion() {
		System.out.println("Escoja una opcion:");
		
	}

	private static void mostrarMenu() {
		System.out.println("\r\nCALCULADORA\r\n"+"1. Suma\r\n"+"2. Resta\r\n"+"3. Producto\r\n"+"4. Division\r\n"+"0. Salir\r\n");
		
	
	}

}

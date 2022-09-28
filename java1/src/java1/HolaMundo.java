package java1;

import java.util.Scanner;

public class HolaMundo {
	
	
	private static void iniciacion() {
		// un cambio nuevo

		int numero = 10;
		int numero1 = 5;
		int numero_2 = 8;
		int _numero3 = 4;
		int suma = 0;
		double ndecimal = 4.5;
		char letra = 'h';
		String cadena = "hola mundito";
		String cadenaa = "a";
		String cadenav = "";
		int resto = 10 % 4; // resto vale 2
		final double iva = 0.21;
		
		
		
		
  System.out.println("HolaMundo");
  System.out.println("Adiós mundo");
  /* Se usa este comando para comentar cositas 
   * y da igual que hayan muchas lineas
   */
	System.out.println(numero);
	System.out.println(numero1+numero+numero_2+_numero3);
	suma = numero + numero1; //15
	System.out.println(suma);
	System.out.println(numero + ndecimal);
	System.out.println(letra + numero);
	System.out.println(cadenaa + numero);
	System.out.println(cadena + " "+cadenaa);
	System.out.println(cadena + '\n'+cadenaa);
	System.out.println(cadena + '\t'+cadenaa);
	System.out.println("la suma da :" +numero1+numero);
	System.out.println("la suma da :" +(numero1+numero));
    System.out.println(resto);
    numero += 3;
    System.out.println(numero);
    numero -=3;
    System.out.println(numero);
    numero *=3;
    System.out.println(numero);
    numero /=4;
    System.out.println(numero);
    double division= numero / 4.0 ;
    System.out.println(division);
    double decimal1 = 36.5, decimal2 = 7.2;
    int divisiondecimal1 = (int) (decimal1 /decimal2);
    System.out.println(divisiondecimal1);
    double divisiondecimal2 = (int) decimal1 /decimal2;
    System.out.println(divisiondecimal2);
    double divisiondecimal3 = (int) decimal1 / (int)decimal2;
    System.out.println(divisiondecimal3);
    double resultado = 7+4*2-5.0;
    System.out.println(resultado);
    double resultado2 = (7+4)*(2-5.0);
    System.out.println(resultado2);
    double resultado3 = (7+4)/(2.0);
    System.out.println(resultado3);
    int dos =2;
    int tres= 3;
    double resultado4= tres /(double) dos;
    System.out.println(resultado4);
    double resultado5=(double) (tres / dos);
    System.out.println(resultado5);
    int precio = 100;
    System.out.println("la ropa cuesta; " + precio + "\nIVA:"+ (precio*iva)+"\nTotal: "+ (precio+(precio*iva)));
    int valor = 10;
    valor++; // 11 valor = valor +1 ; valor += 1
    System.out.println(valor); // postincremento
    valor--;
    System.out.println(valor); //postdecremento
    System.out.println(valor++); // 10 
    System.out.println(valor);// 11
    System.out.println(++valor); // 12 preincremento 
    System.out.println(valor); // 12
    System.out.println(--valor); // 11 predecremento 
    System.out.println(valor); // 11
    valor = 10 ; 
    System.out.println(valor++ + ++ valor + valor-- - --valor); // 10
    System.out.println(valor); // 10
    int prefijo = 34 ;
    int telefono = 631631631;
    System.out.println(prefijo + telefono); // 631631664
    // conversiones 
    System.out.println("" + prefijo + telefono );// 34631631631
    System.out.println(prefijo + telefono); // 34631631631
    System.out.println(String.valueOf(prefijo) + telefono); // 631631664
    System.out.println(Integer.toString(prefijo) + telefono); // 631631664
    
	}
    
	private static void ejemplosCenversiones() {
		Scanner sc = new Scanner(System.in);
		int prefijo = 34;

		int telefono = 666666666;

		System.out.println(prefijo + telefono); // 666666670

		//Conversiones

		System.out.println("" + prefijo + telefono); // 34666666666. Implícita

		System.out.println(String.valueOf(prefijo) + telefono); // 34666666666

		System.out.println(String.valueOf(prefijo) + String.valueOf(telefono)); // 34666666666

		System.out.println(Integer.toString(prefijo) + telefono); // 34666666666
		String valor1 = sc.nextLine();
		valor1 = valor1.replace(',','.');
		valor1 = valor1.trim(); //Quita los espacios por delante y por detrás
		
		System.out.println("El numero que usted introdujo + 5 es : " + valor1 + 5);
		//System.out.println("El numero que usted introdujo + 5 es : " + (Integer.parseInt(valor1) + 5));
		//System.out.println("El numero que usted introdujo + 5 es : " + (Integer.valueOf(valor1) + 5));
		System.out.println("El numero que usted introdujo + 5 es : " + (Double.parseDouble(valor1) + 5));
		sc.close();
		
		
		
	}
	private static void ejercicio1() {
		
		System.out.println("La suma es: " +(36+27));
		
	}
	private static void ejercicio2() {
		int numero = 8;
	}
	private static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero : ");
		int N1= sc.nextInt();
		System.out.println("Introduzca otro numero : ");
		int N2= sc.nextInt();
		if (N1 > N2) {
		    System.out.println("N1 es mayor que N2");
		}
		else if(N1 = N2) {
		    System.out.println("N1 es igual que N2");
		}
		else (N1 < N2){
		    System.out.println("N1 es menor que N2");
		}
		
		 sc.close();
		 
	}
	private static void ejercicio5() {
		int N = 10;
		N+=77;
		System.out.println(N);
		N-=3;
		System.out.println(N);
		N=N*2;
		System.out.println(N);
		
	}
	public static void main(String[] args) {
		
		//iniciacion();
		//ejercicio1();
		//ejemplosCenversiones(); 
		ejercicio3();
		//ejercicio5();
		
    
    
   
    
	}

}

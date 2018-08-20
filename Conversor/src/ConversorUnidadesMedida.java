import java.util.Scanner;

/*Escriba un programa que realice la conversión de unidades de medida a pulgadas, 
 teniendo en cuenta la siguiente información: 
 
Consideraciones:
1 pulgada equivale a 0.0833 pies 
1 pulgada equivale a 2.54 centímetros 
1 legua equivale a 190080.02 pulgadas
1 yarda son 36 pulgadas 
El programa deberá recibir la unidad de medida 
(‘P’ para pie, ‘C’ para centímetro, ‘L’ para legua, y ‘Y’ para yarda), 
y un número a convertir, y que retorne ese número (que está en la medida dada) 
convertido a pulgadas. */

public class ConversorUnidadesMedida {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		int opc;
		double pulgadas, pies, centimetros, leguas, yardas;
		
		System.out.println("Ingrese la opción que desea: ");
		System.out.println("1. pulgadas a pies");
		System.out.println("2. pulgadas a centimetros");
		System.out.println("3. leguas a pulgadas");
		System.out.println("4. yardas a pulgadas");
		
		opc = lector.nextInt ();
		
		switch(opc) {
		
		case 1:
			System.out.println("Ingrese la cantidad de pulgadas a convertir: ");
			pulgadas = lector.nextDouble();
			pies = pulgadas * 0.0833;
			System.out.println(pulgadas+"pulgadas equivalen a "+pies+"pies.");
			break;
			
		case 2:
			System.out.println("Ingrese la cantidad de pulgadas a convertir: ");
			pulgadas = lector.nextDouble();
			centimetros = pulgadas * 2.54;
			System.out.println(pulgadas+"pulgadas equivalen a "+centimetros+"centimetros.");
			break;
			
		case 3:
			System.out.println("Ingrese la cantidad de leguas a convertir: ");
			leguas = lector.nextDouble();
			pulgadas = leguas * 190080.02;
			System.out.println(leguas+"leguas equivalen a "+pulgadas+"pulgadas.");
			break;
			
		case 4:
			System.out.println("Ingrese la cantidad de yardas a convertir: ");
			yardas = lector.nextDouble();
			pulgadas = yardas * 36;
			System.out.println(yardas+"yardas equivalen a "+pulgadas+"pulgadas.");
			break;
			
			default:
				System.out.println("La opción seleccionada no es válida.");
			
		}
	}

}


import java.util.*;
public static boolean procesoSeleccion() { 

	 Scanner scanner = new Scanner(System.in); 

	  

	 System.out.print("Introduzca su edad: "); 

	 int edad = scanner.nextInt(); 

	 if (edad > 40) { 

	 System.out.println("Lo sentimos, queda descartado del proceso de selecci�n por edad."); 

	 return false; 

	 } 

 

	 System.out.print("Introduzca su nombre: "); 

	 String nombre = scanner.next(); 

	  

	 System.out.print("Introduzca sus a�os trabajados: "); 

	 int a�osTrabajados = scanner.nextInt(); 

	 scanner.nextLine(); 

	  

	  

	 System.out.print("Introduzca su sueldo bruto anual anterior: "); 

	 double sueldoAnual = scanner.nextDouble(); 

	 scanner.nextLine(); 

 

	 if (sueldoAnual > 30000) { 

	 System.out.println("Lo sentimos, queda descartado del proceso de selecci�n por sueldo anterior."); 

	 return false; 

	 } 

	  

	 System.out.println("�Felicidades " + nombre + "! Ha sido contratado."); 

	  

	 double sumaNominas = 0; 

	 for (int i = 1; i <= 5; i++) { 

	 System.out.print("Introduzca el importe de la n�mina " + i + ": "); 

	 double nomina = scanner.nextDouble(); 

	 sumaNominas += nomina; 

	 } 

	  

	 System.out.println("La suma total de las 5 n�minas es de: " + sumaNominas + " euros."); 

	  

	 double media = sumaNominas / 5; 

	 double nuevoSalario; 

	  

	 if (media > 2500) { 

	 nuevoSalario = media * 1.05; 

	 System.out.println("El valor medio de sus n�minas supera los 2500 euros."); 

	 } else { 

	 nuevoSalario = media * 1.10;  

	 System.out.println("El valor medio de sus n�minas no supera los 2500 euros."); 

	 } 

	  

	 System.out.println("Se le incrementa el sueldo. Su nueva n�mina mensual ser�: " + nuevoSalario + " euros."); 

	  

	 return true; 

	 } 

	  

	 public static void main(String[] args) { 

	 boolean resultado = procesoSeleccion(); 

	 System.out.println("Resultado del proceso de selecci�n: " + (resultado ? "HAS SIDO CONTRATADO" : "NO HAS SIDO CONTRATADO")); 

	 } 

	} 

import java.util.*;
public class ejercicio1JNJ {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		comprobar();
		
		
		
	}

	public static void comprobar() {
		Double salarioJefe;
		Double salarioEncargado;
		Double salarioOficinistas;
		int numeroOficinistas;
		boolean proyectosTerminados;		
		Double presupuestoEmpresa;
		String resul;
		Double gastoAcumulado;
		
		System.out.println("Introduzca el salario del jefe:");
		salarioJefe = teclado.nextDouble();
		System.out.println("Introduzca el salario del encargado:");
		salarioEncargado = teclado.nextDouble();
		System.out.println("Introduzca el salario de las oficinistas:");
		salarioOficinistas = teclado.nextDouble();
		System.out.println("Introduzca el n�mero de oficinistas:");
		numeroOficinistas = teclado.nextInt();
		System.out.println("�Est�n los proyectos terminados?(true/false)");
		proyectosTerminados=teclado.nextBoolean();
		System.out.println("Introduzca el presupuesto de la empresa:");
		presupuestoEmpresa = teclado.nextDouble();
		
		if(!proyectosTerminados) {
			resul="No apto";
			System.out.println(resul);
			System.out.println("No ha pasado la auditor�a ya que no ha terminado los proyectos acordados");
			
		}else {
			gastoAcumulado=salarioJefe+salarioEncargado+(salarioOficinistas*numeroOficinistas);
			if(gastoAcumulado>20000) {
				resul="No apto";
				System.out.println(resul);
				System.out.println("No ha pasado la auditor�a ya que el gasto en personal es de ... y excede el l�mite mensual de 20.000 euros");
			}else {
				if(presupuestoEmpresa>100000) {
					resul="No apto";
					System.out.println(resul);
					System.out.println("No ha pasado la auditor�a ya que el presupuesto asignado de .... excede el l�mite establecido en 100.000 euros");
				}else {
					resul="Apto";
					System.out.println(resul);
					System.out.println("Enhorabuena!! Ha pasado la auditor�a, nos vemos el a�o que viene");
				}
			}
		}
		
	}
}

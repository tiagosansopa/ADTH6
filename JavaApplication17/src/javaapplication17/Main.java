/* Universidad del Valle
   ADT
   Hoja 6
   Pablo Barreno      14159
   Santiago Solorzano 14619
*/
import java.util.Scanner;
public class Main
{
	public static void main(String [] args)
	{
		//Ingrese de tipo de diseno en tiempo de corrida
		Scanner teclado = new Scanner(System.in);
		int index1 = 0,index2 = 0,index3 = 0;
		
		System.out.println("Eliga el patron de diseno");
		System.out.println("1. HashSet");
		System.out.println("2. TreeSet");
		System.out.println("3. LinkedHashSet");
		int opcionSet = teclado.nextInt();
		Desarrolladores desa = new Desarrolladores(opcionSet);
		System.out.println("Ingrese cantidad de usuarios");
		int cantUsers = teclado.nextInt();
		teclado.nextLine();
		
		String[] arrayJava = new String[cantUsers];
		String[] arrayCel = new String[cantUsers];
		String[] arrayWeb = new String[cantUsers];
		
		for ( int i = 0; i < cantUsers; i++)
		{
			System.out.println("Ingrese su nombre");
			String nomDes = teclado.nextLine();
			System.out.println("Es desarrollador java ?");
			System.out.println(" ");
			System.out.println("1. si");
			System.out.println("2. no");
			int opcionJava = teclado.nextInt();
			teclado.nextLine();
			
			System.out.println("Es desarrollador web ?");
			System.out.println(" ");
			System.out.println("1. si");
			System.out.println("2. no");
			int opcionWeb = teclado.nextInt();
			teclado.nextLine();
			
			System.out.println("Es desarrollador celular ?");
			System.out.println(" ");
			System.out.println("1. si");
			System.out.println("2. no");
			int opcionCelular = teclado.nextInt();
			teclado.nextLine();
			
			if (opcionJava == 1)
			{
				arrayJava[index1] =  nomDes;
				index1=index1+1;
			}
			if (opcionWeb == 1)
			{
				arrayWeb[index2] =  nomDes;
				index2=index2+1;
			}
			if (opcionCelular == 1)
			{
				arrayCel[index3] =  nomDes;
				index3=index3+1;
			}
		}
		boolean salir = true;
		while(salir == true)
		{
			for ( int i = 0; i < cantUsers; i++)
			{
				desa.javaDesarrolladores(arrayJava[i]);
				desa.webDesarrolladores(arrayWeb[i]);
				desa.celularesDesarrolladores(arrayCel[i]);
			}
			//Ingresa opcion y elige la accion segun la guia
			System.out.println("1. Experiencia Java, Web y Celulares");
			System.out.println("2. Experiencia en Java, pero no Web");
			System.out.println("3. Experiencia Web y Celulares y no Java");
			System.out.println("4. Experiencia Web o Celulares y no Java");
			System.out.println("5. Si es subconjunto");
			System.out.println("6. Mostrar Conjunto mas Grande y Ordenado");

			int opcionMostrar = teclado.nextInt();
			teclado.nextLine();
			
			if (opcionMostrar == 1)
			{
				desa.interseccionTodos();
			}
			if (opcionMostrar == 2)
			{
				desa.interseccionTipo2();
			}
			if (opcionMostrar == 3)
			{
				desa.interseccionTipo3();
			}
			if (opcionMostrar == 4)
			{
				desa.interseccionTipo4();
			}
			if (opcionMostrar == 5)
			{
				desa.subConjunto();
			}
			if (opcionMostrar == 6)
			{
				desa.ordenado();
			}
			System.out.println("Desea salir?");
			System.out.println("1. si");
			System.out.println("2. Elegir otra opcion");
			int opcionSalida= teclado.nextInt();
			teclado.nextLine();	
			
			if (opcionSalida == 1)
			{
				salir = false;
			}	
		}
	}
}	
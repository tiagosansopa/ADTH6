/* Universidad del Valle
   ADT
   Hoja 6
   Pablo Barreno      14159
   Santiago Solorzano 14619
*/
import java.util.*;
import java.lang.*;
import java.util.Scanner;
public class Desarrolladores 
{
	private int contador;
	
	private Set<String> primerConjuntoJava;
	private Set<String> segundoConjuntoJava;
	private Set<String> primerConjuntoWebDevep;
	private Set<String> segundoConjuntoWebDevep;
	private Set<String> primerConjuntoCel;
	private Set<String> segundoConjuntoCel;
	private Set<String> intersec;
	private Set<String> intersec2;
	private Set<String> intersec3;
	private Set<String> intersec4;
	private Set<String> intersec5;
	private Set<String> intersec6;
	private Set<String> intersec7;
	
	private String nombreDesarrollador;
	private factoryDesarrolladores factory;
	private String[] arrayOrdenado;



	public Desarrolladores(int index)
	{
		//Se inicializan todos los arreglos y se establece el tamaño de las tablas al ingresarlas el usuario
		Scanner teclado = new Scanner(System.in);
		contador = 0;
		nombreDesarrollador = "";
		factory = new factoryDesarrolladores();
		primerConjuntoJava= factory.getSet(index);
		primerConjuntoCel= factory.getSet(index);
		primerConjuntoWebDevep=  factory.getSet(index);
		intersec= factory.getSet(index);
		intersec2=factory.getSet(index);
		intersec3=factory.getSet(index);
		intersec4=factory.getSet(index);
		intersec5=factory.getSet(index);
		intersec6=factory.getSet(index);
		intersec7=factory.getSet(index);
	}

	public void javaDesarrolladores (String nombreDesarrollador)
	{	
		this.primerConjuntoJava.add(nombreDesarrollador);
	}

	public void celularesDesarrolladores(String nombreDesarrollador)
	{	
		this.primerConjuntoCel.add(nombreDesarrollador);
	}

	public void webDesarrolladores (String nombreDesarrollador)
	{
		this.primerConjuntoWebDevep.add(nombreDesarrollador);
	}
	//Se realiza la interseccion de todos lo conjuntos
	public void interseccionTodos ()
	{
		segundoConjuntoCel = primerConjuntoCel;
		segundoConjuntoWebDevep = primerConjuntoWebDevep;
		segundoConjuntoJava = primerConjuntoJava;
		intersec= segundoConjuntoJava;
		intersec.retainAll(segundoConjuntoCel);
		intersec.retainAll(segundoConjuntoWebDevep);
		System.out.println("Desarrolladores de todo:");
		for (Object o : intersec)
		{
			System.out.println(o);
		}
	}

	public void interseccionTipo2 ()
	{
		segundoConjuntoCel=primerConjuntoCel;
		segundoConjuntoWebDevep= primerConjuntoWebDevep;
		segundoConjuntoJava= primerConjuntoJava;
		intersec2= segundoConjuntoJava;
		intersec2.removeAll(segundoConjuntoWebDevep);
		System.out.println("Desarrolladores Java no Web:");
		for (Object o : intersec2)
		{
			System.out.println(o);
		}
	}

	public void interseccionTipo3 ()
	{
		segundoConjuntoCel=primerConjuntoCel;
		segundoConjuntoWebDevep= primerConjuntoWebDevep;
		segundoConjuntoJava= primerConjuntoJava;
		intersec3 = segundoConjuntoCel;
		intersec3.retainAll(segundoConjuntoWebDevep);
		intersec3.removeAll(segundoConjuntoJava);
		System.out.println("Desarrolladores Web y Celulares pero no java:");
		for (Object o : intersec3){
			System.out.println(o);
		}
	}
	public void interseccionTipo4 ()
	{
		segundoConjuntoCel=primerConjuntoCel;
		intersec4= segundoConjuntoCel;
		segundoConjuntoWebDevep= primerConjuntoWebDevep;
		segundoConjuntoJava= primerConjuntoJava;
		intersec4.addAll(segundoConjuntoWebDevep);
		intersec4.removeAll(segundoConjuntoJava);
		System.out.println("Desarrolladores Web o Celulares, sin Java");
		for (Object o : intersec4)
		{
			System.out.println(o);
		}
	}
	//Verifica si es un subconjuto
	public boolean subConjunto ()
	{
		intersec5= primerConjuntoWebDevep;
		return intersec5.containsAll(primerConjuntoJava);
	}
	//Establece cual es el set mayor
	public Set mayor ()
	{
		int num1 = primerConjuntoJava.size();
		int num2 = primerConjuntoCel.size();
		int num3 = primerConjuntoWebDevep.size();
		
		if ( num1> num2 && num1>num3)
		{
			System.out.println("El grupo mayor es Java");
			return primerConjuntoJava;
		}
		if (num2> num1 && num2>num3)
		{
			System.out.println("El grupo mayor es Celulares");
			return primerConjuntoCel;
		}
		if (num3> num1 && num3>num2)
		{
			System.out.println("El conjunto mayor es Web");
			return primerConjuntoWebDevep;
		}
		else
		{
			return null;
		}
		
	}
	//Ordena el set
	public void ordenado()
	{
		intersec6 = mayor();
		TreeSet sortedSet = new TreeSet<String>(intersec6);
		for (Object o : sortedSet)
		{
			System.out.println(o);
		}
	}
}
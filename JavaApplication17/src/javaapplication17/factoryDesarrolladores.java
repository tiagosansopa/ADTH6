/* Universidad del Valle
   ADT
   Hoja 6
   Pablo Barreno      14159
   Santiago Solorzano 14619
*/
import java.util.*;
public class factoryDesarrolladores{

	//El factory recibe el tipo de table que se va a utilizat y la crea dependiendo de la opcion ingresada
	public Set getSet (int num)
	{
		int i= num;
		if (i==1)
		{
			return new HashSet<String>(); 
		}
 
		if(i== 2)
		{
			return new LinkedHashSet<String>(); 
		}
   
		if(i== 3)
		{
			return new TreeSet<String>(); 
		}
   
		else
		{
			return new HashSet<String>();
		}
   }
}

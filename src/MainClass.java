import java.util.Scanner;


public class MainClass
{
	
	static void imprimirArreglo(int mi_arreglo[])
	{
		System.out.println("Los valores del arreglo son: ");
		for(int l = 0; l < mi_arreglo.length; l++)
		{
			System.out.println(mi_arreglo[l]);
		}
	}
	
	static int[] obtenerArreglo(int tamano)
	{
		Scanner s = new Scanner(System.in);
		
		int mi_arreglo[] = new int[tamano];
		
		int i = 0;
		while(i < mi_arreglo.length)
		{
			System.out.print("Ingrese un numero: ");
			mi_arreglo[i]=s.nextInt();
			i++;
		}
		
		return mi_arreglo;
	}
	
	static boolean existe(int arreglo[],int num)
	{
		for(int i=0;i<arreglo.length;i++)
		{
			int num_actual=arreglo[i];
			if(num_actual==num)
			{
				//Encontre!
				return true;
			}
		}
		return false;
	}
	
	static boolean estaDentroDeRango(int num, int min, int max)
	{
		if(num<=max && num>=min)
		{
			return true;
		}
		return false;
	}
	
	static boolean comienzaConA(String str)
	{
		if(str.charAt(0)=='a' || str.charAt(0)=='A')
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		System.out.print(comienzaConA("Hola"));
		System.out.print(comienzaConA("algo"));
		System.out.print(comienzaConA("Alejandra"));
		
//		int mi_arreglo[] = obtenerArreglo(3);
//		imprimirArreglo(mi_arreglo);
//		System.out.print("Ingrese un numero a buscar: ");
//		Scanner s=new Scanner(System.in);
//		int num_buscar = s.nextInt();
//		System.out.print("existe: "+existe(mi_arreglo, num_buscar));
	}
}	


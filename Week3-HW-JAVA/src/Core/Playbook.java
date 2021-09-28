package Core;
import java.util.Arrays;
import java.util.Scanner;

import Core.Tools.*;
public class Playbook {

public static void main (String[]args)
{
//	int k=5;
//	int[] table =new int[5];
//	Tools.input(table);
//	System.out.println(Arrays.toString(table));
	System.out.println("Enter your table size: ");
	Scanner src = new Scanner (System.in);
	
	int [] table = new int[src.nextInt()];
    System.out.println("Insert your table values:");
    Tools.input(table);
    
    
   
    System.out.println("Type 1 to sort or 2 to search");
	switch(src.nextInt())
	{
		case 1: System.out.println("Choose your algorithm type:"
				+ "1) Linear sort"
				+ "2) Selection sort "
				+ "3) Insertion sort"
				+ "4) Radix sort");
				switch(src.nextInt())
				{
				case 1: System.out.println("What type of order? :"
						+ "1) for ASC"
						+ "2) for DESC");
						switch(src.nextInt())
						{
						case 1: Tools.sort_asc(table);
							break;
						case 2: Tools.sort_Desc(table);
							break;
						}
						
					break;
				case 2: System.out.println("What type of order? :"
						+ "1) for ASC"
						+ "2) for DESC");
						switch(src.nextInt())
						{
						case 1:Tools.selec_tri_asc(table);
							break;
						case 2: Tools.selec_tri_desc(table);
							break;
						}
					break;
				case 3: System.out.println("What type of order? :"
						+ "1) for ASC"
						+ "2) for DESC");
						switch(src.nextInt())
						{
						case 1: Tools.insertionSort(table);
							break;
						case 2:Tools.insertionSortrev(table);
							break;
						}
					break;
				case 4: System.out.println("What type of order? :"
						+ "1) for ASC"
						+ "2) for DESC");
						switch(src.nextInt())
						{
						case 1:Tools.radix_asc(table);
							break;
						case 2:Tools.radix_desc(table);
							break;
						}
					break;
					
				}
				System.out.println(Arrays.toString(table));
		break;
		case 2:  System.out.println("Choose your method of search:\n 1- Linear search\n 2- Binary search\n 3- Interpolation search\n 4- Jump reseach ");
		switch(src.nextInt())
		{
		case 1: System.out.println("Linear search, Enter the number to search:\n  ");
		
		        
				if(Tools.search01(table, src.nextInt()))
				{
					System.out.println(true);
					System.out.println("\nThe number exists in your array.");
					
				}
				else
				{
					System.out.println(false);
					System.out.println("\nThe number does not exist in your array.");
				}
			break;
				
		case 2: System.out.println("Binary search, Enter the number to search:\n");
		
			
		if(Tools.search01(table, src.nextInt()))
		{
			System.out.println(true);
			System.out.println("\nThe number exists in your array.");
		}
		else
		{
			System.out.println(false);
			System.out.println("\nThe number does not exist in your array.");
		}
	break;
		
		
		case 3: System.out.println("\nInterpolation search, Enter the number to search:\n");
		
			if(Tools.search01(table, src.nextInt()))
			{
				System.out.println(true);
				System.out.println("\nThe number exists in your array.");
			}
			else
			{
				System.out.println(false);
				System.out.println("\nThe number does not exist in your array.");
			}
			break;
		
		
		case 4: System.out.println("Jump search, Enter the number to search:\\n");
		if(Tools.search01(table, src.nextInt()))
		{
			System.out.println(true);
			System.out.println("\nThe number exists in your array.");
		}
		else
		{
			System.out.println(false);
			System.out.println("\nThe number does not exist in your array.");
		}
	break;
	}
	
	
	}


    
}
}




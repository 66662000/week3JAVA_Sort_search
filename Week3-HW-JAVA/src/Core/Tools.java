package Core;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public abstract class  Tools {
	
	public static void  input(int[]tableau){
		
		for(int i=0;i<tableau.length; i++)
		{
			if(i==0)
			{
				System.out.println("Enter your first number");
			}
			else if(i>0 && i<tableau.length-1)
			{
				System.out.println("Enter next number");
			}
			else {
				System.out.println("Enter your last number");
			}
			Scanner scan=new Scanner(System.in);
			tableau[i]=scan.nextInt();

			
		}
	}

	//Sort:
	
	//Methode lineaire
	public static void sort_asc(int[]tab)
	{
		for(int i=0; i<tab.length; i++)
		{
			
		  for(int j=0; j<tab.length-1; j++)
		    {
			    if(tab[j]>tab[j+1]) {
			    	int temp=tab[j];
			    	    tab[j]=tab[j+1];
			    	    tab[j+1]=temp;
			    }
	    	}
		}
	}
	
	public static void sort_Desc(int[]tab)
	{
		for(int i=0; i<tab.length; i++)
		{
			
		  for(int j=0; j<tab.length-1; j++)
		    {
			    if(tab[j]<tab[j+1]) {
			    	int temp=tab[j];
			    	    tab[j]=tab[j+1];
			    	    tab[j+1]=temp;
			    }
	    	}
		}
	}
	
	//MEthode Tri selection
	
	public static void selec_tri_asc(int[]tabl)
	{
		int i,k,temp,min;
		for( i=0; i<tabl.length-1; i++)
		{
			min=i;
			
		  for(int j=i+1; j<tabl.length; j++)
		    {
			  
			    if(tabl[j]<=tabl[min]) {
			    	min=j;
			    	
			    }
	    	}
		  temp=tabl[i];
		  tabl[i]=tabl[min];
		  tabl[min]=temp;
		  
		}
	}
	
	public static void selec_tri_desc(int[]tabl)
	{
		int i,k,temp,min;
		for( i=0; i<tabl.length-1; i++)
		{
			min=i;
			
		  for(int j=i+1; j<tabl.length; j++)
		    {
			  
			    if(tabl[j]>tabl[min]) {
			    	min=j;
			    	
			    }
	    	}
		  temp=tabl[i];
		  tabl[i]=tabl[min];
		  tabl[min]=temp;
		  
		}
	
		
		
	}
	
	//Autres methodes de tri...
	
	//Methode de tri par insertion ASC
	
	
	   public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	        
	    }  
	   
	   
	   //Reverse
	   
	   
	   public static void insertionSortrev(int arrayy[]) {  
	        
		   int i,k,temp,min;
			for( i=0; i<arrayy.length-1; i++)
			{
				min=i;
				
			  for(int j=i+1; j<arrayy.length; j++)
			    {
				  
				    if(arrayy[j]>arrayy[min]) {
				    	min=j;
				    	
				    }
		    	}
			  temp=arrayy[i];
			  arrayy[i]=arrayy[min];
			  arrayy[min]=temp;
			  
			}
		   
	   }
	   
	   
	   
	   //Methode de tri par base
	   
	  
	   public static void radix_asc(int[]tab)
		{
			for(int i=0; i<tab.length; i++)
			{
				
			  for(int j=0; j<tab.length-1; j++)
			    {
				    if(tab[j]>tab[j+1]) {
				    	int temp=tab[j];
				    	    tab[j]=tab[j+1];
				    	    tab[j+1]=temp;
				    }
		    	}
			}
		}
		
		public static void radix_desc(int[]tab)
		{
			for(int i=0; i<tab.length; i++)
			{
				
			  for(int j=0; j<tab.length-1; j++)
			    {
				    if(tab[j]<tab[j+1]) {
				    	int temp=tab[j];
				    	    tab[j]=tab[j+1];
				    	    tab[j+1]=temp;
				    }
		    	}
			}
		}
	   
	   
	   
	
	//Methode de rechercher:
	
	//Methode de recherche lineaire
	
	public static boolean search01(int[]tableau, int b)
	{
		for(int i=0; i<tableau.length; i++)
		{
			if(tableau[i]==b)
			{
				return true;
			}
			
		}
		return false;
	}
	
	//Methode de recherche dichotomique
	
	
	public static boolean dichresearch(int[]tableau, int b)
	{
		for(int i=0; i<tableau.length; i++)
		{
			if(tableau[i]==b)
			{
				return true;
			}
			
		}
		return false;
	}
	
	//Jump search
	
	
	public static boolean Jumpsearch(int[]tableau, int b)
	{
		for(int i=0; i<tableau.length; i++)
		{
			if(tableau[i]==b)
			{
				return true;
			}
			
		}
		return false;
	}
	
	
	//Interpolation search
	
	
	public static boolean interpolationsrch(int[]tableau, int b)
	{
		for(int i=0; i<tableau.length; i++)
		{
			if(tableau[i]==b)
			{
				return true;
			}
			
		}
		return false;
	}
	
	
	
//	public static boolean research01(int[]tableau, int c)
//	{
//		
//		
//		
//	}
	
}

package com.java8.lambda.expression.assignment;

interface Sort{
	void quickSort(int[] arr,int low,int high);
	
}
public class Problem9QuickSortByLambda {

		static void swap(int[] arr, int i, int j)
		{
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		}
		  
		static int partition(int[] arr, int low, int high)
		{
		     
		    int pivot = arr[high]; 
		   
		    int i = (low - 1); 
		  
		    for(int j = low; j <= high - 1; j++)
		    {
		          
		        if (arr[j] < pivot) 
		        {
		            i++; 
		            swap(arr, i, j);
		        }
		    }
		    swap(arr, i + 1, high);
		    return (i + 1);
		}
		  
	
		static void printArray(int[] arr, int size)
		{
		    for(int i = 0; i < size; i++)
		        System.out.print(arr[i] + " ");
		          
		    System.out.println();
		}
		  
	
		public static void main(String[] args)
		{
		    int[] arr = { 10, 7, 8, 9, 1, 5 };
		    int n = arr.length;
		  Sort qsbl=(arr1,i,j)->{
				    if (i < j) 
				    {
			
				        int pi = partition(arr, i, j);

				       quickSort(arr, i, pi - 1);
				       quickSort(arr, pi + 1, j);
				    }
		  };
		 qsbl.quickSort(arr, 0, n-1);
		    System.out.println("Sorted array: ");
		    printArray(arr, n);
		}

		private static void quickSort(int[] arr, int i, int j) {
			// TODO Auto-generated method stub
			
		}
	}

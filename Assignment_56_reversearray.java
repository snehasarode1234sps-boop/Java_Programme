package Java_Assignment;

import java.util.Arrays;

public class Assignment_56_reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array1[]=new int [5];
	     array1[0]=1;
         array1[1]=2;
         array1[2]=3;
         array1[3]=4;
         array1[4]=5;
         
      int array2[]=new int [array1.length];
      
      for (int i=0,j=array1.length-1;i<array1.length;i++,j--)
      {
   	         array2[j]=array1[i];   
      }
      
   		 System.out.println("input array is ");
   		 System.out.println(Arrays.toString(array1));
   		 System.out.println("output array is  ");
   		 System.out.println(Arrays.toString(array2));
	}
}


package Java_Assignment;

import java.util.Arrays;

public class Assignment_55_twoarraysareequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]=new int [5];
	    array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        array1[4]=5;
        
        int array2[]=new int [5];
        array2[0]=1;
        array2[1]=2;
        array2[2]=3;
        array2[3]=4;
        array2[4]=5;
        
       boolean b1=Arrays.equals(array2,array1);
  	   if(b1==true)
  	   {
  		   System.out.println("Two arrays are equal");
  	   }
  	   else
  	   {
  		   System.out.println("Arrays are not equal");
  	   }
     }
     
	}



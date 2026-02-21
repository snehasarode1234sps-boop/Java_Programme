package Java_Assignment;

public class Assignment_57_Avgvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           double input[]=new double[6];
           input[0]=40;
           input[1]=34;
           input[2]=7.9;
           input[3]=60;
           input[4]=5.3;
           input[5]=80;
           
           double sum=0;
           for (int i=0;i<input.length;i++)
           {
        	   sum=sum+input[i];
        	   
           }
           double average=sum/input.length;
           System.out.println("The average of value present in the array is = " +average);
           
           
	}

}

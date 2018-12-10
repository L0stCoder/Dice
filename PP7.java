/**
 * @(#)PP7.java
 *
 *
 * @author 
 * @version 1.00 2018/12/7
 */


public class PP7{
    public static void main(String[]args{
    	final int MAX = 12;
    	for(int row=1; row<=MAX; row++){
    		System.out.println();
    		for(int column=1; column<=MAX; column++){
    			System.out.print(row*column+ "\t");
    		}
    	}
    }  
}
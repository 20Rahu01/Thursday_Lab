package Day14_29_12;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String []args){
			
		
	//	* * * * * 
	//	 * * * * 
	//	  * * * 
	//	   * * 
	//	    * 
	//	   * * 
	//	  * * * 
	//	 * * * * 
	//	* * * * * 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
	    int row =sc.nextInt();
	    
	    for (int i=0; i<=row-1; i++) {  
	    	
	    	for (int k=0; k<i; k++ )  //prints star       
		    	System.out.print(" ");
	        
	    	for (int j=i; j<=row-1; j++)   //inner loop work for space  
		    	System.out.print("* ");
	
		    System.out.println();   
		} 
	    
	    for (int i=1; i<row; i++) {  
	        
	    	for (int j=row-i; j>1; j--)   //inner loop work for space  
	    	System.out.print(" ");   
	
	    	for (int k=0; k<=i; k++ )  //prints star       
	    	System.out.print("* ");   
	      
	    	System.out.println();   
	    }   
	}
}

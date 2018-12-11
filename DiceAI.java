/**
 * @(#)DiceAI.java
 *
 *
 * @Brysen Reeser 
 * @version 1.00 2018/12/10
 */

import java.util.Scanner;
public class DiceAI {

    public static void main(String[]args)
    	{
    		int pCount, aiScore=0, aiTurn=0, turnPoint=0, die1=0, die2=2, thisPoint=0;
    		Scanner scan = new Scanner (System.in);
    		
    		
    		System.out.println("How many people are playing? (1 or 2)");
    		pCount =scan.nextInt();
    		
    		
    			if (pCount ==1);
    			
    			//have larger while loop establishing that allows you to loop the two players turns
    			
    			aiTurn =1;	
    				while (aiTurn==1){ //runs the AI turn
    					die1=(int)((Math.random()*6)+1);
    					die2=(int)((Math.random()*6)+1);
    					thisPoint= die1+die2;
    				
    				if (die1 == 1 && die2 == 1) { //if both dice rolled are 1's, erases score and trades turns.
    					System.out.println("The Computer rolled two zeros, lost its score and it is now your turn.");
    					aiScore=0;
    					aiTurn=2;
    				}
    				else if (die1 == 1 || die2==1){ //if either of the AI's first roll of dice is zero, it should end.
    					System.out.println("The Computer rolled one zero, it lost its points for the turn and it is now your turn to roll.");
    					turnPoint=0;
    					aiTurn=2;
    				}
    				else {
    					aiScore=(aiScore + thisPoint);
    					System.out.println("The AI rolled a "+die1+" and a "+die2+" for a new total of "+ aiScore);
    						if (turnPoint+thisPoint>=20){
    							System.out.println("The AI ends their turn.");
    							turnPoint = turnPoint + thisPoint;
    							aiScore = aiScore + turnPoint;
    							aiTurn=2;
    						}
    						else if (turnPoint<20){
    							System.out.println("The AI rolls again");
    							turnPoint = turnPoint + thisPoint;
    						}
    				}
   	 	}
    
    
}
}
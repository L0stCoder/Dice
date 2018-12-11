/**
 * @(#)PP5.java
 *
 *
 * @author 
 * @version 1.00 2018/12/10
 */

import java.util.Scanner;
public class PP5{
    public static void main(String[]args){
    	Scanner input=new Scanner(System.in);
    	int x=1, y=1;
    	int Player1S=0, Player2S=0; //Starts score off at zero points
    	int Player1RS=0, Player2RS=0; //Adds up total points in the round
    	final int FINAL=100;
    	int die1, die2; //Starts the Dice off
    	int playerCount=1;
    	String Turn="P1"; //Starts while game on Player 1's turn each game
    	String Roll="y"; //Starts off the player as rolling unless told otherwise
    	String playAgain="y";
    	//AI VARIBLES
    	final int AIMAXPOINTS=20;
    	int AIS=0, AIRS=0, AITest=1;
    	System.out.println("Welcome to the game of PIG!");
    	System.out.print("How many players are there? [1, 2]: ");
    	playerCount=input.nextInt();
    	while(playAgain.equalsIgnoreCase("y")){
    		if(playerCount==2){
    			while(Player1S<=FINAL||Player2S<=FINAL){
   					if(Turn.equalsIgnoreCase("P1")){
   						Player1RS=0;
   						System.out.println("It is currently Player 1's turn");
   						System.out.println("Player 1's total score is: "+Player1S);
   						System.out.print("Would you like to roll? [y, n]: ");
    					Roll=input.nextLine();
    					System.out.println("\n----------------------------------------\n");
    					y=1;
    					while(x==y){
    						if(Roll.equalsIgnoreCase("y")){
    							die1=(int)((Math.random()*6)+1);
    							die2=(int)((Math.random()*6)+1);
    							System.out.println("Player 1 rolled a "+die1+" on dice 1 and a "+die2+" on dice 2");
    							if(die1==1||die2==1){
    								Player1RS=0;
    								if(die1==1&&die2==1){
    									Player1S=0;
    								}
    								y=0;
    							}
    							else{
    								Player1RS=Player1RS+(die1+die2);
    								System.out.println("Player 1's total score this round is: "+Player1RS);
    								System.out.print("Would you like to roll again and be a PIG? [y, n]: ");
    								Roll=input.nextLine();
    							}
    						}
    						else{
    							System.out.println("Player 1's turn has been skipped!");
    							y=0;
    						}
    						System.out.println("\n----------------------------------------\n");
   						}
   						Player1S=Player1S+Player1RS;
   						Turn="P2";
    				}
    				else if(Turn.equalsIgnoreCase("P2")){
    					Player1RS=0;
   						System.out.println("It is currently Player 2's turn");
   						System.out.println("Player 2's total score is: "+Player2S);
   						System.out.print("Would you like to roll? [y, n]: ");
    					Roll=input.nextLine();
    					System.out.println("\n----------------------------------------\n");
    					y=1;
    					while(x==y){
	    					if(Roll.equalsIgnoreCase("y")){
    							die1=(int)((Math.random()*6)+1);
    							die2=(int)((Math.random()*6)+1);
    							System.out.println("Player 2 rolled a "+die1+" on dice 1 and a "+die2+" on dice 2");
    							if(die1==1||die2==1){
    								Player2RS=0;
    								if(die1==1&&die2==1){
    									Player2S=0;
    								}
    								y=0;
    							}
    							else{
    								Player2RS=Player2RS+(die1+die2);
    								System.out.println("Player 2's total score this round is: "+Player2RS);
    								System.out.print("Would you like to roll again and be a PIG? [y, n]: ");
    								Roll=input.nextLine();
    							}
    						}
    						else{
    							System.out.println("Player 2's turn has been skipped!");
    							y=0;
    						}
    						System.out.println("\n----------------------------------------\n");
   						}
   						Player2S=Player2S+Player2RS;
   						Turn="P1";
    				}
    			}
    			System.out.print("Would you like to play again? [y, n]: ");
    			playAgain=input.nextLine();
    		}
    		else if(playerCount==1){
    			while(Player1S<=FINAL||AIS<=FINAL){
   					if(Turn.equalsIgnoreCase("P1")){
   						Player1RS=0;
   						System.out.println("It is currently Player 1's turn");
   						System.out.println("Player 1's total score is: "+Player1S);
   						System.out.print("Would you like to roll? [y, n]: ");
    					Roll=input.nextLine();
    					System.out.println("\n----------------------------------------\n");
    					y=1;
    					while(x==y){
    						if(Roll.equalsIgnoreCase("y")){
    							die1=(int)((Math.random()*6)+1);
    							die2=(int)((Math.random()*6)+1);
    							System.out.println("Player 1 rolled a "+die1+" on dice 1 and a "+die2+" on dice 2");
    							if(die1==1||die2==1){
    								Player1RS=0;
    								if(die1==1&&die2==1){
    									Player1S=0;
    								}
    								y=0;
    							}
    							else{
    								Player1RS=Player1RS+(die1+die2);
    								System.out.println("Player 1's total score this round is: "+Player1RS);
    								System.out.print("Would you like to roll again and be a PIG? [y, n]: ");
    								Roll=input.nextLine();
    							}
    						}
    						else{
    							System.out.println("Player 1's turn has been skipped!");
    							y=0;
    						}
    						System.out.println("\n----------------------------------------\n");
   						}
   						Player1S=Player1S+Player1RS;
   						Turn="AI";
    				}
    				if(Turn.equalsIgnoreCase("AI")){
   						AIRS=0;
   						System.out.println("It is currently the COMPUTER'S turn");
   						System.out.println("The COMPUTER'S total score is: "+AIS);
    					System.out.println("\n----------------------------------------\n");
    					y=1;
    					while(x==y){
    						int AIRolls=(int)(Math.random()*5);
    						if(AITest<=AIRolls){
    							die1=(int)((Math.random()*6)+1);
    							die2=(int)((Math.random()*6)+1);
    							System.out.println("The COMPUTER rolled a "+die1+" on dice 1 and a "+die2+" on dice 2");
    							if(die1==1||die2==1){
    								AIRS=0;
    								if(die1==1&&die2==1){
    									AIS=0;
    								}
    								y=0;
    								AITest++;
    							}
    							else{
    								AIRS=AIRS+(die1+die2);
    								System.out.println("COMPUTER'S total score this round is: "+AIRS);
    								Roll=input.nextLine();
    							}
    						}
    						else{
    							System.out.println("COMPUTER'S turn has been skipped!");
    							y=0;
    						}
    						System.out.println("\n----------------------------------------\n");
   						}
   						AIS=AIS+AIRS;
   						Turn="P1";
    				}
    			}
    			System.out.print("Would you like to play again? [y, n]: ");
    			playAgain=input.nextLine();
    		}
    		else{
    			System.out.println("Please enter a correct amount of people!");
    		}
    	}
    }
}
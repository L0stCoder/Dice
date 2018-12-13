/**
 * @(#)PP5.java
 *
 *
 * @author 
 * @version 1.00 2018/12/10
 */

import java.util.Scanner;
public class PP5WorkingAI{
    public static void main(String[]args){
    	Scanner input=new Scanner(System.in);
    	int x=1, y=1;
    	int Player1S=0, Player2S=0; //Starts score off at zero points
    	int Player1RS=0, Player2RS=0; //Adds up total points in the round
    	final int FINAL=100;
    	int die1, die2; //Starts the Dice off
    	int Roll=1; //Starts off the player as rolling unless told otherwise
    	String Turn="P1"; //Starts while game on Player 1's turn each game
    	String test="y";
    	String playAgain="y";
    	System.out.println("Welcome to the game of PIG!");
    	System.out.print("How many players are there? [1, 2]: ");
    	int Players=input.nextInt();
    	if(playAgain.equalsIgnoreCase("y")){
    		if(Players==2){
    			while(Player1S<=FINAL&&Player2S<=FINAL){
    				if(Turn.equalsIgnoreCase("P1")){
    					Player1RS=0;
    					System.out.println("It is currently Player 1's turn");
    					System.out.println("Player 1's total score is: "+Player1S);
    					System.out.print("Would you like to roll? [1 for yes, 2 for no]: ");
    					Roll=input.nextInt();
    					System.out.println("\n----------------------------------------\n");
    					y=1;
    					while(x==y){
    						if(Roll==1){
    							die1=(int)((Math.random()*6)+1);
    							die2=(int)((Math.random()*6)+1);
    							System.out.println("Player 1 rolled a "+die1+" and a "+die2);
    							if(die1==1||die2==1){
    									Player1RS=0;
    									System.out.print("Player 1 has rolled at least one 1 and lost thier points this round!");
    									if(die1==die2){
    										Player1S=0;
    										System.out.print(" Both dice were 1's, all points lost!");
    									}
    									System.out.println();
    									y=0;
    							}
    							else{
    								Player1RS=Player1RS+(die1+die2);
    								System.out.println("Player 1's total score this round is: "+Player1RS);
    								System.out.print("Would you like to roll again and be a PIG? [1 for yes, 2 for no]: ");
    								Roll=input.nextInt();
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
    					Player2RS=0;
    					System.out.println("It is currently Player 2's turn");
    					System.out.println("Player 2's total score is: "+Player2S);
    					System.out.print("Would you like to roll? [1 for yes, 2 for no]: ");
    					Roll=input.nextInt();
    					System.out.println("\n----------------------------------------\n");
    					y=1;
    					while(x==y){
    						if(Roll==1){
    							die1=(int)((Math.random()*6)+1);
    							die2=(int)((Math.random()*6)+1);
    							System.out.println("Player 2 rolled a "+die1+" and a "+die2);
    							if(die1==1||die2==1){
    									Player2RS=0;
    									System.out.print("Player 2 has rolled at least one 1 and lost thier points this round!");
    									if(die1==die2){
    										Player2S=0;
    										System.out.print(" Both dice were 1's, all points lost!");
    									}
    									System.out.println();
    									y=0;
    							}
    							else{
    								Player2RS=Player2RS+(die1+die2);
    								System.out.println("Player 2's total score this round is: "+Player2RS);
    								System.out.print("Would you like to roll again and be a PIG? [1 for yes, 2 for no]: ");
    								Roll=input.nextInt();
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
    			if(Player1S>=100){
    				System.out.println("Congratulations Player1, You just won!");
    				System.out.print("Would you like to play again? [y, n]: ");
    				playAgain=input.nextLine();
    			}
    			else{
    				System.out.println("Congratulations Player2, You just won!");
    				System.out.print("Would you like to play again? [y, n]: ");
    				playAgain=input.nextLine();
    			}
    		}
    		else if(Players==1);{
    			while(Player1S<=FINAL&&Player2S<=FINAL){
    					if(Turn.equalsIgnoreCase("P1")){
    						Player1RS=0;
    						System.out.println("It is currently Player 1's turn");
    						System.out.println("Player 1's total score is: "+Player1S);
    						System.out.print("Would you like to roll? [1 for yes, 2 for no]: ");
    						Roll=input.nextInt();
    						System.out.println("\n----------------------------------------\n");
    						y=1;
    						while(x==y){
    							if(Roll==1){
    								die1=(int)((Math.random()*6)+1);
    								die2=(int)((Math.random()*6)+1);
    								System.out.println("Player 1 rolled a "+die1+" and a "+die2);
    								if(die1==1||die2==1){
    									Player1RS=0;
    									System.out.print("Player 1 has rolled at least one 1 and lost thier points this round!");
    									if(die1==die2){
    										Player1S=0;
    										System.out.print(" Both dice were 1's, all points lost!");
    									}
    									System.out.println();
    									y=0;
    								}
    								else{
    									Player1RS=Player1RS+(die1+die2);
    									System.out.println("Player 1's total score this round is: "+Player1RS);
    									System.out.print("Would you like to roll again and be a PIG? [1 for yes, 2 for no]: ");
    									Roll=input.nextInt();
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
    					Player2RS=0;
    					System.out.println("It is currently COMPUTER'S turn");
    					System.out.println("COMPUTER'S total score is: "+Player2S);
    					System.out.println("\n----------------------------------------\n");
    					y=1;
    					while(x==y){
    						die1=(int)((Math.random()*6)+1);
    						die2=(int)((Math.random()*6)+1);
    						System.out.println("COMPUTER rolled a "+die1+" and a "+die2);
    						if(die1==1||die2==1){
    							Player2RS=0;
    							System.out.print("COMPUTER has rolled at least one 1 and lost thier points this round!");
    							if(die1==die2){
    								Player2S=0;
    								System.out.print(" Both dice were 1's, all points lost!");
    							}
    							System.out.println();
    							y=0;
    						}
    						else if(Player2RS>=20){
    							y=0;
    						}
    						else{
    							Player2RS=Player2RS+(die1+die2);
    							System.out.println("COMPUTER'S total score this round is: "+Player2RS);
    						}
    						System.out.println("\n----------------------------------------\n");
    					}
    					Player2S=Player2S+Player2RS;
    					Turn="P1";
    				}
    			}
    			if(Player1S>=100){
    				System.out.println("Congratulations Player1, You just won!");
    				System.out.print("Would you like to play again? [y, n]: ");
    				playAgain=input.nextLine();
    			}
    			else{
    				System.out.println("Sorry it seems like you lost!");
    				System.out.print("Would you like to play again? [y, n]: ");
    				playAgain=input.nextLine();
    			}
    		}
    	}
    }
}
/**
 * @(#)DriverBox.java
 *
 *
 * @author 
 * @version 1.00 2018/12/7
 */


public class DriverBox {

	private int diceOne, diceTwo, total=0;
	public DriverBox(){
		roll();
	}
	
	
   	 public int roll() {
    	
    	for(int x=1; x<=1000; x++)
    			{
    	
    	diceOne=(int) (Math.random()*6);
    	diceOne++;
    	
    	diceTwo=(int)(Math.random()*6);
    	diceTwo++;
    	if (diceOne == 6 && diceTwo ==6){
    		total++;
    	} 	
    }
    return total;
    
}
}

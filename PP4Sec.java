public class PP4Sec 
{
	private int numD1, numD2;
	private int check=1000, boxcars=0, faces=6;
	public PP4Sec ()
	{
		roll();
	}
	
/*============================ ============================ ============================ ============================	
 *============================ ============================ ============================ ============================ */	

	public int roll()
	{
		for(int test=1; test<check; test++){
			numD1 = (int) ((Math.random() * faces)+1);
			numD2 = (int) ((Math.random() * faces)+1);
			if(numD1==numD2&&numD1==6){
				++boxcars;
			}
		}	
			return boxcars;
	}
}
public class SharedData 
{
	private int [] array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * 
	 * @param array of integers
	 * @param b number of type int, should be the sum of X numbers in the 'array' array
	 */
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}
	
	/**
	 * 
	 * 
	 * @return method that returns the WinArray
	 */

	public boolean[] getWinArray() 
	{
		return winArray;
	}
	
	
	/**
	 * 
	 * 
	 * @param sets the value for the winArray array
	 */

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
	
	/**
	 * 
	 * 
	 * @return returns an int array
	 */

	public int[] getArray() 
	{
		return array;
	}
	
	/**
	 * 
	 * 
	 * @return returns B of type int
	 */

	public int getB() 
	{
		return b;
	}
	
	/**
	 * 
	 * 
	 * @return returns boolean of the variable flag
	 */

	public boolean getFlag() 
	{
		return flag;
	}
	
	/**
	 * 
	 * 
	 * @param sets the value of the boolean variable flag
	 */

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}

public class Dice{
	private int numSides;
	private int value;
	public Dice(int numSides){
		this.numSides = numSides;
		int random = (int)(Math.random()*numSides)+1;
		value = random;
	}
	public Dice(){
		numSides = 6;
		int random2 = (int)(Math.random()*6)+1;
		value = random2;
	}
	public int getNumSides(){
		return numSides;
	}
	public int getValue(){
		return value;
	}
	public void roll(){
		int randomRoll = (int)(Math.random()*numSides)+1;
	}
	public String toString(){
		return "Number of Sides: " + numSides + ", Value: " + value;
	}
}
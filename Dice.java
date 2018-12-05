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
}
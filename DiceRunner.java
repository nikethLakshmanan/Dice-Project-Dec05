public class DiceRunner{
	public static void main(String[]args){
		//test one
		Dice die = new Dice();
		Dice die2 = new Dice();
		System.out.println(die);
		System.out.println(die2);

		Dice dieNew = new Dice(8);

		DiceHolder.addDie(dieNew);
		DiceHolder d = new DiceHolder();
		System.out.println("\n\n\n\n\n"+d);

	}
}
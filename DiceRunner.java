public class DiceRunner{
	public static void main(String[]args){
		//test one

		Dice dieNew = new Dice(8);

		DiceHolder.addDie(dieNew);
		DiceHolder d = new DiceHolder();
		System.out.println("\n\n\n\n\n"+d);


		int numSnakeEyes = 1;
		int count  = 1;
		boolean counter = false;
		while(counter==false){
			Dice die = new Dice();
			Dice die2 = new Dice();
			System.out.println("Roll Number " + count);
			System.out.println(die);
			System.out.println(die2);
			System.out.println();
			if(die.getValue() == 1 && die2.getValue() == 1){
				System.out.println("The number of rolls needed for Snake Eyes: " + numSnakeEyes);
				counter = true;

			}
			else{
				numSnakeEyes +=1;
				counter = false;
				count ++;
			}
		}

	}
}
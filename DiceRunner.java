public class DiceRunner{
	public static void main(String[]args){
		//test one

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

		Dice dieNew = new Dice(8);

		DiceHolder d = new DiceHolder();
		d.addDie(dieNew);

		System.out.println("\n\n\n\n\n"+d);

		//Test 2

		System.out.println("Test 2");

		DiceHolder t2 = new DiceHolder();
		for(int i=0; i<t2.getSize(); i++){
			int j = (int)((Math.random()*17)+4);
			t2.addDie(new Dice(j));
			System.out.println(t2);
		}
		t2.shake();
		System.out.println("After shaking\n" +t2);

	}
}
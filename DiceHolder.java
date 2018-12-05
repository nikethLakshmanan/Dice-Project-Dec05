import java.util.ArrayList;
public class DiceHolder{

	private ArrayList<Dice> holder = new ArrayList<Dice>();

	public DiceHolder(){
		Dice die1 = new Dice(6);

		holder.add(die1);

	}

	public int addDie(){
		if(holder.size()==6)
			return -1;
		else
			return 1;

	}

	public void shake(){

		for(int i=0; i<6; i++){
			holder.get(i).roll();
			holder.set(i, holder.get(i));
		}

	}






}
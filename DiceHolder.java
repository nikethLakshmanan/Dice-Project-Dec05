import java.util.ArrayList;
public class DiceHolder{

	private ArrayList<Dice> holder = new ArrayList<Dice>();

	public DiceHolder(){
		Dice die1 = new Dice(6);

		holder.add(die1);

	}

	public int addDie(Dice die){
		if(holder.size()==6)
			return -1;
		else{
			holder.add(die);
			return 1;
		}
	}

	public void shake(){

		for(int i=0; i<6; i++){
			holder.get(i).roll();
			holder.set(i, holder.get(i));
		}

	}


	public String toString(){
		String s= " ";
		for(int i=0; i<holder.size(); i++){
			Dice dice = holder.get(i);
			s += dice;
			s += "\n";
		}
		return s;
	}



}
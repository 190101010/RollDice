//programmer: Kübra YAYLA
//program purpose: creating one Die object and roll it three times.
//date: 09.04.2022
class RollDice {

	 int i=1;
	 int n;
	 public void Rolled()
	 {
		while(i<=3)
		{
			n = (int) (Math.random() * 6 +1);
			System.out.println(i + "th number is " + n);
			i++;
		}		 
	}
}

public class MainRoll {

	public static void main(String[] args) {
		RollDice die = new RollDice();
		 die.Rolled();

   }

}
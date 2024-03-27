package studio7;

public class Die {

	private int n;
	
	public Die(int sides) {
		n = sides;
	}
	
	public int roll() {
		int result = (int)(Math.random()*n)+1;
		System.out.println("You rolled a " + result);
		return result;
	}
	
	public static void main(String[] args) {
		Die d6 = new Die(6);
		d6.roll();
	}

}

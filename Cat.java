// extends the Animal class with livesLeft att (int)
// add getLivesleft() and loseLife()

public class Cat extends Animal {

	// instance variables
	private int livesLeft;

	// methods

	// contructor
	public Cat(String name, int livesLeft) {
		super(name);
		// a cat always is born with 9 lives
		this.livesLeft = 9;
	}

	// get lives left
	public int getLivesLeft() {
		return livesLeft;
	}

	// accidents happen
	public void loseLife() {
		// reduces a cat's life by one
		// if no lives left we have a dead kitty

		if (livesLeft > 0) {
			livesLeft -= 1;
		} else {
			System.out.println("The cat it dead");
		}

	}
}
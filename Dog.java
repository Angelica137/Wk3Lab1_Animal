// extends Animal with extra attribute
// exerciseTime(int)
// getter and setters for exercise time
// Override .toString to display dog's details

public class Dog extends Animal {

	// instance variables
	private int exerciseTime;

	// constructor
	public Dog(String name, int exerciseTime) {
		super(name);
		this.exerciseTime = exerciseTime;
	}

	// getters and setters
	public int getTime() {
		return exerciseTime;
	}

	public void setTime(int time) {
		exerciseTime = time;
	}

	// override .toString() to display all the dog's details
	@Override
	public String toString() {
		return super.toString() + "; Exercise time: " + exerciseTime;
	}

}
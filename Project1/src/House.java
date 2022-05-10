
public class House implements Comparable<House>{

	//Parameters of House class
	private final int ID;
	private int duration;
	private double rating;
	
	//Constructor method
	public House(int ID, int duration, double rating) {
		this.ID = ID;
		this.setDuration(duration);
		this.rating = rating;
	}
	//Some getter methods and a setter method for duration updates.
	public int getID() {
		return ID;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getRating() {
		return rating;
	}

	//Overriding compareTo method since House class implements Comparable interface.
	//This method is written for ascending order.
	@Override
	public int compareTo(House o) {
		// TODO Auto-generated method stub
		if(this.ID > o.ID) {
			return 1;
		}
		else if(this.ID < o.ID) {
			return -1;
		}
		return 0;
	}



	
	
	
}

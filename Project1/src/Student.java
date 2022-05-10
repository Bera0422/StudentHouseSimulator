
public class Student implements Comparable<Student> {

	//Parameters of the Student class
	private final int ID;
	private String name;
	private int duration;
	private double rating;
	
	//Constructor method
	public Student(int ID, String name, int duration, double rating) {
		this.ID = ID;
		this.name = name;
		this.duration = duration;
		this.rating = rating;
	}
	
	//Getter methods for Student class
	
	public int getID() {
		return ID;
		
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public double getRating() {
		return rating;
	}

	//Overriding compareTo method since Student class implements Comparable interface.
	//This method is written for ascending order.
	@Override
	public int compareTo(Student o) {
		
		if(this.ID > o.ID) {
			return 1;
		}
		else if(this.ID < o.ID) {
			return -1;
		}
		return 0;
	}


}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class project1main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		//Creating ArrayLists in order to store student and house objects.
		ArrayList<Student> students = new ArrayList<>();
		ArrayList<House> houses = new ArrayList<>();

		Scanner scanner = new Scanner(new File(args[0]));
		PrintStream printStream = new PrintStream(new File(args[1]));

		int maxSemesters = 0;

		//Reading and parsing input file and creating student and houses objects based on those parameters.
		while (scanner.hasNextLine()) {
			String[] params;
			switch (scanner.next()) {
			case "h":
				params = scanner.nextLine().split(" ");

				houses.add(new House(Integer.parseInt(params[1]), Integer.parseInt(params[2]),
						Double.parseDouble(params[3])));

				break;
			case "s":
				params = scanner.nextLine().split(" ");
				int duration = Integer.parseInt(params[3]);

				if (duration > maxSemesters) {
					maxSemesters = duration;
				}

				students.add(
						new Student(Integer.parseInt(params[1]), params[2], duration, Double.parseDouble(params[4])));

				break;
			default:
				break;
			}
		}
		
		//Sorting both lists with respect to their IDs.
		Collections.sort(students);
		Collections.sort(houses);
		
		//Creating a variable to store how many semesters passed.
		int semester = 0;
		//Looking for possible allocations until every student is graduated.
		while (semester < maxSemesters) {
			//Checking for possible lowest ID student to allocate for every house.
			for (House h : houses) {
				for (Student s : students) {
					
					//Removing allocated student from the list and updating house's duration if the below condition satisfies.
					if (s.getRating() <= h.getRating() && h.getDuration() <= 0 && s.getDuration() - semester > 0) {
						students.remove(s);
						h.setDuration(s.getDuration() - semester);
						break;
					}
				}
				//Decreasing duration of houses for every semester passed.
				if (h.getDuration() > 0) {
					h.setDuration(h.getDuration() - 1);
				}
			}
			//Increasing the semester variable which represents the semesters passed.
			semester++;

		}
		
		//At the end of the while loop, the unremoved students in the list will be the students who are graduated without allocation.
		//And those students will be written to the output file by ascending order of IDs.
		for (Student st : students) {
			printStream.append(st.getName() + "\n");
		}
		scanner.close();
		printStream.close();
	}

}

import java.awt.Label;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Milica
 *
 */
public class ManipulateStudents {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList sl = new StudentList();
		Student s1 = new Student("A", 1, 1);
		sl.addToList(s1);
		Student s2 = new Student("B", 1, 1);
		sl.addToList(s2);
		Student s3 = new Student("C", 1, 1);
		sl.addToList(s3);
		Student s4 = new Student("D", 1, 1);
		sl.addToList(s4);
		Student s5 = new Student("E", 1, 1);
		sl.addToList(s5);
		Student s6 = new Student("F", 1, 1);
		sl.addToList(s6);
		Student s7 = new Student("G", 1, 1);
		sl.addToList(s7);
		//sl.printAllStudents();
		sl.removeFromList(s3);
		//sl.printAllStudents();
		List<Student> listaStudenata = new ArrayList<>();
		listaStudenata.add(s1);
		listaStudenata.add(s2);
		Anonimys a = new Anonimys();
		List<Student> milica = a.filter(listaStudenata);
		
		for (Student student : listaStudenata) {
			System.out.println(student.getName());
		}
		
		int compare = a.compare(s1, s2);
		System.out.println("Names: " + compare);
		compare = a.compare(s3, s3);
		System.out.println("Doubles: " + compare);
	}

}

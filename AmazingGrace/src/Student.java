/**
 * 
 */

/**
 * @author Milica
 *
 */

public class Student implements Comparable<Student> {
	
	private String name;
	private int index;
	private double averageGrade;
	public Student next;
	public Student previous;
	
	public Student(String name, int index, double averageGrade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.index = index;
		this.averageGrade = averageGrade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public double getAverageGrade() {
		return averageGrade;
	}
	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.equals(o))
			return 1;
		return -1;
	}

}

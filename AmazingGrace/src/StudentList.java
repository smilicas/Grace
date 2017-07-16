import java.util.List;

public class StudentList {
	
	
	private Student current;
	private Student first;
	private Student last;
	private Student temp;
	private int size;
	
	public StudentList() {
		// TODO Auto-generated constructor stub
		setSize(0);
	}
	
	public void addToList(Student s){
		if (getSize() == 0) {
			current = s;
			first = s;
			setSize(getSize() + 1);
		}
		else if (getSize() > 0) {
			current.next = s;
			temp = current;
			current = s;
			current.previous = temp;
			last = current;
		}
		else {
			try {
				throw new Exception("List is empty");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void removeFromList(Student s){
		if (size > 0) {
			if (s.previous == null) {
				first = s.next;
				first.previous = null;
			}
			else if (s.next == null) {
				last = s.previous;
				last.next = null;
			}
			else{
			s.previous.next = s.next;
			s.next.previous = s.previous;
			}
		}
		else {
			System.out.println("I cannot remove from  empty list ;)");
		}
	}
	
	public void printAllStudents(){
		if (size > 0) {
			current = first;
			do {
				System.out.println(current.getName());
				current = current.next;
			} while (current.next != null);
		}
	}

	public int getSize() {
		return size;
	}

	private void setSize(int size) {
		this.size = size;
	}
	
	public List lista() {
		return null;
	}

}

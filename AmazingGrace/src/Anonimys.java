import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Anonimys {
	
	public <T> List<T> filter (List<T> source){
		List<T> destiny = new ArrayList<T>();
		 for (T t : source) {
			destiny.add(t);
		}
		 
		 return destiny;
	}
	
	public <T extends Comparable<T>> int compare(T t1, T t2){
		return t1.compareTo(t2);
	}

}

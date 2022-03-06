import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class Even {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,6,4,2,5,8,10);
		list.stream().filter(i->i%2==0).forEach(System.out::println);
	}
	
}

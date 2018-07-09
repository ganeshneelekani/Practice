package JavaStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	// TODO Auto-generated method stub
	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);


		Iterator iterator=myList.iterator();
		while (iterator.hasNext()) {
			Integer inter = (Integer) iterator.next();
			System.out.println(inter);
		}
		System.out.println("===========1===========");

		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();

		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();

		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(a -> a > 90);
		//using lambda in forEach
		
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));

		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));

	}


}

package java8;

import java.util.ArrayList;
import java.util.List;

public class JavaImplimentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
		  l.add(i);
		}

		long count = sc.parallelize(l).filter(i -> {
		  double x = Math.random();
		  double y = Math.random();
		  return x*x + y*y < 1;
		}).count();
		System.out.println("Pi is roughly " + 4.0 * count / NUM_SAMPLES);
	}

}


import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		ArrayList <Integer> testInts = new ArrayList<Integer>();
		testInts.add(5);
		testInts.add(6);
		testInts.add(7);
		testInts.add(20);
		testInts.add(40);
	
		System.out.println(Problem1.computeSum(testInts));
	}

}
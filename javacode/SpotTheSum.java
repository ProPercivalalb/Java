package javacode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Alex & Toby
 */
public class SpotTheSum implements IPuzzlerSolver {

	private static int[] numbers = new int[] {47, 62, 78, 34, 36, 53, 19, 18, 20, 43, 46, 24};
	private static int   object  =   165;
	private static ArrayList<ArrayList<Integer>> foundSolutions = new ArrayList<ArrayList<Integer>>();
	
	@Override
	public void run() {
		for(int number1 : numbers) {
			for(int number2 : numbers) {
				for(int number3 : numbers) {
					int sum = number1 + number2 + number3;
					if(sum == object) {
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(number1);
						list.add(number2);
						list.add(number3);
						ArrayList<Integer> ordered = new ArrayList<Integer>();
						while(list.size() > 0) {
							Iterator<Integer> ite = list.iterator();
							int currentSmallest = Integer.MAX_VALUE;
							int index = -1;
							int removeIndex = 0;
							while(ite.hasNext()) {
								int no = ite.next();
								index++;
								if(no < currentSmallest) {
									currentSmallest = no;
									removeIndex = index;
								}
							}
							list.remove(removeIndex);
							ordered.add(currentSmallest);
						}
						if(!foundSolutions.contains(ordered)) {
							System.out.println(String.format("Numbers: %d + %d + %d = %d", ordered.get(0), ordered.get(1), ordered.get(2), object));
							foundSolutions.add(ordered);
						}
					}
				}
			}
		}
	}
}

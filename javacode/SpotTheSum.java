package javacode;

/**
 * @author Alex & Toby
 */
public class SpotTheSum implements IPuzzlerSolver {

	private static int[] numbers = new int[] {47, 62, 78, 34, 36, 53, 19, 18, 20, 43, 46, 24};
	private static int   object  =   165;
	private static int   
	
	@Override
	public void run() {
		for(int number1 : numbers) {
			for(int number2 : numbers) {
				for(int number3 : numbers) {
					int sum = number1 + number2 + number3;
					if(sum == object) {
						System.out.println(String.format("Numbers: %d + %d + %d = %d", number1, number2, number3, object));
					}
				}
			}
		}
	}
}

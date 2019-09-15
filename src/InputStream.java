import java.util.Scanner;

public class InputStream {
	private Scanner inputStream = new Scanner(System.in);
	public int IntInputStream() {
		System.out.println("Enter Count of numbers ");
		return inputStream.nextInt();
	}
	
	public int FormCollection(int count) {
		int[] nums = new int[count];
		for(int i=0; i<count; i++) {
			System.out.println("Enter input " + i);
			nums[i] = inputStream.nextInt();
		}
		return this.PerformMathOperation(nums);
	}
	
	public int PerformMathOperation(int[] nums) {
		int data = 0;
		Calculator calc = new Calculator();
		System.out.println("Enter the Type to perform the operation : ");
		switch(inputStream.next()) {
			case "a":
				data = calc.add(nums);
				break;
			case "b":
				data = calc.sub(nums);
				break;
			case "c":
				data = calc.mul(nums);
				break;
			default:
				System.out.println("You didn't select any method");
		}
		return data;
	}
}


public class Calculator {
	
	public int add(int[] nums) {
		int count = 0;
		for(int num:nums) {
			count += num;
		}
		return count;
	}
	public int sub(int[] nums) {
		int count = 0;
		for(int num:nums) {
			count -= num;
		}
		return count;
	}
	public int mul(int[] nums) {
		int count = 1;
		for(int num:nums) {
			count *= num;
		}
		return count;
	}
}

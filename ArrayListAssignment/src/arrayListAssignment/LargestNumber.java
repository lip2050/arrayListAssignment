package arrayListAssignment;

public class LargestNumber {
	
	public static void main (String []args) {
		
		LargestNumber LN = new LargestNumber();
		int result = LN.largestNumber(23, 3, 4);
		System.out.println(result);
		
	}
	
	public int largestNumber(int x, int y, int z) {
		
		if (x > y && x > z) {
			return x;
		}
		else
			if (y > x && y > z) {
				return y;
			}
		else
			if (z > x && z > y) {
				return z;
			}
		else 
			if (z == x || z == y || x == y) {
				return 0;
			}
		return -1;
		
		
	}

}

package arrayListAssignment;

public class BooleanForMonkeys {
	
	public static void main (String []args) {
		
		BooleanForMonkeys mon = new BooleanForMonkeys();
		boolean result = mon.SmilingMonkeys(1, 0);
		System.out.println(result);
		
	}
	
	public boolean SmilingMonkeys(int aSmile, int bSmile) {
		
		if ((aSmile == 1 && bSmile == 0) || (aSmile == 0 && bSmile == 1)) {
			return true;
		}
		else
			if (aSmile == 0 && bSmile == 0) {
				return true;
			}
		else
		return false;
	}

}

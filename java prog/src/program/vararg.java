package program;

public class vararg {
	public static void main(String[]arg) {
		new vararg().add(3,4,5);
	}
	void add(int... values) {
		int total=0;
		if(values.length>=2) {
			for(int value:values) {
				total+=value;
			}
			System.out.println("addition is: "+total);
		}
	}
}

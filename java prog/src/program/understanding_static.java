package program;

public class understanding_static {
	static int var;
	int other;
	static void func() {
		System.out.println("inside func");
	}
public static void main(String[] args) {
	understanding_static firstref=new understanding_static();
	understanding_static secondref = new understanding_static();
	firstref.var=99;
	System.out.println(secondref.var);
	
	understanding_static.var=78;
	System.out.println(understanding_static.var);
	System.out.println(secondref.var);
	}

}

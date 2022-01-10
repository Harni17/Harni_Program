package program;

public class using_abstract_class {
	public static void main(String[] args) {
		kalpana kalp = new kalpana();
		kalp.dance();
		kalp.sing();
	
		System.out.println("-----------------------");
		
		karuna karu = new karuna();
		karu.dance();
		karu.sing();
		karu.breathe();
	}
}	

abstract class humans{
	abstract void dance();
	abstract void sing();
	void breathe(){
		System.out.println("human breathes");
	}
}

class kalpana extends humans{
	@Override
	void dance() {
		System.out.println("kalp dances");
	}
	@Override
	void sing() {
		System.out.println("kalp sings");
	}
}
	
class karuna extends humans{
@Override
void dance() {
	System.out.println("karu dances");
}
@Override
void sing() {
	System.out.println("karu sings");
}
}


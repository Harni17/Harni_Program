package program;

public class working_with_this{
	public static void main(String[] args) {
		working_with_this ref= new working_with_this();
		ref.met();
		System.out.println("back inside main..");
		
	}
	
	void met(){
		this.func();
		System.out.println("inside met");
		}
	
   void func() {
	   System.out.println("inside func");
   }
}

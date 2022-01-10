package com.harni;

public class ArgumentBasedAnnonymousInnerClass {
public static void main(String[] args) {
		
		//I want to call SomeWork's work()
		SomeWork someWork = new SomeWork();
		someWork.work(new R() {
	
			public void doSomething() {
				System.out.println("Absolutely magical!!!");			
			}
		});

	}

}

interface R{
	void doSomething();
}

class SomeWork{
	void work(R ref) {
		ref.doSomething();
	}
}




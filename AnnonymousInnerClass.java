package com.harni;

public class AnnonymousInnerClass {
public static void main(String[] args) {
		
		//I have a requirement of calling Remote's workFromHome()
		Remote ref = new Remote(){
			public void workFromHome() {
				System.out.println("Wow!!!");
			}
		};
		ref.workFromHome();
	}

}

//1. We are creating a new class
//2. which doesn;t have a name, hence anonymous
//3. and which is a sub class of Remote
//4. We are overriding workFromHome()
// 5. Closing the method definition
// 6. Closing the annonymous sub class definition
//7. We are creating a new object of the annonymous sub class that we just created
//8. We are creating a reference variable of Remote : ref
//9. We are assigning the reference of object of annoymous sub class to ref
//10. We are terminitaing the line with a ;

interface Remote{
	void workFromHome();
}





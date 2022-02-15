package day7;

interface abc{
	public void method1();
	public void method2();
	//public void method3() { }    //can't create a method with a body in it(in interface).
		
}

interface def{
	public void md1();
	public void md2();
}



// comparing to abstract class.

abstract class xyz{
	abstract void meth1() ; // u can't create body here for the abstract method.
	public void meth2() {
		System.out.println("In abstract method u can have a logic inside it\n");
	}
}	

class abst extends xyz{
	void meth1() {
		System.out.println("This method is from the abstract class");
	}
}
    // here an abstract class is inherited into child class and says that a abstract method has to be redefine compulsorily.





public class Interface_Abstract implements abc, def {
	public void md1() {
		System.out.println("This is from the interface DEF\n");
	}
	public void md2() {
		
	}
	public void method2() {
		System.out.println("This is from the interface ABC\n");
	}
	public void method1() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//xyz X = new xyz();     // u cant create object for abstract class.
		//def D = new def();         // cant create object for interface as well.
		Interface_Abstract IA = new Interface_Abstract();
		IA.method2();
		IA.md1();
		
		
		abst ab = new abst();
		ab.meth2();      // here this method is inherited from abstract class to the child class, than through child class object is created to access from there.
		ab.meth1(); 
		
	}

} // Hence multiple inheritance is happening using interface. thank you....

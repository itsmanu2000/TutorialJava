
public class Class_Int extends AbstractClass implements Intf{
	
	public Class_Int() {
		System.out.println(" In constructor of Class_Int ");
	}

	@Override
	public void meth() {
		// TODO Auto-generated method stub
		System.out.println(" In meth method ");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println(" In method1 method ");
		
	}
	
	
	public static void main(String args[]) {
		Class_Int ci = new Class_Int();
		ci.meth();
		ci.method1();
	}

}

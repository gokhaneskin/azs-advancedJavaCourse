package pollymorphism;

public class PolymorphismMain {

	public static void main(String[] args) {
		A nsa=new A();
		B nsb=new B();
		C nsc=new C();
		call(nsa);
		call(nsb);
		call(nsc);
	}

	public static void call(Base base ) {
		base.write();
	}
}
package medium;

public class InterfacesEx {
	public static void m1(One one) { one.a(); }
	public static void m2(Two two) { two.c(); }
	public static void m3(Three three) { three.e(); } 
	public static void m4(Four four) { four.z(); }
	public static void main(String[] args) {
		Implementer a = new Implementer();
		m1(a);
		m2(a);
		m3(a);
		m4(a);
	}
}

class Implementer extends C implements Four{

	@Override
	public void a() {
		System.out.println("a");
	}

	@Override
	public void b() {
		System.out.println("b");
	}

	@Override
	public void c() {
		System.out.println("c");
	}

	@Override
	public void d() {
		System.out.println("d");
	}

	@Override
	public void e() {
		System.out.println("e");
	}

	@Override
	public void f() {
		System.out.println("f");
	}

	@Override
	public void z() {
		System.out.println("z");
	}
	
}

class C{
	int j=19;
	void doSomething() {
		
	}
}

interface One{
	void a();
	void b();
}

interface Two{
	void c();
	void d();
}

interface Three{
	void e();
	void f();
}	

interface Four extends One,Two,Three{
	void z();
}
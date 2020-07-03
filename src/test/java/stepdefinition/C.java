package stepdefinition;

public class C {

	public void sample(I i,I i1) {
		if (i1 instanceof A) {
			A a = (A) i1;
			a.a();
		}

		if (i instanceof B) {
			B b = (B) i;
			b.b();
		}
	}

}



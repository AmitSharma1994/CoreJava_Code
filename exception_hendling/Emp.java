package exception_hendling;

public class Emp {
	int age;

	void get(int age) {

		if (age < 18) {

			try {
				throw new ArithmeticException("invalid age");
			}

			catch (ArithmeticException e) {
				System.out.println(e);
			}
		} else {
			this.age = age;

		}

	}

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.get(10);

	}

}

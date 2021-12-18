package friday17_12;

class Simpleobject {

	Simpleobject() {
		// TODO Auto-generated constructor stub

		System.out.println("create a constuctor successfully..");
	}

	Simpleobject(int a) {
		System.out.println("parameterised constructor:" + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Simpleobject();
		new Simpleobject(50);
	}
}
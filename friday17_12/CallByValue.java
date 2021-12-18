package friday17_12;

class CallByValue {
	void add(int a, int b) {
		int result = a + b;
	}

	public static void main(String[] args) {
		CallByValue cb = new CallByValue();
		int a = 5;
		int b = 8;
		int result = a + b;
		System.out.println("befor call by value:" + result);

		cb.add(a, b);
		System.out.println("after call by value:" + result);
	}

}
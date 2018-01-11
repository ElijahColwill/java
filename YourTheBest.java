class YourTheBest {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int x = Integer.parseInt(args[1]);

		String str = "";

		for (int i=0; i < x; i++) {
			str = str + "!";
		}

		for (int i=0; i <= n; i++) {
			System.out.println("YOU'RE THE BEST" + str);
		}

	}


}
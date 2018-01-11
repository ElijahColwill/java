class Switch {

	public static void main(String[] args) {
		String str = "Sally sells sea shells by the sea shore";
		String strSwitch1 = "sea";
		String strSwitch2 = "shore";

		String result = switchStrings(str, strSwitch1, strSwitch2);
		System.out.println(result);
	}


	public static String switchStrings(String str, String strSwitch1, String strSwitch2) {

		String str1 = str.replace(strSwitch1, strSwitch2);
		String str2 = str1.replace(strSwitch2, strSwitch1);
		return str2;

	}

}
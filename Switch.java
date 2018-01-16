class Switch {

	public static void main(String[] args) {
		String str = "Sally sells sea shells by the sea shore";
		String strSwitch1 = "sea";
		String strSwitch2 = "shore";

		String result = switchStrings(str, strSwitch1, strSwitch2);
		System.out.println(result);
	}


	public static String switchStrings(String str, String strSwitch1, String strSwitch2) {

		String temporary = "TEMPORARY";

		for (int i = 0; i < str.length(); i++){
			search = str.substring(i, i+strSwitch1.length());
			if (str.equal(search)) {
				str = str(0, i) + temporary + str(i+strSwitch1.length());
			}
		}

		System.out.println(str);
		return str;


		// loop through initial in segments of the length of strSwitch1
		//		look for spots the same as strSwitch1
		//		if i find one, replace the segment with a temporary swap string
		
		// loop through initial in segments of the length of strSwitch2
		//		look for spots the same as strSwitch2
		//		if i find one, replace the segment with strSwitch1
		
		// loop through initial in segments of the length of temporary
		//		look for spots the same as temporary
		//		if i find one, replace the segment with strSwitch1

		// str = str.replace(strSwitch1, temporary);
		// str = str.replace(strSwitch2, strSwitch1);
		// str = str.replace(temporary, strSwitch2);
		// return str;

	}

}
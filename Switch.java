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
			if (i <= (str.length() - strSwitch1.length())) {
				String search = str.substring(i, i+strSwitch1.length());
				if (search.equals(strSwitch1)) {
					str = str.substring(0, i) + temporary + str.substring(i+strSwitch1.length(), str.length());
				}
			}
		}

		for (int i = 0; i < str.length(); i++){
			if (i <= ((str.length()) - strSwitch2.length())) {
				String search = str.substring(i, i+strSwitch2.length());
				if (search.equals(strSwitch2)) {
					str = str.substring(0, i) + strSwitch1 + str.substring(i+strSwitch2.length(), str.length());
				}
			}
		}

		for (int i = 0; i < str.length(); i++){
			if (i <= (str.length() - temporary.length())) {
				String search = str.substring(i, i+temporary.length());
				if (search.equals(temporary)) {
					str = str.substring(0, i) + strSwitch2 + str.substring(i+temporary.length(), str.length());
				}
			}
		}

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
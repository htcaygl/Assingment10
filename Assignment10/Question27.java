package assignment10;

public class Question27 {

	public static void main(String[] args) {
		System.out.println(coverString("java methods","me"));
		System.out.println(coverString("Certified Wooden Spoon","o"));

	}

	public static String coverString(String s1, String s2) {
		
		String result ="";
		if(s1.contains(s2)) {
			
			int index=s1.indexOf(s2);
			
			result+=s1.substring(0, index).concat("[").concat(s2).concat("]")+s1.substring(index+s2.length());
		}
		
		return result;
	}

}

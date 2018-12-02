package string;

public class UniqueChar {

	public static void main(String[] args) {
		String a = "name";
		String b = "wolverine";
		String c = "mood";
		boolean isUnique = checkUnique(c);
		System.out.println(isUnique);
	}

	private static boolean checkUnique(String str) {
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<str.length(); j++){
				if(str.charAt(i)==str.charAt(j))
					return true;				
			}
		}
		return false;
	}

}

package string;

public class PlusOne {

	public static void main(String[] args) {
		System.out.println(addOne("59"));
	}

	private static String addOne(String string) {
		char[] ch = string.toCharArray();
		for(int i=ch.length - 1; i >= 0; i--){			
			if(Character.getNumericValue(ch[i]) < 9){
				ch[i] += 1;
				return String.valueOf(ch);
			}
			else{
				ch[i] = '0';
			}
		}
		string = "";
		for(int i=0; i<ch.length; i++){
			string+=0;
		}		
		return "1"+string;
	}

}

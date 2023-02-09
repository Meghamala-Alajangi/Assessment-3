package Assessment;

public class MoveSCTester {
	public static String moveSpecialCharacters(String str) {
		int len = str.length();
		String regex = "[a-zA-Z0-9\\s++]";
		String res1 = "", res2 = "";
		for(int i=0;i<len;i++)
		{
			char c = str.charAt(i);
			
			if(String.valueOf(c).matches(regex))
			{
				res1 = res1 + c;
			}
			else
			{
				res2 = res2 + c;
			}
		}
	
	return res1 + res2;
    }
	
	public static void main(String args[]){
		 String str = "He@#$llo!*&";
		 System.out.println(moveSpecialCharacters(str));
    }
}

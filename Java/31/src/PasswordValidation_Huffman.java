import java.util.Scanner; 

public class PasswordValidation_Huffman {
	public static boolean lower (String str){
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))){
				return true;
			}
		}
		return false;
	}
	public static boolean upper (String str){
		for (int i = 0; i < str.length(); i++){
			if (Character.isUpperCase(str.charAt(i))){
				return true;
			}
		}
		return false;
	}
	public static boolean digit (String str){
		for (int i = 0; i < str.length(); i++){
			if (Character.isDigit(str.charAt(i))){
				return true;
			}
		}
		return false;
	}
	public static boolean match (String str1, String str2){
		if (str1.equals(str2)){
			return true;
		} else {
			return false;
		}
		
	}
	public static boolean eight (String str){
			if (str.length() < 8 ){
				return false;
			} else {
			return true;
		}
}
	
	public static void main(String[] args) {
        Scanner thing = new Scanner(System.in); 
        boolean loop = true;
        
        while (loop){
		System.out.print("Please type in your new password ");
		String NewPassword = thing.nextLine();
		
		System.out.print("Please retype in your new password ");
		String TestPassword = thing.nextLine();
		
		loop = !(lower(NewPassword) && upper(NewPassword) && digit(NewPassword) && match(NewPassword,TestPassword) && eight(NewPassword));
		
		if (loop){
			System.out.println("Password invalid, please try again");
		}
        }
        System.out.println("Password Changed!");
        thing.close();
	}
}





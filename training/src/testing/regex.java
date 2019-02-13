package testing;
import java.util.*;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		
		String s = "255.155.4.255";
		String pattern = "[0-255]\\.[0-255]\\.[0-255]\\.[0-255]";
		if(Pattern.matches(pattern, s)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}

}

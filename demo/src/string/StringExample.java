package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "whatsup";
		System.out.println("string length is: " + s1.length());
		System.out.println("string length is: " + s2.length());
		String s = "hello how are you";
		String s1upper = s.toUpperCase();
		System.out.println(s1upper);

		int value = 20;
		String str = String.valueOf(value);
		System.out.println(str + 17);

		String str1 = "hello how are you";
		String replace = str1.replace('h', 't');
		System.out.println(replace);
		String replaceString = str1.replace("Edureka", "Brainforce");
		System.out.println(replaceString);

		String name = " hello how are you doing?";
		System.out.println(name.contains("how are you")); // returns true
		System.out.println(name.contains("hello")); // returns true
		System.out.println(name.contains("fine"));

		String string = "hello: how: are how you:";
		String[] stringArr = string.split("how");
		for (String string2 : stringArr) {
			System.out.println(string2);
		}
		System.out.println(string.endsWith("u")); // returns true
		System.out.println(string.startsWith("hello")); // returns true
		
		int n=10;
		String str2 = String.valueOf(n);
		//0-209:String:
		String email = "kee@gmail.com";
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(email);
		System.out.println("Email valid "+matcher.matches());
		
		
	}

}

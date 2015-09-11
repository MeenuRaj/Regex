import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email {
public static void main(String arr[])
{
	System.out.println(emailValidation("meenu@gmail.com"));
	System.out.println(emailValidation("meenu978@gwmail.gwu.edu"));
	System.out.println(emailValidation("meenu"));
}

public static boolean emailValidation(String email) {
	String regex = "\\b[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(email);
	if (matcher.matches())
		return true;
	else
		return false;
}
}
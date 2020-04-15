import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    Pattern pattern;
    Matcher matcher;
    public static final String REGEX_CLASS_NAME = "^[A,C,P][0-9]{4}[a-zA-Z0-9]*[G,H,I,K,L,M]$";
    public boolean validateClassName(String string){
        pattern = Pattern.compile(REGEX_CLASS_NAME);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}

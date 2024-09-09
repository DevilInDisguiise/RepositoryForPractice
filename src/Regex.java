import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
    public static void main(String[] args) {
        String m="Fun course at w3schools";
        Pattern pattern=Pattern.compile("w3schools",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(m);
        Boolean ans=matcher.find();
        System.out.println(ans);
        if (ans==true)
        {
            System.out.println("match was found");
        }
        else {
            System.out.println("Match not found");
        }
    }

}

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class MiniStrings {

    public String [] splitBrRegex(String regex, String stringToSplit) throws Exception {
        Pattern regexPattern = Pattern.compile(regex); //hash tag pattern #{2}
        return regexPattern.split(stringToSplit);
    }

    //method to separate by specials "[\^\8%!@;]" ->possible to a list
    //method to search for strings in list that ends with : and add "null"
    //now i should have a (probably list) that contains pairs objects like: "name:product" "price:0.00" "type:Food"
            //"expiration:date" with any missing objects being replaced with null


    public Map<String, String> splitArrayIntoMap(String newRegex, String [] arrayToSplit){
        return null;
    }




}

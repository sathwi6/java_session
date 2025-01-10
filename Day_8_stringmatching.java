import java.util.ArrayList;
import java.util.List;

public class Day_8_stringmatching {

    public static void main(String[] args) {
        Day_8_stringmatching obj = new Day_8_stringmatching();
        String[] words = {"mass", "as", "hero", "superhero"};
        List<String> result = obj.stringMatching(words);
        System.out.println(result);  
    }

    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String sOne = words[i];
            for (int j = 0; j < words.length; j++) {
                String sTwo = words[j];
                if (i != j && sOne.length() < sTwo.length()) {
                    if (isSubstring(sOne, sTwo)) {
                        if (!result.contains(sOne)) { 
                            result.add(sOne);
                        }
                    }
                }
            }
        }
        return result; 
    }

    public boolean isSubstring(String one, String two) {
        for (int i = 0; i <= two.length() - one.length(); i++) { 
            if (one.equals(two.substring(i, i + one.length()))) {
                return true;
            }
        }
        return false;
    }
}




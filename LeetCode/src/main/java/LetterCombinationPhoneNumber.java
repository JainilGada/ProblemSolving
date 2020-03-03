import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationPhoneNumber {
    public static List<String> letterCombinations(String digits) {

        HashMap<Character, String> digitMap = new HashMap<>();
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");

        ArrayList<String> prevList = new ArrayList();
        if (digits.length() == 0) {
            return prevList;
        }

        //adding blank string just for first iteration
        prevList.add("");

        for (Character c : digits.toCharArray()) {
            ArrayList<String> list = new ArrayList();
            for (String s : prevList) {
                for (Character ch : digitMap.get(c).toCharArray()) {
                    list.add(s + ch);
                }
            }
            prevList = list;
        }
        return prevList;
    }
}

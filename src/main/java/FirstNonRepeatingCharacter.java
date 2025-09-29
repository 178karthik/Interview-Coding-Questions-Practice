import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {


    public static void main(String[] args) {
        String s = "swiss";
        Integer count = 1;
        Map<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hash.containsKey(s.charAt(i))) {
                hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
            } else {
                hash.put(s.charAt(i), count);
            }
        }
        for (Map.Entry<Character,Integer> entry: hash.entrySet())  {
           if(entry.getValue()==1)
           {
               System.out.println(entry.getKey());
               break;
           }
        }
    }
}

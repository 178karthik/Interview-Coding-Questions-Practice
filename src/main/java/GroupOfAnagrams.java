import java.util.*;

public class GroupOfAnagrams {
    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = groupOfAnagrams(strs);

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

    public static Map<String, List<String>> groupOfAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char c[] = str.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if (!(map.containsKey(sorted))) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);

        }

        return map;

    }
}
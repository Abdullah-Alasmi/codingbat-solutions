public class wordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s:strings) {
            String tmp = s;
            if (map.containsKey(tmp)) {
                int count = map.get(tmp);
                map.put(tmp, count + 1);
            } else
                map.put(tmp, 1);
        }
        return map;
    }
}

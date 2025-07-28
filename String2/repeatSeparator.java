public class repeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        if(count == 0)
            return "";

        StringBuffer result = new StringBuffer();

        for(int i = 0; i < count - 1; i++) {
            result.append(word);
            result.append(sep);
        }

        return result.append(word).toString();
    }
}

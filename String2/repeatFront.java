public class repeatFront {
    public String repeatFront(String str, int n) {
        StringBuffer result = new StringBuffer();

        for(int i = n; i > 0; i--)
            result.append(str.substring(0, i));

        return result.toString();
    }
}

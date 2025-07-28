public class plusOut {
    public String plusOut(String str, String word) {
        String result = "";
        int i=0;
        int end = 0;
        int l =str.length();
        while(i < str.length()) {
            end = i + word.length();
            if( end > l) {
                end=l;
            }
            if(str.substring(i,end).equals(word)) {
                result = result + word;
                i = i + word.length();
            }
            else {
                result = result + "+";
                i++;
            }
        }
        return result;
    }
}

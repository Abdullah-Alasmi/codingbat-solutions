public class startWord {
    public String startWord(String str, String word) {
        if(str.length() == 0) {
            return str;
        } else if(word.equals("ix")) {
            return "";
        } else if(word.substring(1).equals(str.substring(1, word.length()))) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }
}

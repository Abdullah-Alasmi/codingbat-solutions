public class lastChars {
    public String lastChars(String a, String b) {
        int al = a.length();
        int bl = b.length();
        if(al == 0 && bl == 0) {
            return "@@";
        } else if(al == 0) {
            return "@" + b.charAt(bl - 1);
        } else if (bl == 0) {
            return a.charAt(0) + "@";
        } else {
            return "" + a.charAt(0) + b.charAt(bl - 1);
        }
    }
}

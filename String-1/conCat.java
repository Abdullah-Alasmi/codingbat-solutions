public class conCat {
    public String conCat(String a, String b) {
        if(a.length() == 0) {
            return b;
        } else if (b.length() == 0) {
            return a;
        }else if(a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }
}

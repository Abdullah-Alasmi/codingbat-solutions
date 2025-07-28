public class without2 {
    public String without2(String str) {
        if (str.length() == 0 || str.length() == 2) {
            return "";
        } else if (str.length() == 1) {
            return str;
        } else if((str.substring(str.length() - 2).equals(str.substring(0, 2)))) {
            return str.substring(2);
        } else {
            return str;
        }
    }
}

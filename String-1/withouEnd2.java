public class withouEnd2 {
    public String withouEnd2(String str) {
        if(str.length() == 0 || str.length() == 1) {
            return "";
        } else {
            return str.substring(1, str.length() -1);
        }
    }
}

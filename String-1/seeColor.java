public class seeColor {
    public String seeColor(String str) {
        if(str.length() < 3) {
            return "";
        } else if(str.startsWith("red")) {
            return str.substring(0, 3);
        } else if(str.startsWith("blue")) {
            return str.substring(0,4);
        } else {
            return "";
        }
    }
}

public class hasBad {
    public boolean hasBad(String str) {
        if(str.length() < 3 || str.length() == 3 && str.substring(0,3).equals("xba")) {
            return false;
        } else if(str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
            return true;
        } else {
            return false;
        }
    }
}

public class endsLy {
    public boolean endsLy(String str) {
        int length = str.length();
        if(length <2) {
            return false;
        } else if(str.substring(length-2, length).equals("ly")) {
            return true;
        } else {
            return false;
        }
    }
}

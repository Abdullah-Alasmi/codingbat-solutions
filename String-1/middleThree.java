public class middleThree {
    public String middleThree(String str) {
        int length = str.length();
        if(length == 3) {
            return str;
        } else {
            return str.substring((length/2-1), length - (length/2-1));
        }
    }
}

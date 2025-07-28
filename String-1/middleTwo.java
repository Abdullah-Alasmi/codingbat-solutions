public class middleTwo {
    public String middleTwo(String str) {
        int length = str.length();
        if(length == 2) {
            return str;
        } else {
            return str.substring((length/2) - 1, (length/2) + 1);
        }
    }
}

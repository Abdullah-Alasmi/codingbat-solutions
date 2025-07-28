public class extraFront {
    public String extraFront(String str) {
        if(str.length() < 2) {
            return str + str + str;
        } else {
            String string = str.substring(0, 2);
            return string + string + string;
        }
    }
}

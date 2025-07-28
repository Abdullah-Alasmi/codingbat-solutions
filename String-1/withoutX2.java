public class withoutX2 {
    public String withoutX2(String str) {
        if(str.length() == 0) {
            return "";
        } else if(str.length() < 2) {
            if(str.equals("x") || str.equals("xx")) {
                return "";
            }
            if (str.charAt(0) == 'x') {
                return "" + str.charAt(1);
            }
            if (str.charAt(1) == 'x') {
                return "" + str.charAt(0);
            }
        }
        if(str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.charAt(1) == 'x') {
            return str.charAt(0) + str.substring(2);
        } else {
            return str;
        }
    }
}

public class frontAgain {
    public boolean frontAgain(String str) {
        int subLength = str.length();
        if (subLength < 2) return false;
        return str.substring(0, 2).equals(str.substring(subLength - 2));
    }
}

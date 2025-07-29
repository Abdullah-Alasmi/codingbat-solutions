public class mirrorEnds {
    public String mirrorEnds(String string) {
        String s = "";
        String large = "";
        int end = 0;
        for(int i=0; i<=string.length(); i++) {
            s = string.substring(0,i);
            String ss = new StringBuffer(s).reverse().toString();

            String e = string.substring(string.length()-i);

            if(ss.equals(e)){
                large = s;
            }
        }
        return large;
    }
}

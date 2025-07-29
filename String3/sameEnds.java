public class sameEnds {
    public String sameEnds(String string) {
        String s = "";
        String large = "";
        int end = 0;
        for(int i=0; i<string.length(); i++) {
            s = string.substring(0,i);
            for(int j=i; j<=string.length()-s.length(); j++) {
                if(string.substring(j,j+s.length()).equals(s))
                {
                    large = s;
                }
            }
        }
        return large;
    }
}

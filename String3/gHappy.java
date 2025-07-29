public class gHappy {
    public boolean gHappy(String str) {
        if (str.length() < 1) return true;
        str = "x" + str + "x";
        int fl=0;
        for(int i = 0; i <str.length(); i++) {
            if(str.charAt(i) == 'g') {
                if(str.charAt(i+1) != 'g' && str.charAt(i-1) != 'g') {
                    return false;
                }
                fl=1;
            }
        }
        return (fl==1);
    }
}

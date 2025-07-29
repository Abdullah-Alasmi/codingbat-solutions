public class countTriple {
    public int countTriple(String str) {
        String a = "";
        int count=0;
        for(int i=0; i <= str.length()-3;i++) {
            a = ""+ str.charAt(i);
            if(str.substring(i,i+3).equals(a+a+a)) {
                count++;
            }
        }
        return count;
    }
}

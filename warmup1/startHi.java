package warmup1;

public class startHi {
    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        String checkhi = str.substring(0,2);
        if(checkhi.equals("hi")){
            return true;
        }else{
            return false;
        }
    }
}

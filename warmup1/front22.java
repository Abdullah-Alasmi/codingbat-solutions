package warmup1;

public class front22 {
    public String front22(String str) {
        if (str.length()<=1){
            return str + str  + str;
        }
        else{
            String f2 = str.substring(0,2);
            return f2 + str + f2;
        }
    }
}

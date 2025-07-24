package warmup1;

public class backAround {
    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
}

package Logic1;

public class squirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if((temp >= 60 && temp <=100) && isSummer){
            return true;
        }else if (temp >=60 && temp <=90){
            return true;
        } else {
            return false;
        }
    }
}

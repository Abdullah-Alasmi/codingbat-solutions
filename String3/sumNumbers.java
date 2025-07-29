public class sumNumbers {
    public int sumNumbers(String str) {
        String num = "0";
        int sum = 0;
        str = str + "x";
        for(int i =0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i)) ) {
                num = num + str.charAt(i);
            }

            else if(!Character.isDigit(str.charAt(i))) {
                sum = sum + Integer.parseInt(num);
                num = "0";
            }

        }
        return sum;

    }
}

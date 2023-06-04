public class Problem9 {
    public static void main(String args[]){
        String alphanum= "ABCDE12345";
        StringBuffer numvalue = new StringBuffer();

        for (int i = 0; i < alphanum.length();i++) {
            if (Character.isDigit(alphanum.charAt(i))) {
                numvalue.append(alphanum.charAt(i));
            }
        }
            System.out.println("The Numberic value from given Alphanumber ==> " + numvalue);
    }
}


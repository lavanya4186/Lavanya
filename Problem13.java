public class Problem13 {
    public static void main(String args[]) {
        String a = "Welcome To Java";
        System.out.println("The original sentence ==> " + a);
        String temp1 = " ";
        for (int i = 0; i < a.length(); i++) {
            char temp = a.charAt(i);
            temp1 = temp + temp1;
        }
        System.out.println("The reversed sentence ==> " + temp1);
    }

}

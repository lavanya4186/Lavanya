public class Problem8 {
    public static void main(String args[]) {
        String a="Welcome To Java";
        int spacecount=0;
                for (int i=0;i<a.length();i++) {
                    if (a.charAt(i) == ' ') {
                        spacecount++;
                    }
                }

            System.out.println("The space count value ==> "+spacecount);
            String a1[] = a.split(" ");
            System.out.println("The first word of sentence ==> " + a1[0]);
    }
}

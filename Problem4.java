public class Problem4 {

    public String funcname;
    public int a,b;

    public void function(String oper, int i,int j) {
        funcname = oper;
        a = i;
        b = j;
        switch (oper) {
            case "add":
                System.out.println("The " + oper + " value is ==> " + (i + j));
                break;
            case "sub":
                System.out.println("The " + oper + " value is ==> " + (i - j));
                break;
            case "mul":
                System.out.println("The " + oper + "value is ==> " + (i * j));
                break;
            case "div":
                System.out.println("The " + oper + " value is ==>" + (i / j));
                break;
                     }
    }

    public static void main(String args[])
    {
        Problem4 obj=new Problem4();
        obj.function("add",5,5);
        obj.function("sub",5,2);
        obj.function("mul", 5,6);
        obj.function("div",6,2);
    }
}

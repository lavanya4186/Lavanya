public class Problem12 {

    int objectcount = 0;
    public void object1(){
                objectcount++;
    }
    public int valueofobjectcount() {
        return objectcount;
    }
    public static void main(String args[])
    {
        Problem12 obj=new Problem12();
        obj.object1();
        obj.object1();
        obj.object1();
        int count = obj.valueofobjectcount();
        System.out.println("Number of objects class present in class==> "+count);
    }

}

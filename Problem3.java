import java.util.Scanner;

public class Problem3 {

    public int age;

    public void agevalidation(int a)
    {
        age = a;
        try {
            if (age < 25 || age > 55) {
                throw new Exception("You are not eligible to work");
            }
            else
                System.out.println("You are eligible to work");
            }
        catch(Exception e) {
            System.out.println("AgeException==>" +e.getMessage());
        }

    }

    public static void main(String args[])throws Exception {
        Problem3 obj=new Problem3();
        obj.agevalidation(56);

    }

    }


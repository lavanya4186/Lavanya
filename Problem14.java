import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Problem14 {
    public static void main(String[] args)
    {
        {

            Date  currentdate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = dateFormat.format(currentdate);
            System.out.println("The current date in string format ==> " + dateStr);
        }

    }
}

import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


class DaysBetweenTwoDates{
    public static void main(String[] args){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        String inputString1 = "29 02 2020";
        String inputString2 = "28 02 2021";
        LocalDate date1 = LocalDate.parse(inputString1, formatter);
        LocalDate date2 = LocalDate.parse(inputString2, formatter);
        long days = ChronoUnit.DAYS.between(date1, date2);
        System.out.println ("Days: " + days);
    }
}

 

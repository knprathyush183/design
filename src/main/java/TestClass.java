import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class TestClass {
    private static final String[] spchar = {" ", ".", "-", "@", "#", "$", "%", "&", "*", "+"};
    public static void main(String[] args) {
        /*System.out.println("Hello world");
        DateTime now = new DateTime(DateTimeZone.UTC);
        DateTime firstMomentOfToday = now.withTimeAtStartOfDay().plusDays(1);

        Date date = new DateTime(DateTimeZone.UTC).withTimeAtStartOfDay().plusDays(1).toDate();
        System.out.println( "date: " + date );
        Date secDate = new org.joda.time.LocalDateTime().plusMinutes(5).toDate();
        System.out.println("secDate :" + secDate);*/
        /*String globalId = "globalId.OCI$.Cloud-Gateway for ++Demo&.e72d686f9*99c3430f76d1f09b60eaca3#";
        String formattedGlobalId = formatGlobalId(globalId);
        System.out.println(formattedGlobalId);*/
        /*String test = "msd123456789";
        System.out.println(test.substring(test.length()-10));*/

        System.out.println(convertToString(new Date()));
        System.out.println(convertToDate("2024-06-14T12:56:09.413"));
    }

    private static void testForEach(List<String> testList) {
        testList.forEach(p -> p.concat(" MSD"));
        testList.forEach(p -> System.out.println(p));
    }

    private static String formatGlobalId(String globalId) {
        String formatString = globalId;
        for (String sp : spchar) {
            formatString = formatString.replace(sp, "");
        }
        return formatString;
    }

    private static String convertToString(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
        String convertedDate = null;
        convertedDate = format.format(date);
        return convertedDate;
    }

    private static Date convertToDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        Date convertedDate = null;
        try {
            convertedDate = format.parse(date);
        } catch (ParseException ex) {
            System.out.println("Unable to convert date string {} to date");
        }
        return convertedDate;

    }
}

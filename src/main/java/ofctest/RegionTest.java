package ofctest;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RegionTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Rohit");
        list1.add("Gill");
        list1.add("Kohli");
        list1.add("Iyer");
        list1.add("Rahul");
        System.out.println(list1);
        List<String> list2 = new ArrayList<>();
        list1.removeAll(list2);
        Map<String, Object> varMap = new HashMap<>();
        varMap.put("xyz", "hgv");
        System.out.println(varMap);
        /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date date = new DateTime().toDateTime(DateTimeZone.UTC).toDate();
        System.out.println(simpleDateFormat.format(date));*/
    }

    private static List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("MSD");
        list.add("Sixer");
        return list;
    }
}

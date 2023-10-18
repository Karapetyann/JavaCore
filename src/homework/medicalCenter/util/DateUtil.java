package homework.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class  DateUtil {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    public static int byMinut (Date date){
        int hours = date.getHours();
        int minuts = date.getMinutes();
        minuts = (hours * 60) + minuts;
        return minuts;
    }

    public static Date stringToDate(String dateStr) throws ParseException {
        return SDF.parse(dateStr);
    }

    public static String dateToString(Date date){
        return SDF.format(date);
    }

}

package kr.swmaestro.herring.dql.datatypes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 날짜/시간을 대표하는 데이터 타입 클래스.
 *
 * @author Chiwan Park
 * @since 0.1
 */
public class DateTimeType extends BaseType<Calendar> {
    private static List<String> parsingPattern = new ArrayList<String>() {
        {
            add("yyyy-MM-dd'T'HH:mm:ssZ");
            add("yyyy/MM/dd'T'HH:mm:ssZ");
            add("yyyy-MM-dd");
            add("yyyy/MM/dd");
        }
    };

    public DateTimeType() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();

        this.setType("date");
        this.setValue(calendar);
    }

    public DateTimeType(String value) {
        this();

        boolean flag = false;

        for (String pattern : DateTimeType.parsingPattern) {
            DateFormat dateFormat = new SimpleDateFormat(pattern);

            try {
                Date date = dateFormat.parse(value);
                this.getValue().setTime(date);
                flag = true;
                break;
            } catch (ParseException e) {
            }
        }

        if (flag == false) {
            // TODO: throw exception
        }
    }

    public DateTimeType(long millsValue) {
        this();

        this.getValue().setTimeInMillis(millsValue);
    }
}

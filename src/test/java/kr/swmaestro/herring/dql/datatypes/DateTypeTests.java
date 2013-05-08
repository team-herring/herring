package kr.swmaestro.herring.dql.datatypes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * @author Chiwan Park
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class DateTypeTests {
    private Calendar stdCal1;
    private Calendar stdCal2;

    @Before
    public void setup() {
        // 2013년 7월 24일 오후 10시 15분 2초 (Asia/Seoul)
        stdCal1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
        stdCal1.clear();
        stdCal1.set(2013, 6, 24, 22, 15, 2);

        // 1991년 4월 5일 오전 0시 0분 0초 (System Dependent Time)
        stdCal2 = Calendar.getInstance();
        stdCal2.clear();
        stdCal2.set(1991, 3, 5, 0, 0, 0);
    }

    @Test
    public void testDateTypeFromString() throws Exception {
        DateTimeType dateType = new DateTimeType("1991/04/05");
        Calendar calendar = dateType.getValue();

        Assert.assertTrue(stdCal2.compareTo(calendar) == 0);
    }

    @Test
    public void testDateTypeFromStringWithTime() throws Exception {
        DateTimeType dateType = new DateTimeType("2013-07-24T22:15:02+0900");
        Calendar calendar = dateType.getValue();

        Assert.assertTrue(stdCal1.compareTo(calendar) == 0);
    }

    @Test
    public void testDateTypeFromTimestamp() throws Exception {
        DateTimeType dateType = new DateTimeType(stdCal1.getTimeInMillis());
        Calendar calendar = dateType.getValue();

        Assert.assertTrue(stdCal1.compareTo(calendar) == 0);
    }
}

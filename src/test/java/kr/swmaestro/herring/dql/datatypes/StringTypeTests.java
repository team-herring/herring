package kr.swmaestro.herring.dql.datatypes;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Chiwan Park
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class StringTypeTests {
    @Test
    public void testString() throws Exception {
        StringType stringType = new StringType("Hello Herring!");

        Assert.assertEquals("Hello Herring!", stringType.getValue());
    }
}

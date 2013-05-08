package kr.swmaestro.herring.dql.datatypes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Chiwan Park
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class NumberTypeTests {
    @Test
    public void testNumberInteger() throws Exception {
        NumberType numberType = new NumberType(335);

        Assert.assertTrue(numberType.getValue() == 335);
    }

    @Test
    public void testNumberDouble() throws Exception {
        NumberType numberType = new NumberType(335.01);

        Assert.assertTrue(numberType.getValue() == 335.01);
    }

    @Test
    public void testNumberFromString() throws Exception {
        NumberType numberType = new NumberType("335.01");

        Assert.assertTrue(numberType.getValue() == 335.01);
    }
}

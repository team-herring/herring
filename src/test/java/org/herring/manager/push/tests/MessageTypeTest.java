package org.herring.manager.push.tests;

import org.codehaus.jackson.map.ObjectMapper;
import org.herring.manager.push.message.ErrorMessage;
import org.herring.manager.push.message.SearchBeginMessage;
import org.herring.manager.push.message.SearchEndMessage;
import org.herring.manager.push.message.SearchResultMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.*;

/**
 * @author Chiwan Park
 * @since 0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/webapp")
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/applicationContext.xml")
public class MessageTypeTest {

    @Test
    public void testSearchBeginMessage() throws Exception {
        SearchBeginMessage message = new SearchBeginMessage(UUID.randomUUID());
        ObjectMapper mapper = new ObjectMapper();

        System.out.println(mapper.writeValueAsString(message));
    }

    @Test
    public void testSearchEndMessage() throws Exception {
        SearchEndMessage message = new SearchEndMessage(UUID.randomUUID());
        ObjectMapper mapper = new ObjectMapper();

        System.out.println(mapper.writeValueAsString(message));
    }

    @Test
    public void testSearchResultMessage() throws Exception {
        SearchResultMessage message = new SearchResultMessage(UUID.randomUUID());
        ObjectMapper mapper = new ObjectMapper();

        Map<String, String> data = new HashMap<String, String>();
        data.put("@id", "hello");
        data.put("@value", "hello");

        List<Map<String, String>> dataList = new ArrayList<Map<String, String>>();
        dataList.add(data);

        message.setData(dataList);

        System.out.println(mapper.writeValueAsString(message));
    }

    @Test
    public void testErrorMessage() throws Exception {
        ErrorMessage message = new ErrorMessage(UUID.randomUUID(), true, "테스트입니다.");
        ObjectMapper mapper = new ObjectMapper();

        System.out.println(mapper.writeValueAsString(message));
    }

}

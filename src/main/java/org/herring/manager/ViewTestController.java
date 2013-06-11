package org.herring.manager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * 템플릿 테스트를 위한 컨트롤러 클래스. 각각의 뷰마다 적절힌 Mockup Object에서 데이터를 가져와 보여준다.
 *
 * @author Chiwan Park
 * @since 0.1
 */
@Controller
@RequestMapping("/view-test")
public class ViewTestController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/dashboard/system", method = RequestMethod.GET)
    public String systemDashboard(ModelMap model) {
        Map<String, String> cruiserStatus = new HashMap<String, String>();

        cruiserStatus.put("all_indexed_volume", "1,755.32 GB");
        cruiserStatus.put("first_indexed", "2013-04-22");
        cruiserStatus.put("last_indexed", "2013-05-27");

        Map<String, String> agentStatus = new HashMap<String, String>();

        agentStatus.put("agent_count", "15");

        model.put("cruiserStatus", cruiserStatus);
        model.put("agentStatus", agentStatus);

        return "systemDashboard";
    }
}

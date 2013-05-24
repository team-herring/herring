package kr.swmaestro.herring.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}

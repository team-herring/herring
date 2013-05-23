package kr.swmaestro.herring.manager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 메인 페이지를 출력하는 클래스.
 *
 * @author Chiwan Park
 * @since 0.1
 */
@Controller
@RequestMapping("/")
public class WelcomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String showMain(ModelMap model) {
        return "main";
    }
}

package action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liferay on 2017/10/30.
 */

@Controller
public class Control {

    @RequestMapping("/home")
    String home() {
        return "welcome";
    }

}

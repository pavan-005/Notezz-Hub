package notezzhub.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        LOGGER.info("New user/view");
        return "welcome";
    }
}

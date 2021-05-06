package uk.co.thomasbooker.currencyexchange;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        DeveloperResource[] developerResources = {
                new DeveloperResource("Google", "http://www.google.com"),
                new DeveloperResource("Stackoverflow", "http://www.stackoverflow.com"),
                new DeveloperResource("W3Schools", "http://www.w3schools.com")
        };

        model.addAttribute("resources", developerResources);

        model.addAttribute("name", "Tom");

        return "hello";
    }

    private static final class DeveloperResource {
        private final String name;
        private final String url;

        private DeveloperResource(String name, String url) {
            this.name = name;
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public String getUrl() {
            return url;
        }
    }
}

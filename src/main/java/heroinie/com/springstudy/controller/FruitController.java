package heroinie.com.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FruitController {
    @GetMapping("/hello")
    public String fruit(Model model){
        model.addAttribute("favorite", "grape");
        return "fruit";
    }
}
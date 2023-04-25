package heroinie.com.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FruitController {
    @GetMapping("/hello")
    public String fruit(Model model){
        model.addAttribute("favorite", "grape");
        return "fruit";
    }

    @GetMapping("/parameter")
    public String param(@RequestParam(value = "name", required = false) String name, Model model){
        model.addAttribute("name", name);
        return "parameter";
    }

    @GetMapping("/body")
    @ResponseBody
    public String body(@RequestParam(value = "key", required = false) String key){
        return "key is " + key;
    }

    @GetMapping("/api")
    @ResponseBody
    public CustomClass api(@RequestParam("name") String name){
        CustomClass customClass = new CustomClass();
        customClass.setName(name);
        return customClass;
    }

    static class CustomClass {
        private String name;
        public String age;

        public CustomClass() {
            this.age = "1541";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            System.out.print("zzzz"+name);
            this.name = name;
        }
    }
}
package yonmin.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MarkdownController {

    @RequestMapping("/edit")
    public String editPage(){
        System.out.println("打开编辑页");
        return "edit";
    }

}

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

    @RequestMapping("/blog")
    public String detailPage(){
        System.out.println("打开博客详情页");
        return "blog";
    }

    @RequestMapping("/types")
    public String typesPage(){
        System.out.println("打开分类页");
        return "types";
    }

    @RequestMapping("/tags")
    public String tagsPage(){
        System.out.println("打开标签页");
        return "tags";
    }
    @RequestMapping("/archives")
    public String archivesPage(){
        System.out.println("打开归档页");
        return "archives";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("打开关于我页");
        return "about";
    }

}

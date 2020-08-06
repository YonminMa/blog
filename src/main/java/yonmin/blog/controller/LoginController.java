package yonmin.blog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import yonmin.blog.domain.User;
import yonmin.blog.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping
    public String loginPage(){
        return "/admin/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session){
        User user = userService.checkUser(username, password);
        user.setPassword(null);
        session.setAttribute("user", user);
        return "redirect:/admin/blogs";
    }

    @PostMapping("/check")
    @ResponseBody
    public String fixLogin(@RequestParam String username,
                           @RequestParam String password){
        User user = userService.checkUser(username, password);
        if (user != null){
            return null;
        }
        return "用户名或密码错误";
    }


    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }
}

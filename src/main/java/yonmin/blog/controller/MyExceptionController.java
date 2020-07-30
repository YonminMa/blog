package yonmin.blog.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//@ControllerAdvice
//public class MyExceptionController {
//
//    @ResponseBody
//    @ExceptionHandler(Exception.class)
//    public Map<String, Object> handlerException(Exception e){
//        Map<String, Object> map = new HashMap<>();
//        map.put("code","user.notexist");
//        map.put("message", e.getMessage());
//
//        return map;
//    }
//}
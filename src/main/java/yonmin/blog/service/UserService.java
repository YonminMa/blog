package yonmin.blog.service;

import org.springframework.stereotype.Service;
import yonmin.blog.domain.User;

public interface UserService {
    User checkUser(String username, String password);
}

package yonmin.blog.service;

import yonmin.blog.domain.User;

public interface UserService {
    User checkUser(String username, String password);
}

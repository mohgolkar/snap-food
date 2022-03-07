package com.mapsa.SnapFood2.User;

import java.util.List;


public interface IUserService  {
    User save(User user);
    User  getById(Long id);
    List<User> getAll();
}

package pl.woelke.webSec.service;

import org.springframework.security.core.userdetails.User;
import pl.woelke.webSec.model.UserModel;

public interface IUserService {

    public Integer saveUser(UserModel user);
}

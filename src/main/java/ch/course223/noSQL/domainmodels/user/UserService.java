package ch.course223.noSQL.domainmodels.user;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService{
    User create(User user);

    Iterable<User> findAll();

    User findById(long id);

    User updateById(long id, User user);

    void deleteById(long id);
}

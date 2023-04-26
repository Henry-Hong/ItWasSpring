package heroinie.com.springstudy.repository;

import heroinie.com.springstudy.domain.UserDomain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class UserRepository implements UserRepositoryInterface{

    private static HashMap<Long, UserDomain> users;
    private static Long inc;
    @Override
    public Optional<UserDomain> findOneById(Long id) {
        UserDomain user = users.get(id);
        return Optional.ofNullable(user);
    }

    @Override
    public Optional<UserDomain> findOneByName(String name){
        return users.values().stream().filter(user -> user.getName().equals(name)).findAny();
    }

    @Override
    public List<UserDomain> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public UserDomain save(UserDomain user) {
        user.setId(++inc);
        users.put(user.getId(), user);
        return user;
    }
}

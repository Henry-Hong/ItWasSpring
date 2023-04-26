package heroinie.com.springstudy.repository;

import heroinie.com.springstudy.domain.UserDomain;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryInterface {
    // 유저 정보를 저장하고, 가져오는것
    public Optional<UserDomain> findOneById(Long id);
    public Optional<UserDomain> findOneByName(String name);
    public List<UserDomain> findAll();
    public UserDomain save(UserDomain user);

}

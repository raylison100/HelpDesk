package br.com.UserSpringSecurityExample.api.repository;

import br.com.UserSpringSecurityExample.api.security.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User, String> {

    User findByEmail(String email);


}

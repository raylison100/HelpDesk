package br.com.helpdesk.api.repository;

import br.com.helpdesk.api.security.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User, String> {

    User findByEmail(String email);


}

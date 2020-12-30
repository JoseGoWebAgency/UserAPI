package pt.com.goweb.dbUser.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pt.com.goweb.dbUser.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

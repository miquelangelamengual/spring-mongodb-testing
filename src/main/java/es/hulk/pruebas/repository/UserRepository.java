package es.hulk.pruebas.repository;

import es.hulk.pruebas.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
}

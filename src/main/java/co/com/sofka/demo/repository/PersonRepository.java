package co.com.sofka.demo.repository;

import co.com.sofka.demo.model.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;


@Repository
public interface PersonRepository extends ReactiveMongoRepository<Person, String> {
    Mono<Person> findByName(String name);
}

package org.backendmanager.startapplication.repository;

import org.backendmanager.startapplication.domain.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends MongoRepository<Question, Integer> {

    @Query("{ '_category' : ?0 }")
    List<Question> findAllByCategory(String category);
}

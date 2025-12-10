package com.Board;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);
    Question findBySubjectAndAnswer(String subject, String answer);
    List<Question> findBySubjectLike(String subject);

}

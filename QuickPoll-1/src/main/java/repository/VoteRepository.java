package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import model.Vote;


@Repository
public interface VoteRepository extends CrudRepository<Vote, Long> {
}
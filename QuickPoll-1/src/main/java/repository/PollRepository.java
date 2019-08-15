package repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import model.Poll;


@Repository
public interface PollRepository extends PagingAndSortingRepository<Poll, Long> {
}
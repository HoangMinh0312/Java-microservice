package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import model.Option;

@Repository
public interface OptionRepository extends CrudRepository<Option, Long> {
}
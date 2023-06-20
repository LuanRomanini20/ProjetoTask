package br.com.projp2.projtask.Repository;


import br.com.projp2.projtask.Model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
}


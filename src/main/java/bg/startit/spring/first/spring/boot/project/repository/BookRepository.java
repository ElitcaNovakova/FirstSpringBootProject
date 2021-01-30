package bg.startit.spring.first.spring.boot.project.repository;

import bg.startit.spring.first.spring.boot.project.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {

}

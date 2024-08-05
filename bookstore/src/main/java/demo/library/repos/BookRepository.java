package demo.library.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.library.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
}

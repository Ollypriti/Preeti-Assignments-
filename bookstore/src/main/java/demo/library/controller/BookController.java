package demo.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.library.entities.Book;
import demo.library.repos.BookRepository;

@CrossOrigin("*")
@RestController
public class BookController {
	@Autowired
	private BookRepository repo;
	@GetMapping("/allBooks")
	public List<Book> getBook(){
		return repo.findAll();
	}
	@PostMapping("/saveBook")
	public String addBook(@RequestBody Book book) {
		String res;
		try {
			repo.save(book);
			res="success";
		}catch(Exception e) {
			e.printStackTrace();
			res=e.getMessage();
		}
		return res;
		
	}
	
	
}

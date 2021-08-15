package de.alex.springbootmysql.Controller;

import de.alex.springbootmysql.Model.Book;
import de.alex.springbootmysql.Repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(value = "/books")
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @PostMapping(value = "/books")
    public Book addBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

}

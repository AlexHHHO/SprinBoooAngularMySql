package de.alex.springbootmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class SpringBootMySqlApplication {

	public static void main(String[] args) {

	    SpringApplication.run(SpringBootMySqlApplication.class, args);
	}


// 	@GetMapping("/books")
// 	public String sayHello(){
// 		return "Hello, World!!! " +
// 				" This is Books";
// 	}
//    @Bean
//    CommandLineRunner init(BooksRepository booksRepository) {
//        return args -> {
//            Stream.of("John", "Julie", "Jennifer", "Helen",
//"Rachel").forEach(bookAuthor -> {
//                Books books = new Books(bookAuthor, bookAuthor.toLowerCase() +
//"  Book");
//                booksRepository.save(books);
//            });
//            booksRepository.findAll().forEach(System.out::println);
//        };
//    }


}

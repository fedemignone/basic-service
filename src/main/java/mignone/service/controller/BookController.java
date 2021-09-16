package mignone.service.controller;

import mignone.service.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
        public List<Book> getAllBooks(){
        return Arrays.asList(new Book(1L, "Name12", "Author1"), new Book(2L, "Name2", "Author2"));
    }

}

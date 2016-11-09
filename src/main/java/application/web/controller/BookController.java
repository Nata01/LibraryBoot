package application.web.controller;

import application.core.entity.Book;
import application.core.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by natad on 17.08.2016.
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("")
    public List<Book> getAll(){
        return bookService.findAll();
    }

    @GetMapping("{id}")
    public Book getBook(@PathVariable("id") Long id) {
        return bookService.getById(id);
    }

    @PutMapping("")
    public Book create(@RequestBody Book book){
        bookService.create(book);
        return book;
    }

    @PostMapping("{id}")
    public Book update(@PathVariable("id") Long id, @RequestBody Book book){
        book.setId(id);

        bookService.getById(book.getId());
        bookService.update(book);

        return book;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        Book book = bookService.getById(id);

        bookService.delete(book);
    }

}

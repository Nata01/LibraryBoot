package application.web.controller;

import application.core.entity.Author;
import application.core.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by natad on 06.09.2016.
 */
@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("")
    public List<Author> findAll(){
        return authorService.findAll();
    }

    @GetMapping("{id}")
    public Author findById(@PathVariable("id") Long id){
        Author author = authorService.getById(id);
        return author;
    }

    @PutMapping("")
    public void create(@RequestBody Author author){
        authorService.create(author);
    }

    @PostMapping("{id}")
    public void update(@RequestBody Author author){
        authorService.update(author);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        authorService.delete(id);
    }

}

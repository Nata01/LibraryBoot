package application.core.service;

import application.core.dao.BookDao;
import application.core.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by natad on 16.08.2016.
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    @Transactional
    public List<Book> findAll() {
        List<Book> books = bookDao.findAll();
        for(Book book : books){
            book.getAuthors().size();
        }
        return books;
    }

    @Transactional
    public void create(Book book) {
        bookDao.create(book);
    }

    @Transactional
    public Book getById(Long id) {
        Book book = bookDao.getByPK(id);

        if(book == null){
            throw new IllegalArgumentException("Book with id " + id + "not found");
        }

        book.getAuthors().size();

        return book;
    }

    @Transactional
    public void delete(Book book) {
        bookDao.delete(book);
    }

    @Transactional
    public void update(Book book) {
        bookDao.update(book);
    }
}

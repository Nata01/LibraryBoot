package application.core.service;

import application.core.dao.AuthorDao;
import application.core.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.websocket.server.ServerEndpoint;
import java.util.List;

/**
 * Created by natad on 06.09.2016.
 */
@Service
public class AuthorService {

    @Autowired
    private AuthorDao authorDao;

    @Transactional
    public List<Author> findAll(){
        List<Author> authors = authorDao.findAll();
        return authors;
    }

    @Transactional
    public Author getById(Long id){
        return authorDao.getByPK(id);
    }

    @Transactional
    public void create(Author author) {
        authorDao.create(author);
    }

    @Transactional
    public void update(Author author) {
        authorDao.update(author);
    }

    @Transactional
    public void delete(Long id) {
        Author author = authorDao.getByPK(id);
        authorDao.delete(author);
    }
}

package application.persistence;

import application.core.dao.BookDao;
import application.core.entity.Book;
import org.springframework.stereotype.Repository;

/**
 * Created by natad on 16.08.2016.
 */
@Repository
public class BookDaoImpl extends BaseDaoImpl<Book> implements BookDao {
}

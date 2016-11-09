package application.persistence;

import application.core.dao.AuthorDao;
import application.core.dao.BaseDao;
import application.core.entity.Author;
import org.springframework.stereotype.Repository;

/**
 * Created by natad on 06.09.2016.
 */
@Repository
public class AuthorDaoImpl extends BaseDaoImpl<Author> implements AuthorDao {
}

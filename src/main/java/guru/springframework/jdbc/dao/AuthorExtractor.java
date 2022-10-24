package guru.springframework.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import guru.springframework.jdbc.domain.Author;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 * Created by S.Orlov on 24.10.22
 */
public class AuthorExtractor implements ResultSetExtractor<Author> {
    @Override
    public Author extractData(ResultSet rs) throws SQLException, DataAccessException {
        return new AuthorMapper().mapRow(rs, 0);
    }
}

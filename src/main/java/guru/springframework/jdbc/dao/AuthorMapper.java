package guru.springframework.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import guru.springframework.jdbc.domain.Author;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by S.Orlov on 24.10.22
 */
public class AuthorMapper implements RowMapper<Author> {

    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {

        Author author = new Author();
        author.setId(rs.getLong("id"));
        author.setId(rs.getLong("first_name"));
        author.setId(rs.getLong("last_name"));

        return null;
    }
}

package org.codenova.spring.repository;

import lombok.AllArgsConstructor;
import org.codenova.spring.model.Movie;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

@Repository
@AllArgsConstructor
public class MovieRepository {

    /*
          executeUpdate() 를 해야되는 작업 : insert, update, delete
          은 template.update()

          executeQuery() 를 해야되는 작업 : select
          은 template.query()
        */
    private JdbcTemplate jdbcTemplate;


    public boolean create(Movie movie) {
        String sql = "insert into movies(title, description, genre, release_date) values(?,?,?,?)";
        int r = jdbcTemplate.update(sql,
                movie.getTitle(), movie.getDescription(), movie.getGenre(), movie.getReleaseDate()
                );
        return r > 0 ? true : false;
    }

    public List<Movie> findAll() {
        String sql = "select * from movies";

        List<Movie> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Movie.class) );
        return list;
    }

    public Movie findById(int id){
        String sql = "select * from movies where id = ?";
        List<Movie> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Movie.class) , id);
        return list.size() == 0 ? null : list.get(0);
    }
}
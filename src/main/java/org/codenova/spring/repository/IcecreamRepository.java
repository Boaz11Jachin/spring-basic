package org.codenova.spring.repository;

import lombok.AllArgsConstructor;
import org.codenova.spring.model.Icecream;
import org.codenova.spring.model.Movie;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class IcecreamRepository {

    private JdbcTemplate jdbcTemplate;

    public boolean create(Icecream icecream){
        String sql = "insert into icecream(name, volume, calories, release_date) values(?, ?, ?, ?)";
        int r = jdbcTemplate.update(sql, icecream.getName(), icecream.getVolume(), icecream.getCalories(), icecream.getReleaseDate()
                );
        return r > 0 ? true : false ;
    }

    public List<Icecream> findAll() {
        String sql = "select * from icecream";

        List<Icecream> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Icecream.class) );
        return list;
    }



}

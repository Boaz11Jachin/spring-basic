package org.codenova.spring.repository;

import lombok.AllArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.codenova.spring.model.Movie;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

@Repository
@AllArgsConstructor
public class MovieRepository {

    private SqlSessionTemplate sqlSessionTemplate;

    public boolean create (Movie movie){

        int r = sqlSessionTemplate.insert("movie.create", movie);

        return r>0 ? true : false;

    }

    public List<Movie> findAll() {

         /*
        selectTag 를 사용할때는 selectOne 아니면 selectList 둘중에 하나를 사용한다고 생각하면 됨.
         */
        return sqlSessionTemplate.selectList("movie.findAll");
    }

    public Movie findById(int id){

        // List<Movie> list = session.selectList("movie.findById", id);
        // return list.size() == 0 ? null : list.get(0);

        return sqlSessionTemplate.selectOne("movie.findById", id);

    }
}

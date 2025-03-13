package org.codenova.spring.repository.mysql;

import org.codenova.spring.repository.MovieRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepositoryForMySQL implements MovieRepository {
    @Override
    public boolean create() {
        return false;
    }
}

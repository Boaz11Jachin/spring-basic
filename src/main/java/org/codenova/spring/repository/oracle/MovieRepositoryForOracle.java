package org.codenova.spring.repository.oracle;

import org.codenova.spring.repository.MovieRepository;

public class MovieRepositoryForOracle implements MovieRepository {
    @Override
    public boolean create() {
        return false;
    }
}

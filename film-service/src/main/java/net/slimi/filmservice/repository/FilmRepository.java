package net.slimi.filmservice.repository;

import net.slimi.filmservice.entity.Film;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


@Repository
public interface FilmRepository extends JpaRepository<Film,String>, JpaSpecificationExecutor<Film> {
    Optional<Film> findByPrimaryTitleIgnoreCaseAndOriginalTitleIgnoreCaseAndStartYear(String primaryTitle, String originalTitle, int startYear);
}

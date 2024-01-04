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
    boolean existsByTconst(String tconst);
    @Query("SELECT f FROM Film f " +
            "WHERE (:primaryTitle IS NULL OR LOWER(f.primaryTitle) LIKE LOWER(CONCAT('%', :primaryTitle, '%'))) " +
            "AND (:originalTitle IS NULL OR LOWER(f.originalTitle) LIKE LOWER(CONCAT('%', :originalTitle, '%'))) " +
            "AND (:startYear IS NULL OR f.startYear = :startYear)")
    Page<Film> findAllByCustomCriteria(String primaryTitle, String originalTitle, Integer startYear, Pageable pageable);
    Optional<Film> findByPrimaryTitleIgnoreCaseAndOriginalTitleIgnoreCaseAndStartYear(String primaryTitle, String originalTitle, int startYear);
}

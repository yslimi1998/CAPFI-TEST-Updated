package net.slimi.filmservice.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.*;
import net.slimi.filmservice.entity.Film;
import net.slimi.filmservice.entity.FilmSearch;
import org.springframework.data.jpa.domain.Specification;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Builder
@NoArgsConstructor
public class FilmSpecifications implements Specification<Film>{
private FilmSearch filmSearch;

    public FilmSpecifications(FilmSearch filmSearch) {
        super();
        this.filmSearch = filmSearch;
    }

    @Override
    public Predicate toPredicate(Root<Film> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();

        if (filmSearch.getOriginalTitle() != null && !filmSearch.getOriginalTitle().isEmpty()) {
            predicates.add(criteriaBuilder.like(
                    criteriaBuilder.lower(root.get("originalTitle")),
                    "%" + filmSearch.getOriginalTitle().toLowerCase() + "%"
            ));
        }

        if (filmSearch.getPrimaryTitle() != null && !filmSearch.getPrimaryTitle().isEmpty()) {
            predicates.add(criteriaBuilder.like(
                    criteriaBuilder.lower(root.get("primaryTitle")),
                    "%" + filmSearch.getPrimaryTitle().toLowerCase() + "%"
            ));
        }

        if (filmSearch.getStartYear() != 0) {
            predicates.add(criteriaBuilder.equal(root.get("startYear"), filmSearch.getStartYear()));
        }

        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }

}

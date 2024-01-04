package net.slimi.filmservice.service;

import net.slimi.filmservice.dto.PaginatedFilmResponse;
import net.slimi.filmservice.entity.Film;
import net.slimi.filmservice.entity.FilmSearch;
import net.slimi.filmservice.exceptions.FilmAlreadyExistsException;
import net.slimi.filmservice.repository.FilmRepository;
import net.slimi.filmservice.specification.FilmSpecifications;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public PaginatedFilmResponse getFilmsByCriteria(FilmSearch filmSearch) {
        FilmSpecifications filmSpecifications = new FilmSpecifications(filmSearch);
        PaginatedFilmResponse paginatedFilmResponse = new PaginatedFilmResponse();
        PageRequest pageable = PageRequest.of(filmSearch.getPage(), filmSearch.getSize());
        Page<Film> filmsPage = filmRepository.findAll(filmSpecifications, pageable);
        paginatedFilmResponse.setFilms(filmsPage.getContent());
        paginatedFilmResponse.setTotalElements(filmsPage.getTotalElements());
        paginatedFilmResponse.setTotalPages(filmsPage.getTotalPages());
        return paginatedFilmResponse;
    }


    public PaginatedFilmResponse getAllFilmsWithPaginationSorted(PaginatedFilmResponse paginatedFilmResponse) {
        List<Film> filmSorted = paginatedFilmResponse.getFilms().stream()
                .sorted(Comparator.comparing(Film::getStartYear).reversed())
                .collect(Collectors.toList());

        paginatedFilmResponse.setFilms(filmSorted);
        return paginatedFilmResponse;
    }

}

package net.slimi.filmservice.controller;


import net.slimi.filmservice.dto.PaginatedFilmResponse;
import net.slimi.filmservice.entity.Film;
import net.slimi.filmservice.entity.FilmSearch;
import net.slimi.filmservice.exceptions.FilmAlreadyExistsException;
import net.slimi.filmservice.repository.FilmRepository;
import net.slimi.filmservice.service.FilmService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/capfi")
public class FilmRestController {
    private final FilmService filmService;
    private final FilmRepository filmRepository;


    public FilmRestController(FilmService filmService, FilmRepository filmRepository) {
        this.filmService = filmService;
        this.filmRepository = filmRepository;
    }

    @PostMapping("/specification")
    public PaginatedFilmResponse getFilmsByCriteria(@RequestBody FilmSearch filmSearch) {
        return filmService.getFilmsByCriteria(filmSearch);
    }



    @PostMapping("/films/sorted")
    public PaginatedFilmResponse getAllFilmsWithPaginationSorted(@RequestBody PaginatedFilmResponse paginatedFilmResponse) {
        return filmService.getAllFilmsWithPaginationSorted(paginatedFilmResponse);
    }

    @PostMapping("/save/film")
    public ResponseEntity<String> saveFilm(@RequestBody Film film) {
        // Check if the film with the film already exist
        Optional<Film> filmExist = filmRepository.findByPrimaryTitleIgnoreCaseAndOriginalTitleIgnoreCaseAndStartYear(
                film.getPrimaryTitle(),
                film.getOriginalTitle(),
                film.getStartYear()
        );

        if (filmExist.isPresent()) {
            throw new FilmAlreadyExistsException("Film with primaryTitle, originalTitle, and startYear already exists");
        }

        // Save the film if it doesn't exist
        filmRepository.save(film);

        return new ResponseEntity<>("Film saved successfully", HttpStatus.CREATED);
    }

    @ExceptionHandler(FilmAlreadyExistsException.class)
    public ResponseEntity<String> handleFilmAlreadyExistsException(FilmAlreadyExistsException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }
}
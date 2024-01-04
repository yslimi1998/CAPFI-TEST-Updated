package net.slimi.filmservice.dto;

import lombok.*;
import net.slimi.filmservice.entity.Film;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PaginatedFilmResponse {

    private List<Film> films;
    private long totalElements;
    private int totalPages;
}
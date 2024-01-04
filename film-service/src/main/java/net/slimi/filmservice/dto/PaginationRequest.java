package net.slimi.filmservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.slimi.filmservice.entity.Film;

import java.util.List;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class PaginationRequest {

    private List<Film> films;
    private int page;
    private int Size;
    private long totalElements;
    private int totalPages;
    private String primaryTitle;
    private String OriginalTitle;
    private int startYear;
}

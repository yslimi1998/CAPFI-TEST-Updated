package net.slimi.filmservice.entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilmSearch {
    private String primaryTitle;
    private String originalTitle;
    private int startYear;
    private int page;
    private int size;
}

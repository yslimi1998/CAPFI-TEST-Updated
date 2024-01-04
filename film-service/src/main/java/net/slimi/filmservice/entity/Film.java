package net.slimi.filmservice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(generator = "tconst_generator")
    @GenericGenerator(name = "tconst_generator", strategy = "net.slimi.filmservice.entity.TconstGenerator")
    private String tconst;
    private String titleType;
    private String primaryTitle;
    private String originalTitle;
    private boolean isAdult;
    private  int startYear;
    private  int endYear;
    private int runtimeMinutes;
    private String genres;


}

import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { PaginatedFilmResponse } from "../model/PaginatedFilmResponse";
import { FilmSearch } from "../model/filmSearch";
import { Film } from "../model/film";

@Injectable({
    providedIn: 'root'
  })
export class FilmsService {
    url: string = 'http://localhost:8888/FILM-SERVICE/capfi/'
  
    constructor(private http:HttpClient) { }

    public findAll(filmsearch:FilmSearch){

        return this.http.post<PaginatedFilmResponse>(this.url+'specification',filmsearch);
      }
    
    public sortedByStartYear(paginatedFilmResponse:PaginatedFilmResponse){

        return this.http.post<PaginatedFilmResponse>(this.url+'films/sorted',paginatedFilmResponse);
      }


      public addFilm(film:Film){

        return this.http.post<string>(this.url+'save/film',film);
      }
}

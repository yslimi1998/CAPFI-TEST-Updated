import { Component } from '@angular/core';
import { FilmsService } from '../service/films.service';
import { FilmSearch } from '../model/filmSearch';
import { PaginatedFilmResponse } from '../model/PaginatedFilmResponse';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Film } from '../model/film';

@Component({
  selector: 'app-films',
  templateUrl: './films.component.html',
  styleUrls: ['./films.component.css']
})
export class FilmsComponent {
  filmsSearch!: FormGroup;
  addFilmForm!: FormGroup;


  filmsResponse: PaginatedFilmResponse = {
    films: [],
    totalElements: 0,
    totalPages: 0
  };

  pageSize: number =10;
  currentPage: number = 1;

  constructor(private filmsService: FilmsService, private fb: FormBuilder) {}

  ngOnInit(): void {
    this.filmsSearch = this.fb.group({
      primaryTitle: [null],
      originalTitle: [null],
      startYear: [null]
    });

    this.addFilmForm = this.fb.group({
      primaryTitle: [null],
      originalTitle: [null],
      startYear: [null],
    });
  }
 
  onPageChange(page: number) {
    this.currentPage = page;
    this.searchFilms();
  }

  searchFilms() {
    const formValues = this.filmsSearch.value;
    this.filmsResponse={
      films: [],
      totalElements: 0,
      totalPages: 0
    };
    const request: FilmSearch = {
      primaryTitle: formValues.primaryTitle ,
      originalTitle: formValues.originalTitle,
      startYear: formValues.startYear,
      size: this.pageSize,
      page: this.currentPage - 1
    };

    this.filmsService.findAll(request).subscribe({
      next: data => {
        this.filmsResponse = data;
      },
      error: err => {
        console.log("Error", err);
      }
    });
  }
  filter(){
    this.filmsService.sortedByStartYear(this.filmsResponse).subscribe({
      next: data => {
        this.filmsResponse = data;
      },
      error: err => {
        console.log("Error", err);
      }
    })
  }

  addFilm() {   
    const formValues = this.addFilmForm.value;
    const request: Film = {
      primaryTitle: formValues.primaryTitle,
      originalTitle: formValues.originalTitle,
      startYear: formValues.startYear,
      tconst: '',
      titleType: '',
      adult: '',
      endYear: 0,
      runtimeMinutes: 0,
      genres: ''
    };

    this.filmsService.addFilm(request).subscribe({
      next: data => {
        console.log(data); 
    
      },
      error: err => {
        if (err.status==409) {
          window.alert("Film already Exists!");      
        
      }
      if(err.status==201){
        window.alert("Film added successfully!");
      }
    }
    });
  }
}



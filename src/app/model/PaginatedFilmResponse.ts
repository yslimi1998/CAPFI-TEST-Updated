import { Film } from "./film";

export class PaginatedFilmResponse {

    films!:Film[];
    totalElements!:number;
    totalPages!:number;
}
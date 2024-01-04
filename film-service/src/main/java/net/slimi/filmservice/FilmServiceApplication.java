package net.slimi.filmservice;

import net.slimi.filmservice.entity.Film;
import net.slimi.filmservice.repository.FilmRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class FilmServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(FilmRepository filmRepository){

		return args -> {
			Film film1 = Film.builder()
					.titleType("short")
					.primaryTitle("Carmencita")
					.originalTitle("Carmencita")
					.isAdult(false)
					.startYear(1894)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film2 = Film.builder()
					.titleType("short")
					.primaryTitle("Le clown et ses chiens")
					.originalTitle("Le clown et ses chiens")
					.isAdult(false)
					.startYear(1892)
					.endYear(2012)
					.runtimeMinutes(5)
					.genres("Animation,Short")
					.build();

			Film film3 = Film.builder()
					.titleType("short")
					.primaryTitle("Pauvre Pierrot")
					.originalTitle("Pauvre Pierrot")
					.isAdult(false)
					.startYear(1892)
					.endYear(2012)
					.runtimeMinutes(4)
					.genres("Animation,Comedy,Romance")
					.build();

			Film film4 = Film.builder()
					.titleType("short")
					.primaryTitle("Un bon bock")
					.originalTitle("Un bon bock")
					.isAdult(false)
					.startYear(1892)
					.endYear(2012)
					.runtimeMinutes(12)
					.genres("Animation,Short")
					.build();

			Film film5 = Film.builder()
					.titleType("short")
					.primaryTitle("Blacksmith Scene")
					.originalTitle("Blacksmith Scene")
					.isAdult(false)
					.startYear(1893)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Comedy,Short")
					.build();

			Film film6 = Film.builder()
					.titleType("short")
					.primaryTitle("Chinese Opium Den")
					.originalTitle("Chinese Opium Den")
					.isAdult(false)
					.startYear(1894)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Short")
					.build();

			Film film7 = Film.builder()
					.titleType("short")
					.primaryTitle("Corbett and Courtney Before the Kinetograph")
					.originalTitle("Corbett and Courtney Before the Kinetograph")
					.isAdult(false)
					.startYear(1894)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Short,Sport")
					.build();

			Film film8 = Film.builder()
					.titleType("short")
					.primaryTitle("Edison Kinetoscopic Record of a Sneeze")
					.originalTitle("Edison Kinetoscopic Record of a Sneeze")
					.isAdult(false)
					.startYear(1894)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film9 = Film.builder()
					.titleType("movie")
					.primaryTitle("Miss Jerry")
					.originalTitle("Miss Jerry")
					.isAdult(false)
					.startYear(1894)
					.endYear(2012)
					.runtimeMinutes(45)
					.genres("Romance")
					.build();

			Film film10 = Film.builder()
					.titleType("short")
					.primaryTitle("Leaving the Factory")
					.originalTitle("La sortie de l'usine Lumière à Lyon")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film11 = Film.builder()
					.titleType("short")
					.primaryTitle("Akrobatisches Potpourri")
					.originalTitle("Akrobatisches Potpourri")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film12 = Film.builder()
					.titleType("short")
					.primaryTitle("The Arrival of a Train")
					.originalTitle("L'arrivée d'un train à La Ciotat")
					.isAdult(false)
					.startYear(1896)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film13 = Film.builder()
					.titleType("short")
					.primaryTitle("The Photographical Congress Arrives in Lyon")
					.originalTitle("Le débarquement du congrès de photographie à Lyon")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film14 = Film.builder()
					.titleType("short")
					.primaryTitle("The Waterer Watered")
					.originalTitle("L'arroseur arrosé")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Comedy,Short")
					.build();

			Film film15 = Film.builder()
					.titleType("short")
					.primaryTitle("Autour d'une cabine")
					.originalTitle("Autour d'une cabine")
					.isAdult(false)
					.startYear(1894)
					.endYear(2012)
					.runtimeMinutes(2)
					.genres("Animation,Short")
					.build();

			Film film16 = Film.builder()
					.titleType("short")
					.primaryTitle("Boat Leaving the Port")
					.originalTitle("Barque sortant du port")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film17 = Film.builder()
					.titleType("short")
					.primaryTitle("Italienischer Bauerntanz")
					.originalTitle("Italienischer Bauerntanz")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film18 = Film.builder()
					.titleType("short")
					.primaryTitle("Das boxende Känguruh")
					.originalTitle("Das boxende Känguruh")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Short")
					.build();

			Film film19 = Film.builder()
					.titleType("short")
					.primaryTitle("The Clown Barber")
					.originalTitle("The Clown Barber")
					.isAdult(false)
					.startYear(1898)
					.endYear(2012)
					.genres("Comedy,Short")
					.build();

			Film film20 = Film.builder()
					.titleType("short")
					.primaryTitle("The Derby 1895")
					.originalTitle("The Derby 1895")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short,Sport")
					.build();

			Film film21 = Film.builder()
					.titleType("short")
					.primaryTitle("Blacksmith Scene")
					.originalTitle("Les forgerons")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film22 = Film.builder()
					.titleType("short")
					.primaryTitle("The Sea")
					.originalTitle("Baignade en mer")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film23 = Film.builder()
					.titleType("short")
					.primaryTitle("Opening of the Kiel Canal")
					.originalTitle("Opening of the Kiel Canal")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.genres("News,Short")
					.build();

			Film film24 = Film.builder()
					.titleType("short")
					.primaryTitle("The Oxford and Cambridge University Boat Race")
					.originalTitle("The Oxford and Cambridge University Boat Race")
					.isAdult(false)
					.startYear(1896)
					.endYear(2012)
					.genres("News,Short,Sport")
					.build();

			Film film25 = Film.builder()
					.titleType("short")
					.primaryTitle("The Messers. Lumière at Cards")
					.originalTitle("Partie d'écarté")
					.isAdult(false)
					.startYear(1896)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film26 = Film.builder()
					.titleType("short")
					.primaryTitle("Cordeliers' Square in Lyon")
					.originalTitle("Place des Cordeliers à Lyon")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film27 = Film.builder()
					.titleType("short")
					.primaryTitle("Fishing for Goldfish")
					.originalTitle("La pêche aux poissons rouges")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film28 = Film.builder()
					.titleType("short")
					.primaryTitle("Baby's Meal")
					.originalTitle("Repas de bébé")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film29 = Film.builder()
					.titleType("short")
					.primaryTitle("Rough Sea at Dover")
					.originalTitle("Rough Sea at Dover")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			Film film30 = Film.builder()
					.titleType("short")
					.primaryTitle("Jumping the Blanket")
					.originalTitle("Le saut à la couverture")
					.isAdult(false)
					.startYear(1895)
					.endYear(2012)
					.runtimeMinutes(1)
					.genres("Documentary,Short")
					.build();

			filmRepository.saveAll(List.of(film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12, film13, film14, film15, film16, film17, film18, film19, film20, film21, film22, film23, film24, film25, film26, film27, film28, film29, film30));



		};
	}
}

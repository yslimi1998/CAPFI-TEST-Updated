# Projet Test-Capfi-App

## Description du Projet

Ce projet est une application web développée avec Java 17, Angular 15 et Spring Boot, suivant une architecture microservices avec API Gateway, Eureka Server
, et Actuator. L'objectif de l'application est de permettre aux utilisateurs de visualiser une liste de films à partir d'une source de données chargée via
une base de données mémoire H2 et des services web en Java EE.



## Prérequis

- Java 17
- Angular 15
- Docker
- Docker Compose
- Maven
- H2

## Installation

1. Clonez ce dépôt :

    git clone [lien-vers-le-repo]
    cd Test-Capfi-App
    
2. Générez les fichiers JAR pour les microservices :

    cd film-service
    mvn clean install
    cd ..

    cd discovery-service
    mvn clean install
    cd ..

    cd gateway-service
    mvn clean install
    cd ..
    

3. Lancer l'application avec Docker Compose :

    ```bash
    docker-compose up --build

    ```

4. Accédez à l'application dans votre navigateur :

   - Frontend: http://localhost:80
   - Film Service: http://localhost:8081
   - Discovery Service (Eureka Server): http://localhost:8761
   - API Gateway: http://localhost:8888/FILM-SERVICE/capfi

   Vous pouvez ajouter n'importe quel chemin du Film Service à la fin de l'URL, par exemple : http://localhost:8888/FILM-SERVICE/votre-chemin

## Configuration

### Frontend (Angular)
Aucune configuration spécifique nécessaire.

### Film Service (Spring Boot)
La configuration spécifique au Film Service peut être trouvée dans le fichier `application.properties`.

### Discovery Service (Eureka Server)
Aucune configuration spécifique nécessaire.

### API Gateway (Spring Boot)
La configuration spécifique à l'API Gateway peut être trouvée dans le fichier `application.properties`.

## Fonctionnalités

- **Recherche :** L'application permet aux utilisateurs d'effectuer une recherche sur les films en utilisant les critères suivants : 
primaryTitle, originalTitle, startYear.La fonction de recherche intègre la pagination afin d'optimiser les performances, assurant ainsi une expérience
fluide même lors de l'affichage d'un grand nombre de résultats.
- **Filtre/Tri :** Les utilisateurs peuvent organiser la liste par `startYear`.
- **Ajout d'un film :** Les utilisateurs peuvent ajouter un film via une popup en précisant les champs : primaryTitle, originalTitle, startYear. 
Un message de confirmation s'affiche si le film est ajouté avec succès, et un message d'erreur est affiché si le film existe déjà.


## Technologies Utilisées

- Java 17
- Angular 15
- Spring Boot
- Docker
- Maven
- H2


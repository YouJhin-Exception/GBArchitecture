package src;

import src.Adapters.ConsolePrinter;
import src.Adapters.MovieReviewsRepo;
import src.Adapters.UserCommand;
import src.Application.IFetchMovieReviews;
import src.Application.IPrintMovieReviews;
import src.Application.IUserInput;
import src.Application.MovieUser;
import src.Domain.MovieSearchRequest;

public class MainMove {
    public static void main(String[] args) {

        IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        IPrintMovieReviews printMovieReviews = new ConsolePrinter();
        IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);

        MovieUser movieUser = new MovieUser(userCommand);
        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTrekRequest = new MovieSearchRequest("StarTreck");

        System.out.println("Displaying reviews for movie " + starTrekRequest.getMovieName());
        movieUser.processInput(starTrekRequest);
        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);
    }
}
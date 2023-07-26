package src.Adapters;

import src.Application.IFetchMovieReviews;
import src.Application.IPrintMovieReviews;
import src.Application.IUserInput;
import src.Application.MovieApp;
import src.Domain.Model;
import src.Domain.MovieSearchRequest;

public class UserCommand implements IUserInput {
    private Model model;

    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}

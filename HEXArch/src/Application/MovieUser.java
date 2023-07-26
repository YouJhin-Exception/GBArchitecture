package src.Application;

import src.Domain.MovieSearchRequest;

public class MovieUser {
    private src.Application.IUserInput userInputDriverPort;
    public MovieUser(src.Application.IUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }

    public void processInput(MovieSearchRequest movieSearchRequest)
    {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}

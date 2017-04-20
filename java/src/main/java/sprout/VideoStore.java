package sprout;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    private final List<Movie> allMovies;

    public VideoStore(List<Movie> movies) {
        this.allMovies = movies;
    }

    public List<Movie> getAvailableMoviesFor(Customer customer) {
        List<Movie> availableMovies = new ArrayList<>();

        for (int i = 0; i < allMovies.size(); i++) {
            Movie currentMovie = allMovies.get(i);

            // some logic here

            availableMovies.add(new Movie(currentMovie.getTitle(), currentMovie.getRate()));

            //
        }

        // ...

        return availableMovies;
    }

























    //List<Movie> allMovies = getPermittedMovies(customer);
//    public List<Movie> getPermittedMovies(Customer customer) {
//        List<Movie> movies = new ArrayList<>();
//
//        for (int i = 0; i < this.allMovies.size(); i++) {
//            Movie currentMovie = allMovies.get(i);
//
//            if (currentMovie.getRate() > customer.getAge()) {
//                continue;
//            }
//
//            movies.add(new Movie(currentMovie.getTitle(), currentMovie.getRate()));
//        }
//
//        return movies;
//    }
}


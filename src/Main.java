public class Main {
    public static void main(String[] args) {
        String favoriteMovie = "Bodied";
        System.out.println("Hiiii");
        System.out.println("My favorite movie is " + favoriteMovie);
        int releaseDate = 2018;
        String genre = "Comedy";
        float IMDbRating = 8;
        boolean partOfASeries = false;
        char directorInitial = 'D';
        System.out.println("It was released in " + releaseDate);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + IMDbRating);
        System.out.println("Part of a series? " + partOfASeries);
        System.out.println("Director: " + directorInitial);
        String[] favGenres = {"Comedy", "Animation", "Fantasy"};
        System.out.println("Movie Genre: " + favGenres[0]);
        System.out.println("Movie Genre: " + favGenres[1]);
        System.out.println("Movie Genre: " + favGenres[2]);
    }
}
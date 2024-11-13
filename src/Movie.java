public class Movie {
    private String title;
    private double rating;
    private String genre;
    private String country;
    private boolean hasOscar;

    public Movie(String title, double rating, String genre, String country, boolean hasOscar) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.hasOscar = hasOscar;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", hasOscar=" + hasOscar +
                '}';
    }

    // main метод для тестирования Movie
    public static void main(String[] args) {
        // Создаем объект Movie
        Movie movie = new Movie("Inception", 8.8, "Sci-Fi", "USA", true);

        // Выводим информацию о фильме
        System.out.println(movie);
    }
}

import java.util.List;

public class Company {
    private String name;
    private int yearFounded;
    private List<Movie> movies;

    public Company(String name, int yearFounded, List<Movie> movies) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" (основана в ").append(yearFounded).append("): ");

        for (Movie movie : movies) {
            sb.append(movie.getTitle()).append(", ");
        }

        // Удаление последней запятой и пробела
        if (movies.size() > 0) {
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Создаем фильмы для каждой компании
        Movie movie1 = new Movie("Inception", 8.8, "Sci-Fi", "USA", true);
        Movie movie2 = new Movie("The Dark Knight", 9.0, "Action", "USA", true);
        Movie movie3 = new Movie("Interstellar", 8.6, "Sci-Fi", "USA", false);

        Movie movie4 = new Movie("Pulp Fiction", 8.9, "Crime", "USA", true);
        Movie movie5 = new Movie("Kill Bill", 8.1, "Action", "USA", false);
        Movie movie6 = new Movie("Django Unchained", 8.4, "Western", "USA", true);

        Movie movie7 = new Movie("Spirited Away", 8.6, "Animation", "Japan", true);
        Movie movie8 = new Movie("My Neighbor Totoro", 8.2, "Animation", "Japan", false);
        Movie movie9 = new Movie("Princess Mononoke", 8.4, "Animation", "Japan", false);

        // Создаем компании с их фильмами
        Company company1 = new Company("Warner Bros", 1923, List.of(movie1, movie2, movie3));
        Company company2 = new Company("Miramax", 1979, List.of(movie4, movie5, movie6));
        Company company3 = new Company("Studio Ghibli", 1985, List.of(movie7, movie8, movie9));

        // Создаем список компаний
        List<Company> companies = List.of(company1, company2, company3);

        // Выводим информацию о каждой компании и ее фильмах
        for (Company company : companies) {
            System.out.println(company);
        }
    }
}

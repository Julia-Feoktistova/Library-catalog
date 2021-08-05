package company.domain;

public enum Genre {

    FANTASY ("Фэнтези"),
    FANTASTIC ("Фантастика"),
    ROMANTIC ("Романтика"),
    COMEDY ("Комедия"),
    DETECTIVE ("Детектив"),
    SCIENCE ("Научная литература");

    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}

package domain;

public class Movie {
    private String title;
    private int rate;

    public Movie(String title, int rate) {
        this.title = title;
        this.rate = rate;
    }

    public String getTitle() {
        return this.title;
    }

    public int getRate() {
        return rate;
    }
}

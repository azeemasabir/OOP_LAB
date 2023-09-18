package lab03;

public class Music {
    private String title;
    private String duration;
    private String genre;
    private Date releaseDate;
    private Person singer;

    public Music(String title, String duration, String genre, Date releaseDate, Person singer) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.singer = singer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setSinger(Person singer) {
        this.singer = singer;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Person getSinger() {
        return singer;
    }



    @Override
    public String toString() {
        return String.format("Title: %s\nDuration: %s\nGenre: %s\nRelease Date: %s\nSinger: %s",
                title, duration, genre, releaseDate, singer.getName());
    }
}



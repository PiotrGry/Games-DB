package model;

public class Game {
    private int gameId;
    private String gameTitle;
    private int numbersOfSoldCopies;
    private int relaseYear;
    private String genre;
    private String publisher;


//To use INSERT INTO statement
    public Game(String gameTitle, int numbersOfSoldCopies, int releaseYear, String genre, String publisher) {
        this.gameTitle = gameTitle;
        this.numbersOfSoldCopies = numbersOfSoldCopies;
        this.relaseYear = releaseYear;
        this.genre = genre;
        this.publisher = publisher;
    }
//To load form database
    public Game(int gameId, String gameTitle, int numbersOfSoldCopies, int relaseYear, String genre, String publisher) {
        this.gameId = gameId;
        this.gameTitle = gameTitle;
        this.numbersOfSoldCopies = numbersOfSoldCopies;
        this.relaseYear = relaseYear;
        this.genre = genre;
        this.publisher = publisher;
    }

    public int getGameId() {
        return gameId;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public int getNumbersOfSoldCopies() {
        return numbersOfSoldCopies;
    }

    public int getRelaseYear() {
        return relaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return String.format("gameId= %d, gameTitle= %s, numbersOfSoldCopies= %d, relaseYear= %d, genre= %s, publisher= %s", gameId, gameTitle, numbersOfSoldCopies, relaseYear, genre, publisher);
    }
}

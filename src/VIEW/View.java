package VIEW;

import model.Game;

import java.util.Scanner;

public class View {

    public Game getApplicantInput(){
        String gameTitle = getInput("Title: ");
        int totalSold = Integer.parseInt(getInput("Total sold copies: "));
        int year = Integer.parseInt(getInput("year realsed: "));
        String genre = getInput("Genre: ");
        String publisher = getInput("Publisher: ");


        return new Game(gameTitle, totalSold, year, genre, publisher);
}

    private String getInput(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

}

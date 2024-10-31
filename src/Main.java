import br.com.serda.southmap.models.GameInfo;

public class Main {
    public static void main(String[] args) {
        GameInfo newGame = new GameInfo();

        newGame.setGameName("The Legend of Zelda: Ocarina of Time");
        newGame.setGameDescription("É um jogo 3D de Nintendo 64");
        newGame.setGameYearOfLaunch(1998);

        newGame.showInformation();

        newGame.rating(8);
        newGame.rating(10);
        newGame.rating(6);

        System.out.println("A quantidade de avaliações é: " + newGame.getTotalRating());

        System.out.println("A média das avaliações é: " + newGame.getAverage());
    }
}
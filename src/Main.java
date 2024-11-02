import br.com.serda.southmap.calculos.ClassificationFilter;
import br.com.serda.southmap.models.GameInfo;
import br.com.serda.southmap.calculos.calculation;
import br.com.serda.southmap.models.MovieInfo;

public class Main {
    public static void main(String[] args) {
        GameInfo newGame = new GameInfo();
        GameInfo anotherGame = new GameInfo();
        MovieInfo newMovie = new MovieInfo();

        newGame.setName("The Legend of Zelda: Ocarina of Time");
        newGame.setDescription("É um jogo 3D de Nintendo 64");
        newGame.setYearOfLaunch(1998);
        newGame.setHoursToBeat(27.2);

        anotherGame.setName("Super Mario 64");
        anotherGame.setDescription("É um jogo 3D de Nintendo 64");
        anotherGame.setYearOfLaunch(1999);
        anotherGame.setHoursToBeat(20.3);

        newMovie.setName("O Planeta do Tesouro");
        newMovie.setDescription("O Planeta do Tesouro é um filme de fantasia e aventura");
        newMovie.setYearOfLaunch(2005);
        newMovie.setHoursToBeat(1.5);


        newGame.showInformation();

        newGame.rating(8);
        newGame.rating(10);
        newGame.rating(6);

        System.out.println("A quantidade de avaliações é: " + newGame.getTotalRating());

        System.out.println("A média das avaliações é: " + newGame.getAverage());

        calculation newCalculation = new calculation();

        newCalculation.includes(newGame);
        newCalculation.includes(anotherGame);
        newCalculation.includes(newMovie);

        System.out.println(newCalculation.getTotalTime());

        ClassificationFilter filter = new ClassificationFilter();
        filter.filter(newGame);

    }
}
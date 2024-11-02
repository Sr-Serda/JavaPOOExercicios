package br.com.serda.southmap.calculos;
import br.com.serda.southmap.models.MovieInfo;
import br.com.serda.southmap.models.Title;


public class calculation {
    private double totalTime;

    public double getTotalTime() {
        return totalTime;
    }

    public void includes(Title title){
         totalTime += title.getHoursToBeat();
    }

}

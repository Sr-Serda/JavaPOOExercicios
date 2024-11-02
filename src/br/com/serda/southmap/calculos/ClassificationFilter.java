package br.com.serda.southmap.calculos;

public class ClassificationFilter {

    public void filter(Classification classification){
        if (classification.getClassification() >= 4) {
            System.out.println("Está entre os preferidos");
        }else if(classification.getClassification() >= 2){
            System.out.println("Bem avaliados");
        }else {
            System.out.println("Coloque aqui sua avaliação");
        }
    }
}

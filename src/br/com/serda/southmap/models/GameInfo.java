package br.com.serda.southmap.models;

import br.com.serda.southmap.calculos.Classification;

public class GameInfo extends Title implements Classification {
    private double spaceRequired;



    public double getSpaceRequired() {
        return spaceRequired;
    }

    public void setSpaceRequired(double spaceRequired) {
        this.spaceRequired = spaceRequired;
    }

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }
}


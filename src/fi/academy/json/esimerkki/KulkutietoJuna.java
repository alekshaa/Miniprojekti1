package fi.academy.json.esimerkki;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KulkutietoJuna {

    //Tämän luokan avulla voidaan hakea junan kulkutietoviestejä, minka avulla saa junan seuraavan ja edellisen aseman
    //(datan laatu ei optimaalista)
    //-Paula-

    private String trainNumber;
    private String nextStation;
    private String previousStation;

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getNextStation() {
        return nextStation;
    }

    public void setNextStation(String nextStation) {
        this.nextStation = nextStation;
    }

    public String getPreviousStation() {
        return previousStation;
    }

    public void setPreviousStation(String previousStation) {
        this.previousStation = previousStation;
    }
}

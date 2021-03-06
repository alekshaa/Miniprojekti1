package fi.academy.json.esimerkki;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Juna {

    private boolean cancelled;
    private String commuterLineID;
    //LocalDate departureDate;  // Jackson ei oikein pidä Java 8 päivistä oletuksena
    private Date departureDate;
    private String operatorShortCode;
    private int operatorUICCode;
    private boolean runningCurrently;
    public List<TimeTableRow> timeTableRows;
    private Date timetableAcceptanceDate;
    private String timetableType;
    private String trainCategory;
    private int trainNumber;
    private String trainType;
    private long version;


    public String perustiedot () {
        return "Juna nro " + trainNumber + ", ID: " + getCommuterLineID() + ", lähtöaika: " + timetableType;
    }

    @Override
    public String toString() {
        return "Juna{" + "cancelled=" + cancelled
                + ",\n commuterLineID='" + commuterLineID + '\''
                + ",\n departureDate=" + departureDate
                + ",\n operatorShortCode='" + operatorShortCode + '\''
                + ",\n operatorUICCode=" + operatorUICCode
                + ",\n runningCurrently=" + runningCurrently
                + ",\n timeTableRows=" + timeTableRows
                + ",\n timetableAcceptanceDate=" + timetableAcceptanceDate
                + ",\n timetableType='" + timetableType + '\''
                + ",\n trainCategory='" + trainCategory + '\''
                + ",\n trainNumber=" + trainNumber
                + ",\n trainType='" + trainType + '\''
                + ",\n version=" + version
                + '}';
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getCommuterLineID() {
        return commuterLineID;
    }

    public void setCommuterLineID(String commuterLineID) {
        this.commuterLineID = commuterLineID;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    //public LocalDate aika () { return departureDate}

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getOperatorShortCode() {
        return operatorShortCode;
    }

    public void setOperatorShortCode(String operatorShortCode) {
        this.operatorShortCode = operatorShortCode;
    }

    public int getOperatorUICCode() {
        return operatorUICCode;
    }

    public void setOperatorUICCode(int operatorUICCode) {
        this.operatorUICCode = operatorUICCode;
    }

    public boolean isRunningCurrently() {
        return runningCurrently;
    }

    public void setRunningCurrently(boolean runningCurrently) {
        this.runningCurrently = runningCurrently;
    }

    public List<fi.academy.json.esimerkki.TimeTableRow> getTimeTableRows() {
        return timeTableRows;
    }

    public void setTimeTableRows(List<fi.academy.json.esimerkki.TimeTableRow> timeTableRows) {
        this.timeTableRows = timeTableRows;
    }

    public Date getTimetableAcceptanceDate() {
        return timetableAcceptanceDate;
    }

    public void setTimetableAcceptanceDate(Date timetableAcceptanceDate) {
        this.timetableAcceptanceDate = timetableAcceptanceDate;
    }

    public String getTimetableType() {
        return timetableType;
    }

    public void setTimetableType(String timetableType) {
        this.timetableType = timetableType;
    }

    public String getTrainCategory() {
        return trainCategory;
    }

    public void setTrainCategory(String trainCategory) {
        this.trainCategory = trainCategory;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

}

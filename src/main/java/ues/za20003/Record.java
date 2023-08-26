package ues.za20003;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Record {
    private static int numberConsultation = 0;
    private String veterinarianName;
    private String diagnosis;
    private LocalDateTime dateTime;
    private String dateTimeFormat;

    public Record() {

    }

    public Record(String veterinarianName, String diagnosis) {
        numberConsultation += 1;
        this.veterinarianName = veterinarianName;
        this.diagnosis = diagnosis;
        this.dateTime = LocalDateTime.now();
    }

    public int getNumberConsultation() {
        return numberConsultation;
    }

    public String getVeterinarianName() {
        return veterinarianName;
    }

    public void setVeterinarianName(String veterinarianName) {
        this.veterinarianName = veterinarianName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getDateTimeFormat(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.dateTimeFormat = this.dateTime.format(formatter);
        return this.dateTimeFormat;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Numero de consulta: " + numberConsultation + "\nDiagnostico: " + this.diagnosis
                + "\nFecha y Hora: " + getDateTimeFormat() + "\nNombre del Veterinario: "
                + this.veterinarianName;
    }

}

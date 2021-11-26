package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public abstract class Predmet {

    private String ime;
    private boolean obavezan;
    private int bodovi;
    private List<Student> studenti;

    public Predmet(String ime, boolean obavezan, int bodovi) {
        this.ime = ime;
        this.obavezan = obavezan;
        this.bodovi = bodovi;
        studenti = new ArrayList<>();
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public boolean isObavezan() {
        return obavezan;
    }

    public void setObavezan(boolean obavezan) {
        this.obavezan = obavezan;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public int getBodovi() {
        return bodovi;
    }

    public void setBodovi(int bodovi) {
        this.bodovi = bodovi;
    }

    public void upisiStudenta(Student student) {
        if(studenti.contains(student)) throw new IllegalArgumentException("Student je vec upisan u predmet!");
        studenti.add(student);
    }

    public void ispisiStudenta(Student student) {

        if(!studenti.contains(student)) throw new IllegalArgumentException("Student nije upisan u predmet!");
        studenti.remove(student);

    }


}

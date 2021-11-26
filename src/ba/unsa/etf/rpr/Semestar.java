package ba.unsa.etf.rpr;

import java.util.List;

public class Semestar {

    private String ciklus;
    private int broj;
    private List<Predmet> predmeti;


    public Semestar(String ciklus, int broj, List<Predmet> predmeti) {
        this.ciklus = ciklus;
        this.broj = broj;
        this.predmeti = predmeti;
    }

    public String getCiklus() {
        return ciklus;
    }

    public void setCiklus(String ciklus) {
        this.ciklus = ciklus;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public List<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<Predmet> predmeti) {
        this.predmeti = predmeti;
    }
}

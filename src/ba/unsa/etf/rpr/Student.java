package ba.unsa.etf.rpr;

import java.util.List;

public class Student {

    private String ime;
    private String prezime;
    private List<Predmet> predmeti;



    public void testirajBrojECTSPoena(List<Predmet> predmeti) {
        int suma=0;
        for(Predmet predmet : predmeti)
            suma += predmet.getBodovi();

        if(suma<30) throw new IllegalArgumentException("Broj ECTS poena je manji od 30!");
    }


    public Student(String ime, String prezime, List<Predmet> predmeti) {
        testirajBrojECTSPoena(predmeti);

        this.ime = ime;
        this.prezime = prezime;
        this.predmeti = predmeti;
        predmeti.forEach((Predmet p) -> {p.upisiStudenta(this);});
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public List<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public void dodajPredmet(Predmet predmet) {

        predmet.upisiStudenta(this);
        predmeti.add(predmet);
    }

    public void skiniPredmet(Predmet predmet) {

        List<Predmet> pomocni = predmeti;
        pomocni.remove(predmet);
        testirajBrojECTSPoena(pomocni);
        predmet.ispisiStudenta(this);
        predmeti=pomocni;

    }
}

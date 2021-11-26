package ba.unsa.etf.rpr;

import java.util.List;

public class Student {

    private String ime;
    private String prezime;
    private PlanStudija planStudija;
    private List<Predmet> predmeti;
    private int brojIndeksa;




    public Student(String ime, String prezime,PlanStudija planStudija ,List<Predmet> predmeti, int brojIndeksa) {
        testirajBrojECTSPoena(predmeti);
        this.ime = ime;
        this.prezime = prezime;
        this.planStudija=planStudija;
        this.predmeti = predmeti;
        predmeti.forEach((Predmet p) -> p.upisiStudenta(this));
        this.brojIndeksa = brojIndeksa;
    }

    public void testirajBrojECTSPoena(List<Predmet> predmeti) {
        int suma=0;
        for(Predmet predmet : predmeti)
            suma += predmet.getBodovi();

        if(suma<30) throw new IllegalArgumentException("Broj ECTS poena je manji od 30!");
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

    public PlanStudija getPlanStudija() {
        return planStudija;
    }

    public void setPlanStudija(PlanStudija planStudija) {
        this.planStudija = planStudija;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
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

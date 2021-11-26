package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class PlanStudija {

    Semestar semestar;
    List<Predmet> obavezniPredmeti;
    List<Predmet> izborniPredmeti;

    public PlanStudija(Semestar semestar) {
        this.semestar = semestar;
        obavezniPredmeti = new ArrayList<>();
        izborniPredmeti = new ArrayList<>();
        for(Predmet predmet : semestar.getPredmeti())
            if(predmet.isObavezan()) obavezniPredmeti.add(predmet);
            else izborniPredmeti.add(predmet);
    }

    public Semestar getSemestar() {
        return semestar;
    }

    public void setSemestar(Semestar semestar) {
        this.semestar = semestar;
    }

    public List<Predmet> getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public void setObavezniPredmeti(List<Predmet> obavezniPredmeti) {
        this.obavezniPredmeti = obavezniPredmeti;
    }

    public List<Predmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }

    public void setIzborniPredmeti(List<Predmet> izborniPredmeti) {
        this.izborniPredmeti = izborniPredmeti;
    }
}

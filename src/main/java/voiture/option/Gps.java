package voiture.option;

import voiture.voiture.Voiture;

public class Gps extends DecorateurVoiture{
    Voiture voiture;

    public Gps(Voiture voiture) {
        this.voiture = voiture;
    }

    public Gps() {
    }

    @Override
    public String getLibelle() {
        return "Gps" + voiture.getLibelle();
    }

    @Override
    public Integer getPrix() {
        return voiture.getPrix() +4000;
    }

    @Override
    public Integer getPoids() {
        return voiture.getPoids() + 700;
    }
}

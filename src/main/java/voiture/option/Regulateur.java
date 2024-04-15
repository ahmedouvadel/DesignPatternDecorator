package voiture.option;

import voiture.voiture.Voiture;

public class Regulateur extends DecorateurVoiture{

    Voiture voiture;

    public Regulateur(Voiture voiture) {
        this.voiture = voiture;
    }

    public Regulateur() {
    }

    @Override
    public String getLibelle() {
        return "Regulateur" + voiture.getLibelle();
    }

    @Override
    public Integer getPrix() {
        return voiture.getPrix() +2000;
    }

    @Override
    public Integer getPoids() {
        return voiture.getPoids() + 500;
    }


}

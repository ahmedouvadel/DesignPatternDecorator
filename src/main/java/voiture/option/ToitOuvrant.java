package voiture.option;

import voiture.voiture.Voiture;

public class ToitOuvrant extends DecorateurVoiture {

    Voiture voiture;

    public ToitOuvrant(Voiture voiture) {
        this.voiture = voiture;
    }

    public ToitOuvrant() {
    }

    @Override
    public String getLibelle() {
        return "Toit Ouvrant" + voiture.getLibelle();
    }

    @Override
    public Integer getPrix() {
        return voiture.getPrix() +5000;
    }

    @Override
    public Integer getPoids() {
        return voiture.getPoids() + 200;
    }


}

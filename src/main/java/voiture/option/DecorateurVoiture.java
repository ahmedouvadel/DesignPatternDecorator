package voiture.option;

import voiture.voiture.Voiture;

abstract class DecorateurVoiture extends Voiture{
    protected Voiture voiture;

    public abstract String getLibelle();
    public abstract Integer getPrix();
    public abstract Integer getPoids();
}

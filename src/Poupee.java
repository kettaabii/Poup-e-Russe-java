public abstract class Poupee {
    int taille;
    private  boolean ouverte;

    public Poupee(int taille) {
        this.taille = taille;
        this.ouverte = false;
    }

    public abstract void ouvrir();
    public abstract void fermer();
    public abstract void placerDansPoupee(Poupee P);
    public abstract void sortirDePoupee(Poupee P);

//    public Poupee(int taille) {
//        this.taille = taille;
//        this.ouverte = ouverte;
//    }

    public boolean isOuverte() {
        return ouverte;
    }

    public void setOuverte(boolean ouverte) {
        this.ouverte = ouverte;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

}

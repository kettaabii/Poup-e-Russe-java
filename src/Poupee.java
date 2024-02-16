public abstract class Poupee {
    int taille;


    public Poupee(int taille) {
        this.taille = taille;

    }

    public abstract void ouvrir();
    public abstract void fermer();
    public abstract void placerDansPoupee(Poupee P);
    public abstract void sortirDePoupee(Poupee P);

//    public Poupee(int taille) {
//        this.taille = taille;
//        this.ouverte = ouverte;
//    }



    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

}

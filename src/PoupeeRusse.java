import javax.jws.soap.SOAPMessageHandlers;

import static java.lang.System.*;

class PoupeeRusse extends Poupee {
    private String Name;
    private boolean isOuverte;
    private boolean empty;
    private PoupeeRusse Contetant;
    private PoupeeRusse Contenu;
    public  PoupeeRusse(String name  ,Boolean isOuverte, int taille,boolean empty ,PoupeeRusse contenant,PoupeeRusse contenu ) {
        super(taille);
        this.Name=name;
        this.isOuverte=isOuverte;
        this.empty=empty;
        this.Contetant=contenant;
        this.Contenu=contenu;



    }

    public PoupeeRusse getContenu() {
        return Contenu;
    }

    public void setContenu(PoupeeRusse contenu) {
        Contenu = contenu;
    }

    public String getName() {
        return Name;
    }

    @Override
    public int getTaille() {
        return super.getTaille();
    }

    public boolean isOuverte() {
        return isOuverte;
    }

    @Override
    public void setTaille(int taille) {
        super.setTaille(taille);
    }

    public void setName(String name) {
        Name = name;
    }

    public void setOuverte(boolean ouverte) {
        isOuverte = ouverte;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public PoupeeRusse getContetant() {
        return Contetant;
    }

    public void setContetant(PoupeeRusse contetant) {
        Contetant = contetant;
    }

    @Override
    public void ouvrir() {
        if(!isOuverte){
            setOuverte(true);
            out.println("Poupee ouverte  ");
        }
        else{
            out.println("Poupée Deja Ouverte  ");

    }}
    public void fermer() {
        if(isOuverte){
            setOuverte(false);
            out.println("Poupee Fermée");
        }else {
            out.println("Poupée deja fermée");
        }
    }
public String ouverte(){
    String Etat;
        if (isOuverte) {
            Etat ="ouverte";
           // return out.println("ouverte");
        } else{
            Etat ="fermée";
            //out.println("fermée");
            }
        return Etat;
}

    @Override
    public void placerDansPoupee(Poupee P) {
        PoupeeRusse R=(PoupeeRusse) P;
        if(!isOuverte && this.taille<P.taille && R.empty){
            out.println("la poupee "+this.Name+" est placée dans la poupee "+R.Name);
            R.Contetant=this;
            isOuverte=false;


        }else{out.println("on ne peut pas placer la poupee "+this.Name +"dan la Poupée "+R.Name);


    }}

    @Override
    public void sortirDePoupee(Poupee P){
        PoupeeRusse R=(PoupeeRusse) P;
        out.println("la poupee "+this.Name+" est sortie de la poupee "+R.Name);
        R.Contenu=null;
        R.isOuverte=false;
        isOuverte=false;

    }

    @Override
    public String toString() {
        return "PoupeeRusse{" +
                "Name='" + Name + '\'' +
                ", isOuverte=" + isOuverte +
                ", empty=" + empty +
                ", Contetant=" + Contetant +
                '}';
    }
    //    private Poupee poupee;
//    public PoupeeRusse(int taille ) {
//        super(taille);
//        poupee = null;
//    }
//
//    // getter and setter
//    public Poupee getPoupee() {
//        return poupee;
//    }
//
//    public void setPoupee(Poupee poupee) {
//        this.poupee = poupee;
//    }
//
//    @Override
//    public void ouvrir() {
//        if (!isOuverte()){
//            setOuverte(true);
//            System.out.println("is open");
//        }else {
//            System.out.println("is already open");
//        }
//    }
//
//    @Override
//    public void fermer() {
//        if (isOuverte()){
//            setOuverte(false);
//            System.out.println("is close");
//        }else {
//            System.out.println("is already close");
//        }
//    }
//
//    @Override
//    public void placerDansPoupee(Poupee P) {
//        if (P.getTaille() > this.getTaille()){
//            System.out.println("the first is big");
//        }
//        else if(!P.isOuverte()) {
//            System.out.println("is close");
//        }
//        else {
//            setPoupee(P);
//        }
//    }
//
//    @Override
//    public void sortirDePoupee(Poupee P) {

//
//    }
}




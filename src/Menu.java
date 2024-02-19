import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.*;


public class Menu {
    PoupeeRusse Poupee1 = new PoupeeRusse("Poupee 1", false, 0, true, null,null);
    PoupeeRusse Poupee2 = new PoupeeRusse("Poupee 2", false, 0, true, null,null);
    PoupeeRusse Poupee3 = new PoupeeRusse("Poupee 3", false, 0, true, null,null);


    void menuPrincipal() {
        System.out.println("bienvenue dans le jeux");
        Scanner input = new Scanner(in);
        System.out.println("======================");
        System.out.println("1-Commencer        2- Quitter");
        int choix = input.nextInt();
        switch (choix) {
            case 1:
                menuJeux();
                affichertailles();
                break;
            default:
                menuPrincipal();
                break;
        }


    }

    public void menuJeux() {
        Scanner input = new Scanner(in);
        out.println("veuillez choisir");
        out.println("1-affecter  des tailles aux Poupées ");

        int choix = input.nextInt();
        switch (choix) {

            case 1:
                out.println("affecter la taille De la premiere Pouper");
                Scanner build = new Scanner(in);
                int buildTaille = build.nextInt();
                Poupee1.setTaille(buildTaille);
                out.println("affecter la taille de la deuxieme poupee");
                buildTaille = build.nextInt();
                Poupee2.setTaille(buildTaille);
                out.println("affecter a taille de la troixieme poupee");
                buildTaille = build.nextInt();
                Poupee3.setTaille(buildTaille);
                affichertailles();
                ;
                break;
            default:
                System.out.println("menujeux");


        }
    }

    public void affichertailles() {
        Scanner input = new Scanner(in);
        out.println("feliciation vous avez donné les tailles au poupées");
        ////////////////////////////////////////
        System.out.println("Poupee 1==" + Poupee1.getTaille());
        System.out.println("Poupee 2== " + Poupee2.getTaille());
        System.out.println("Poupee 3==" + Poupee3.getTaille());
        ///////////////////////////////////////
        out.println("il est temp de leur donner des noms");
        out.println("1-oui D'accord    2-c'est pas la peine");
        int choix = input.nextInt();
        switch (choix) {
            case 1:
                out.println("que souhaiter vous nommer la premiere poupée ");
                Scanner build = new Scanner(in);
                String buildNom = build.next();
                Poupee1.setName(buildNom);
                out.println("que souhaiter vous nommer deuxieme poupee");
                buildNom = build.next();
                Poupee2.setName(buildNom);
                out.println("affecter a taille de la troixieme poupee");
                buildNom = build.next();
                Poupee3.setName(buildNom);
                affichernoms();
                ;
                break;
            case 2:
                affichernoms();
                break;


        }
    }

    public PoupeeRusse affichernoms() {
        Scanner input = new Scanner(in);
        out.println("Poupee 1  :" + Poupee1.getName() + "||  Poupee2 :" + Poupee2.getName() + "||  Poupee3 :" + Poupee3.getName());
        out.println("Taille 1  :" + Poupee1.getTaille() + "||  Taille :" + Poupee2.getTaille() + "||  Taille 3 :" + Poupee3.getTaille());
        out.println("Etat 1    :" + Poupee1.ouverte() + "||  Etat 2 : " + Poupee2.ouverte() + "||  Etat 3 :" + Poupee3.ouverte());
        out.println("===============================================================");
        out.println("==========Parfait , maintenant le Popées son pretes============");
        out.println("choisir la Pouper a ouvrir , puis choisir la Poupée que vous voulez mettre de dans");
        int choix = input.nextInt();
        PoupeeRusse poupeeOuverte = null;
        switch (choix) {
            case 1:
                poupeeOuverte=Poupee1;
                this.Poupee1.ouvrir();
                out.println("Poupee 1  :" + Poupee1.getName() + "||  Poupee 2 :" + Poupee2.getName() + "||  Poupee3 :" + Poupee3.getName());
                out.println("Taille 1  :" + Poupee1.getTaille() + "||  Taille 2 :" + Poupee2.getTaille() + "||  Taille 3 :" + Poupee3.getTaille());
                out.println("Etat 1    :" + Poupee1.ouverte() + "||  Etat 2 : " + Poupee2.ouverte() + "||  Etat 3 :" + Poupee3.ouverte());
                Placer(poupeeOuverte);


                break;
            case 2:
                poupeeOuverte=Poupee2;
                this.Poupee2.ouvrir();
                out.println("Poupee 1  :" + Poupee1.getName() + "||  Poupee 2 :" + Poupee2.getName() + "||  Poupee 3 :" + Poupee3.getName());
                out.println("Taille 1  :" + Poupee1.getTaille() + "||  Taille 2:" + Poupee2.getTaille() + "||  Taille 3 :" + Poupee3.getTaille());
                out.println("Etat 1    :" + Poupee1.ouverte() + "||  Etat 2 : " + Poupee2.ouverte() + "||  Etat 3 :" + Poupee3.ouverte());
                Placer(poupeeOuverte);
                break;
            case 3:
                poupeeOuverte=Poupee3;
                this.Poupee3.ouvrir();
                out.println("Poupee 1  :" + Poupee1.getName() + "||  Poupee 2 :" + Poupee2.getName() + "||  Poupee 3 :" + Poupee3.getName());
                out.println("Taille 1  :" + Poupee1.getTaille() + "||  Taille 2 :" + Poupee2.getTaille() + "||  Taille 3 :" + Poupee3.getTaille());
                out.println("Etat 1    :" + Poupee1.ouverte() + "||  Etat 2 : " + Poupee2.ouverte() + "||  Etat 3 :" + Poupee3.ouverte());
                Placer(poupeeOuverte);
                break;
            default:
                out.println("mauvais choix");
                break;
        }
    return poupeeOuverte;
    }

    void Placer(PoupeeRusse poupeeOuverte) {
        int choix;
        List<PoupeeRusse> ListePoupees = new ArrayList<PoupeeRusse>();
        ListePoupees.add(Poupee1);
        ListePoupees.add(Poupee2);
        ListePoupees.add(Poupee3);
        List<PoupeeRusse> test = ListePoupees.stream().filter(p -> p.getContetant() == null && p!= poupeeOuverte).collect(Collectors.toList());
        PoupeeRusse Pc1=test.get(0);
        PoupeeRusse Pc2=test.get(1);
        out.println("ILL TE RESTE LES POUPEES   1- " +Pc1.getName() + "   et 2- " + Pc2.getName());
        out.println("veuillez choisir la quelle vous allez placer dans la poupée ouverte "+poupeeOuverte.getName());
        Scanner input=new Scanner(in);
        choix=input.nextInt();
        if(choix==1){
            poupeeOuverte.setContenu(Pc1);
            Pc1.placerDansPoupee(poupeeOuverte);
            out.println("maintenant vous avez "+poupeeOuverte.getName()+"contient "+poupeeOuverte.getContenu().getName());
            out.println("il vous reste qu'a placer "+Pc2.getName()+"de dans");
            out.println("vous voulez \n 1-continuer ou bien \n 2- faire sortir la poupée");
            int c2=input.nextInt();
            switch(c2){
                case 1:
                    if(Pc2.taille<poupeeOuverte.getContenu().taille){
                    out.println("vous aves gagné ");}
                    else{out.println( "vous avez perdu");}
                    break;
                case 2:
                    Pc1.sortirDePoupee(poupeeOuverte);
                    affichernoms();
                    break;
                default: out.println("mauvais choix");
            }
        }

        else if (choix==2) {
            poupeeOuverte.setContenu(Pc2);
            test.get(1).placerDansPoupee(poupeeOuverte);
            out.println("maintenant vous avez "+poupeeOuverte.getName()+"contient "+poupeeOuverte.getContenu().getName());
            out.println("il vous reste qu'a placer "+Pc1.getName()+"de dans");
            out.println("vous voulez \n 1-continuer ou bien \n 2- faire sortir la poupée");
            int c2=input.nextInt();
            switch(c2){
                case 1:
                    if(Pc2.taille<poupeeOuverte.getContenu().taille){
                        out.println("vous aves gagné ");}
                    else{out.println( "vous avez perdu");}
                    break;
                case 2:
                    Pc2.sortirDePoupee(poupeeOuverte);
                    affichernoms();
                    break;
                default: out.println("mauvais choix");
            }


        }


        //Poupee1.placerDansPoupee(Poupee3);
//        out.println("il y a des poupees" + P1.getName() + "et " + P2.getName());

    }}









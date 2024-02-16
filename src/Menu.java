import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.*;


public class Menu {
    PoupeeRusse Poupee1=new PoupeeRusse("Poupee 1",false,0,true , null);
    PoupeeRusse Poupee2=new PoupeeRusse("Poupee 2",false,0,true , null);
    PoupeeRusse Poupee3=new PoupeeRusse("Poupee 3",false,0,true,null);



    void menuPrincipal() {
        System.out.println("bienvenue dans le jeux");
        Scanner input =new Scanner(in);
        System.out.println("======================");
        System.out.println("1-Commencer        2- Quitter");
        int choix=input.nextInt();
        switch(choix){
            case 1 :
                menuJeux();
                affichertailles();
                break;
            default : menuPrincipal();break;
        }


    }
    public void menuJeux() {
        Scanner input = new Scanner(in);
        System.out.println("veuillez choisir");
        System.out.println("1-affecter  des tailles aux Poupées ");

        int choix = input.nextInt();
        switch (choix) {

            case 1:
                System.out.println("affecter la taille De la premiere Pouper");
                Scanner build = new Scanner(in);
                int buildTaille = build.nextInt();
                Poupee1.setTaille(buildTaille);
                System.out.println("affecter la taille de la deuxieme poupee");
                buildTaille = build.nextInt();
                Poupee2.setTaille(buildTaille);
                System.out.println("affecter a taille de la troixieme poupee");
                buildTaille = build.nextInt();
                Poupee3.setTaille(buildTaille);
                affichertailles();;
                break;
            default:
                System.out.println("menujeux");


        }
    }
    public void affichertailles(){
        Scanner input = new Scanner(in);
        System.out.println("feliciation vous avez donné les tailles au poupées");
        ////////////////////////////////////////
        System.out.println("Poupee 1=="+Poupee1.getTaille());
        System.out.println("Poupee 2== "+Poupee2.getTaille());
        System.out.println("Poupee 3=="+Poupee3.getTaille());
        ///////////////////////////////////////
        System.out.println("il est temp de leur donner des noms");
        System.out.println("1-oui D'accord    2-c'est pas la peine");
        int  choix=input.nextInt();
        switch(choix){
            case 1:
                System.out.println("que souhaiter vous nommer la premiere poupée ");
                Scanner build = new Scanner(in);
                String buildNom = build.next();
                Poupee1.setName(buildNom);
                System.out.println("que souhaiter vous nommer deuxieme poupee");
                buildNom=build.next();
                Poupee2.setName(buildNom);
                System.out.println("affecter a taille de la troixieme poupee");
                buildNom= build.next();
                Poupee3.setName(buildNom);
                affichernoms();;
                break;

        }
    }
    public void affichernoms(){
        Scanner input=new Scanner(in);
        out.println("Poupee 1  :"+Poupee1.getName()+"||  Poupee2 :"+Poupee2.getName()+"||  Poupee3 :"+Poupee3.getName());
        out.println("Taille 1  :"+Poupee1.getTaille()+"||  Taille :"+Poupee2.getTaille()+"||  Taille 3 :" +Poupee3.getTaille());
        out.println("Etat 1    :"+Poupee1.ouverte()+"||  Etat 2 : "+Poupee2.ouverte()+"||  Etat 3 :"+Poupee3.ouverte());
        out.println("===============================================================");
        out.println("==========Parfait , maintenant le Popées son pretes============" );
        out.println("choisir la Pouper a ouvrir , puis choisir la Poupée que vous voulez mettre de dans");
        int choix =input.nextInt();
        switch(choix){
            case 1 :
                this.Poupee1.ouvrir();
                out.println("Poupee 1  :"+Poupee1.getName()+"||  Poupee 2 :"+Poupee2.getName()+"||  Poupee3 :"+Poupee3.getName());
                out.println("Taille 1  :"+Poupee1.getTaille()+"||  Taille 2 :"+Poupee2.getTaille()+"||  Taille 3 :" +Poupee3.getTaille());
                out.println("Etat 1    :"+Poupee1.ouverte()+"||  Etat 2 : "+Poupee2.ouverte()+"||  Etat 3 :"+Poupee3.ouverte());

                break;
            case 2:
                this.Poupee2.ouvrir();
                out.println("Poupee 1  :"+Poupee1.getName()+"||  Poupee 2 :"+Poupee2.getName()+"||  Poupee 3 :"+Poupee3.getName());
                out.println("Taille 1  :"+Poupee1.getTaille()+"||  Taille 2:"+Poupee2.getTaille()+"||  Taille 3 :" +Poupee3.getTaille());
                out.println("Etat 1    :"+Poupee1.ouverte()+"||  Etat 2 : "+Poupee2.ouverte()+"||  Etat 3 :"+Poupee3.ouverte());
                break;
            case 3:
                this.Poupee3.ouvrir();
                out.println("Poupee 1  :"+Poupee1.getName()+"||  Poupee 2 :"+Poupee2.getName()+"||  Poupee 3 :"+Poupee3.getName());
                out.println("Taille 1  :"+Poupee1.getTaille()+"||  Taille 2 :"+Poupee2.getTaille()+"||  Taille 3 :" +Poupee3.getTaille());
                out.println("Etat 1    :"+Poupee1.ouverte()+"||  Etat 2 : "+Poupee2.ouverte()+"||  Etat 3 :"+Poupee3.ouverte());
                Placer();
                break;
            default: out.println("mauvais choix");
                break;
        }

    }
    void Placer(){
        Scanner input =new Scanner(in);
        int choix =input.nextInt();
        List<PoupeeRusse>ListePoupees=new ArrayList<PoupeeRusse>();
        List<PoupeeRusse> test=ListePoupees.stream().filter(p->p.getContetant().equals(null)).collect(Collectors.toList());
        switch(choix ){


            case 1:
                Poupee1.placerDansPoupee(Poupee3);

        }


    }}

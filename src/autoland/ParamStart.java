package autoland;

import javax.swing.*;

public class ParamStart {

    public static void main (String[]args) {
        boolean Menu = false;
        while (!Menu) {

            String Height = JOptionPane.showInputDialog(
                    null, "Podaj wysokość ft");
            String Speed = JOptionPane.showInputDialog(
                    null, "Podaj Prędkość Kts");
            String Distance = JOptionPane.showInputDialog(null, "Podaj odległość Nm");

            double Height1 = Integer.parseInt(Height);
            double Speed1 = Integer.parseInt(Speed);
            double Distance1 = Integer.parseInt(Distance);

            int decyzja = JOptionPane.showConfirmDialog
                    (null, "Wysokość: " + Height + " stóp " + " Prędkość: " + Speed
                            + " węzłów " + " Odległość: " + Distance + " Mil" + "\n" + "\t" + "Wprowadzić dane?");

            if (decyzja == JOptionPane.NO_OPTION)
                decyzja = JOptionPane.showConfirmDialog(null, "Bye");

            if (decyzja == JOptionPane.CANCEL_OPTION)
                decyzja=JOptionPane.showConfirmDialog(null,"Canceled");
            if (decyzja == JOptionPane.YES_OPTION)
                System.out.println("Parametry początkowe lądowania: " + " Wysokość: " + Height1 + " Prędkość: " + Speed1 +
                        " Odległość: " + Distance1);
            Menu = true;

            Glideslope Gs = new Glideslope(Height1, Distance1);
            ArrivTime ETA = new ArrivTime(Speed1, Distance1);
            VerticalSpeed VS = new VerticalSpeed(Height1, ETA.calculateETA());

            boolean menu2 = false;
            while (!menu2) {

                int decyzja2 = JOptionPane.showConfirmDialog(null, "Kąt zniżania: " + Gs.calculateGs()
                        + " %" + " Prędkość zniżania: " + VS.calculateVS() + " ft/min " +
                        " Czas dolotu ETA: " + ETA.calculateETA() + " min" + "\n" + "Wydrukować całą sćieżkę ?");

                if (decyzja2 == JOptionPane.NO_OPTION)
                    decyzja2 = JOptionPane.showConfirmDialog(null, "Bye");
                menu2 = true;
                if (decyzja2 == JOptionPane.CANCEL_OPTION)
                    menu2 = true;
                if (decyzja == JOptionPane.YES_OPTION) {
                    menu2 = true;

                    System.out.println("GS: " + Gs.calculateGs() + " % " + " ETA: " + ETA.calculateETA() + " min "
                            + " VS: " + VS.calculateVS() + " ft/min");
                    Dist2mod dismod = new Dist2mod(Speed1, VS);
                    eta2mod etmod = new eta2mod(Speed1, VS);
                    double i=0 ;
                    double Distance2 = Distance1;
                    double ETA2 = ETA.calculateETA() * 60;
                    double Height2 = Height1;
                    double stoper= 0;

                    for (i=Height1; Height2>=0 ; i--) {

                        Distance2 = Distance2 - dismod.calculatedismod();
                        ETA2 = ETA2 - etmod.calculatetmod(); //  pamietac zeby podzielic przez 60 aby zmienic na minuty w wydruku
                        Height2 = Height2 - 100;
                        stoper = stoper + etmod.calculatetmod();


                        System.out.println("Odległość: " + Distance2 + " Mil " + " ETA: " + (ETA2 / 60) + " Min " +
                                " Stoper " + stoper + " sek " +" Wysokośc: " + Height2 + " Stóp");

                    }

                }
            }


        }


    }
}


package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void zmrzlina() {
        zofka = new Turtle();
        zofka.setLocation(250.0, 250.0);
        zofka.turnLeft(90);
        nakresliRovnoramennyTrojuhelnik(200, Color.orange);
        zofka.turnLeft(90);
        nakresliKolecko(18, Color.magenta);
    }

    public void snehulak() {
        zofka = new Turtle();
        zofka.setLocation(450.0, 250.0);
        zofka.turnRight(90);
        nakresliKolecko(10, Color.YELLOW);
        polozTuzku();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zvedniTuzku();
        nakresliKolecko(18, Color.BLUE);
        polozTuzku();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zvedniTuzku();
        nakresliKolecko(25, Color.BLUE);
        polozTuzku();
        zofka.turnLeft(90);
        zofka.move(220);
        zofka.turnLeft(90);
        zofka.move(55);
        zvedniTuzku();
        nakresliKolecko(7, Color.YELLOW);
        polozTuzku();
        zofka.turnLeft(180);
        zofka.move(130);
        zofka.turnRight(90);
        zofka.move(38);
        zofka.turnLeft(90);
        zvedniTuzku();
        nakresliKolecko(7, Color.YELLOW);
    }

    public void masinka() {
        zofka = new Turtle();
        zofka.setLocation(800.0, 300.0);
        nakresliObdelnik(100, 200, Color.green);
        zofka.move(50);
        zofka.turnRight(180);
        nakresliPravouhlyTrojuhelnik(145, Color.red);
        polozTuzku();
        zofka.turnRight(45);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnRight(90);
        zvedniTuzku();
        nakresliObdelnik(100, 200, Color.BLUE);
        polozTuzku();
        zofka.turnRight(90);
        zofka.move(200);
        zvedniTuzku();
        nakresliKolecko(19, Color.orange);
        polozTuzku();
        zofka.turnRight(90);
        zofka.move(45);
        zvedniTuzku();
        nakresliKolecko(10, Color.BLACK);
        polozTuzku();
        zofka.move(85);
        zvedniTuzku();
        nakresliKolecko(10, Color.BLACK);
    }



    public void nakresliRovnoramennyTrojuhelnik(double delkaStrany, Color barva) {
        zofka.penDown();
        zofka.setPenColor(barva);
        zofka.turnLeft(75);
        zofka.move(delkaStrany);
        zofka.turnRight(150);
        zofka.move(delkaStrany);
        zofka.turnRight(105);
        zofka.move(100);
    }
    public void nakresliKolecko(double velikost, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 18; i++) {
            zofka.move(velikost);
            zofka.turnLeft(20);
        }
    }
    public void nakresliObdelnik(double delkaStranyA, double delkaStranyB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }
    public void nakresliPravouhlyTrojuhelnik(double delkaPrepony, Color barva) {
        zofka.setPenColor(barva);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(delkaPrepony);
    }
    public void zvedniTuzku() {
        zofka.penDown();
    }
    public void polozTuzku() {
        zofka.penUp();
    }


    public static void main(String[] args) {
        new HlavniProgram().zmrzlina();
        new HlavniProgram().snehulak();
        new HlavniProgram().masinka();
    }

}

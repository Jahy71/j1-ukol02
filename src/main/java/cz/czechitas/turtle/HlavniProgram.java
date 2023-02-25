package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

        public void zmrzlina() {
        zofka = new Turtle();
        zofka.setLocation(250.0, 250.0);
        zofka.turnLeft(90);
        rovnoramennyTrojuhelnik(200, Color.orange);
        zofka.turnLeft(90);
        kolecko(18, Color.magenta);
    }

    public void snehulak() {
        zofka = new Turtle();
        zofka.setLocation(450.0, 250.0);
        zofka.turnRight(90);
        kolecko(10, Color.YELLOW);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
        kolecko(18, Color.BLUE);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();
        kolecko(25, Color.BLUE);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(220);
        zofka.turnLeft(90);
        zofka.move(55);
        zofka.penDown();
        kolecko(7, Color.YELLOW);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(130);
        zofka.turnRight(90);
        zofka.move(38);
        zofka.turnLeft(90);
        zofka.penDown();
        kolecko(7, Color.YELLOW);
    }

    public void masinka() {
        zofka = new Turtle();
        zofka.setLocation(800.0, 300.0);
        obdelnik(100, 200, Color.green);
        zofka.move(50);
        zofka.turnRight(180);
        pravouhlyTrojuhelnik(145, Color.red);
        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.penDown();
        obdelnik(100, 200, Color.BLUE);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();
        kolecko(19, Color.orange);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(45);
        zofka.penDown();
        kolecko(10, Color.BLACK);
        zofka.penUp();
        zofka.move(85);
        zofka.penDown();
        kolecko(10, Color.BLACK);
    }


    public void rovnoramennyTrojuhelnik(Integer strana, Color barva) {
        zofka.penDown();
        zofka.setPenColor(barva);
        zofka.turnLeft(75);
        zofka.move(strana);
        zofka.turnRight(150);
        zofka.move(strana);
        zofka.turnRight(105);
        zofka.move(100);
    }
    public void kolecko(Integer velikost, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 18; i++) {
            zofka.move(velikost);
            zofka.turnLeft(20);
        }
    }
    public void obdelnik(Integer StranaA, Integer StranaB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(StranaA);
            zofka.turnRight(90);
            zofka.move(StranaB);
            zofka.turnRight(90);
        }
    }
    public void pravouhlyTrojuhelnik(Integer prepona, Color barva) {
        zofka.setPenColor(barva);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(prepona);
    }


    public static void main(String[] args) {
        new HlavniProgram().zmrzlina();
        new HlavniProgram().snehulak();
        new HlavniProgram().masinka();
    }

}

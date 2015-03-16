/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argus.pyrrhus;

/**
 *
 * @author Slasko
 */
public class Lokace {

    void getLocation(int location) {
        Enemy enemy = new Enemy();
        enemy.getEnemy(Mapa.mapa[Mapa.heroPos[0]][Mapa.heroPos[1]][0]);
        switch (location) {
            case 0:
                louka();
                break;
            case 1:
                poust();
                break;
            case 2:
                hory();
                break;
            case 3:
                les();
                break;
            case 4:
                jeskyne();
                break;
        }
    }

    void louka() {
        System.out.println("Prisel si na louku, v dali vidis " + Enemy.enemyName);
        System.out.println("1. priblizit se");
        System.out.println("2. zautocit");
        System.out.println("3. odejit");
    }

    void poust() {
        System.out.println("Prisel si na poust, v dali vidis " + Enemy.enemyName);
        System.out.println("1. priblizit se");
        System.out.println("2. zautocit");
        System.out.println("3. odejit");
    }

    void hory() {
        System.out.println("Prisel si do hor, v dali vidis " + Enemy.enemyName);
        System.out.println("1. priblizit se");
        System.out.println("2. zautocit");
        System.out.println("3. odejit");
    }

    void les() {
        System.out.println("Prisel si na les, v dali vidis " + Enemy.enemyName);
        System.out.println("1. priblizit se");
        System.out.println("2. zautocit");
        System.out.println("3. odejit");
    }

    void jeskyne() {
        System.out.println("Prisel jsi k jeskyni, v dali vidis " + Enemy.enemyName);
        System.out.println("1. priblizit se");
        System.out.println("2. zautocit");
        System.out.println("3. odejit");
    }
}

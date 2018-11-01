package it.sevenbits.rogue_like;

import it.sevenbits.rogue_like.instances.*;

public class Main {


    public static void main(String[] args) {
        int initMoneyAmount = 50;

        String initHelmName = "Helm of Honor";
        String initSwordName = "Dark Sword";

        Player player = new Player(100);
        Chest chest = new Chest(new Pair<>(initSwordName, new Sword(initSwordName, 15,15)),
                new Pair<>(initHelmName, new Helm(initHelmName, 15,15)), initMoneyAmount);

        System.out.println(20);
    }
    private Main() {}
}

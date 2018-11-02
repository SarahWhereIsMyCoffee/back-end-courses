package it.sevenbits.rogue_like;

import it.sevenbits.rogue_like.instances.*;

public class Main {

    public static void main(String[] args) {
        int initMoneyAmount = 50;
        Player player = new Player(100);

        // Создаю предметы
        String helmOfHonorName = "Helm of Honor";
        int helmOfHonorDurabilityValue = 15;
        int helmOfHonorProtectionValue = 20;
        Helm helmOfHonor = new Helm(helmOfHonorName, helmOfHonorDurabilityValue,helmOfHonorProtectionValue);

        String helmOfTheStormName = "Helm of the Storm";
        int helmOfTheStormDurabilityValue = 10;
        int helmOfTheStormProtectionValue = 12;
        Helm helmOfTheStorm = new Helm(helmOfTheStormName, helmOfTheStormDurabilityValue, helmOfTheStormProtectionValue);

        String darkSwordName = "Dark Sword";
        int darkSwordAttackValue = 20;
        int darkSwordDurabilityValue = 5;
        Sword darkSword = new Sword(darkSwordName, darkSwordAttackValue,darkSwordDurabilityValue);

        String cloudSwordName = "Cloud Sword";
        int cloudSwordAttackValue = 12;
        int cloudSwordDurabilityValue = 12;
        Sword cloudSword = new Sword(darkSwordName, cloudSwordAttackValue, cloudSwordDurabilityValue);

        String paladinsSwordName = "Paladin's Sword";
        int paladinsSwordAttackValue = 15;
        int paladinsSwordDurabilityValue = 18;
        Sword paladinsSword = new Sword(darkSwordName, paladinsSwordAttackValue, paladinsSwordDurabilityValue);

        int goldAmount = 1000;
        Chest chest1 = new Chest();
        chest1.putArmorItem(new Pair<>(helmOfHonorName, helmOfHonor));
        chest1.putArmorItem(new Pair<>(helmOfTheStormName, helmOfTheStorm));
        chest1.putWeaponItem(new Pair<>(darkSwordName, darkSword));
        chest1.putWeaponItem(new Pair<>(cloudSwordName, cloudSword));
        chest1.putWeaponItem(new Pair<>(paladinsSwordName, paladinsSword));
        chest1.setMoneyValue(goldAmount);


        player.getArmorsFromChest(chest1);
        player.getWeaponsFromChest(chest1);
        player.getMoneyFromChest(chest1);

        System.out.println();
        System.out.println("Броня, доступная игроку:");
        player.getArmorsNames();
        System.out.println();
        System.out.println("Оружие, доступное игроку:");
        player.getWeaponsNames();
        System.out.println();
        System.out.println("Деньги, доступные игроку - " + player.getMoneyAmount());

    }
    private Main() {}
}

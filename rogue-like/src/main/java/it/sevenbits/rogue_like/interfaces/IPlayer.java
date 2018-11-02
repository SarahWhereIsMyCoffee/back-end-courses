package it.sevenbits.rogue_like.interfaces;

import it.sevenbits.rogue_like.instances.Chest;

public interface IPlayer extends ICharacter, IInventory, IAttack, IMoving {
    public void getWeaponsFromChest(Chest chest);
    public void getArmorsFromChest(Chest chest);
    public void getMoneyFromChest(Chest chest);
}

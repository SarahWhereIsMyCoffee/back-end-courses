package it.sevenbits.rogue_like.character.extend.player;

import it.sevenbits.rogue_like.character.ICharacter;
import it.sevenbits.rogue_like.container.chest.instances.Chest;
import it.sevenbits.rogue_like.components.IAttack;
import it.sevenbits.rogue_like.container.inventory.IInventory;
import it.sevenbits.rogue_like.components.IMovable;

public interface IPlayer extends ICharacter, IInventory, IAttack, IMovable {
    public void getWeaponsFromChest(Chest chest);
    public void getArmorsFromChest(Chest chest);
    public void getMoneyFromChest(Chest chest);
}

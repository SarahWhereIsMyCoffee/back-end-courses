package it.sevenbits.rogue_like.interfaces;

/**
 * Interface for the enemies in the game.
 * Extends ICharacter, so they can move and attack
 */
public interface IMonster extends ICharacter, IAttack, IMoving  {
}

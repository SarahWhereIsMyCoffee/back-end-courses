package it.sevenbits.rogue_like.character.extend.monster;

import it.sevenbits.rogue_like.character.ICharacter;
import it.sevenbits.rogue_like.components.IAttack;
import it.sevenbits.rogue_like.components.IMovable;

/**
 * Interface for the enemies in the game.
 * Extends ICharacter, so they can move and attack
 */
public interface IMonster extends ICharacter, IAttack, IMovable {
}

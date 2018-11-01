package it.sevenbits.rogue_like.interfaces;

public interface ICharacter extends IAttack, IMoving {
    public void getAttacked(int attackValue);
    public void setHealthValue(int healthValue);
}

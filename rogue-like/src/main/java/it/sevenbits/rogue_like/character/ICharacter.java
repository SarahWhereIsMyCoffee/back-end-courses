package it.sevenbits.rogue_like.character;

public interface ICharacter {
    public void getAttacked(int attackValue);
    public void setHealthValue(int healthValue);
    public int getHealthValue();
}

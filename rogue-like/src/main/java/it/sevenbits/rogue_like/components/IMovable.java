package it.sevenbits.rogue_like.components;

public interface IMovable {
    public void move(int deltaCoordX, int deltaCoordY);
    public int getCoordX();
    public int getCoordY();

}

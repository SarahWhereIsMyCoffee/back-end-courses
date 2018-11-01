package it.sevenbits.rogue_like.interfaces;

public interface IMoving {
    public void move(int deltaCoordX, int deltaCoordY);
    public int getCoordX();
    public int getCoordY();

}

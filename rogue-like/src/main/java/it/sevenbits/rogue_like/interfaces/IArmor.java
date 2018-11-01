package it.sevenbits.rogue_like.interfaces;

public interface IArmor {
    public void setDurabilityValue(int durabilityValue);
    public void setProtectionValue(int protectionValue);
    public void increaseDurabilityValue(int deltaDurabilityValue);
    public void increaseProtectionValue(int protectionValue);
    public void dicreaseDurabilityValue(int deltaDurabilityValue);
    public void dicreaseProtectionValue(int protectionValue);
    public int getDurabilityValue();
    public int getProtectionValue();
    public void setName(String name);
    public String getName();
}

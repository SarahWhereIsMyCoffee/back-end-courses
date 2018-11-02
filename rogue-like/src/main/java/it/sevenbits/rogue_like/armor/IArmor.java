package it.sevenbits.rogue_like.armor;

public interface IArmor {
    void setDurabilityValue(int durabilityValue);
    void setProtectionValue(int protectionValue);
    void increaseDurabilityValue(int deltaDurabilityValue);
    void increaseProtectionValue(int protectionValue);
    void dicreaseDurabilityValue(int deltaDurabilityValue);
    void dicreaseProtectionValue(int protectionValue);
    int getDurabilityValue();
    int getProtectionValue();
    void setName(String name);
    String getName();
}

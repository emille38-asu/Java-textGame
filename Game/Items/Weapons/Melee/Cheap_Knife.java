package Items.Weapons.Melee;

public class Cheap_Knife {
    int durability;
    @Override
    public String toString() {
        return "Cheap_Knife [durability=" + durability + ", damage=" + damage + ", type=" + type + "]";
    }
    int damage;
    String type; // slashing, blunt, piercing
    public int getDurability() {
        return durability;
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}

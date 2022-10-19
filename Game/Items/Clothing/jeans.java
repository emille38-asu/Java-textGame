package Items.Clothing;

import Items.items_interface;

public class jeans implements items_interface {

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Jeans";
    }

    @Override
    public String toString() {
        return "jeans []";
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "Your favorite jeans.  Worn and comfy.";
    }

    @Override
    public int getAttack() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getDefense() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getAnxietyModifier() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getSlot() {
        // TODO Auto-generated method stub
        return "Pants";
    }
    
}

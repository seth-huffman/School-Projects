// CSE 110     : CSE110 / online
// Assignment  : Weapon.java
// Author      : Seth Huffman swhuffma
// Description : Creates weapon

class Weapon {
    private String name;
    private int maxDamage;

    public Weapon(String name, int maxDamage) {
            this.name = "Pointy Stick";
            this.maxDamage = 1;
    }

    public String getName() {
        return name;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }
}





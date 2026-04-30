// CSE 110     : CSE110 / online
// Assignment  : Monster.java
// Author      : Seth Huffman swhuffma
// Description : Creates weapon

class Monster {
    private String name, weaponName;
    private int healthScore; 
    private Weapon weapon;
    private Monster monster;

    public Monster(String name, int healthScore, Weapon weapon) {
            this.name = name;
            this.healthScore = healthScore;
            this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public double getHealthScore() {
        return healthScore;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int attack(Monster monster) {
        int randomNum = (int)(Math.random() * 100);
        this.healthScore = monster.healthScore - randomNum;
        return monster.healthScore;
    }


}
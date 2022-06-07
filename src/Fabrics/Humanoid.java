package Fabrics;

public abstract class Humanoid implements Hero{

    public String name;
    public int hp;
    public int attack;
    public int armor;

    public Humanoid(String name, int hp, int attack, int armor){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.armor = armor;
    }
}
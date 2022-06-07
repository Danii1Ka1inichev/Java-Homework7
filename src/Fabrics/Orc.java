package Fabrics;



public class Orc extends Humanoid {
    public Orc(String name, int hp, int attack, int armor) {
        super(name, hp, attack, armor);
    }

    public String getName(){return name;}

    public void attack(Humanoid target) {
        int damage = attack - target.armor;
        if (damage > 0){
            System.out.println("Герой " + name + " наносит урон в размере " + damage + " герою " + target.name);
            target.hp -= damage;
            System.out.println("Здоровье " + name + " = " + hp + ",  Здоровье " + target.name + " = " + target.hp);
        }
        else System.out.println("Броня не пробита");
    }
}

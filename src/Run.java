/*#4** Создать две фабрики для юнитов разных типов.
        Создать метод, который будет создавать армию (список) юнитов созданных одной фабрикой
        (фабрика должна генерировать параметры юнитов со случайным разбросом) и реализовать метод бой,
        который в случайном порядке будет сталкивать юнитов из двух армию (списков).
        Печатать подробный лог боя*/

import Fabrics.Elf;
import Fabrics.Orc;

import java.util.ArrayList;
import java.util.Random;

public class Run {

    public static ArrayList<Orc> generatorOrc(){
        ArrayList<Orc> Orcs = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 5; i++){
            int hp = random.nextInt(101);
            int armor = random.nextInt(25);
            int attack = random.nextInt(40);
            Orc orc1 = new Orc("Орк " + (i+1),hp,attack,armor);
            Orcs.add(orc1);
        }
        return Orcs;
    }

    public static ArrayList<Elf> generatorElf(){
        ArrayList<Elf> Elfs = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 5; i++){
            int hp = random.nextInt(101);
            int armor = random.nextInt(26);
            int attack = random.nextInt(41);
            Elf elf1 = new Elf("Эльф " + (i+1),hp,attack,armor);
            Elfs.add(elf1);
        }
        return Elfs;
    }

    public static void attack(Orc orc, Elf elf){

        System.out.println("Орк " + " HP " + orc.hp + " Armor " + orc.armor + " Attack " + orc.attack);
        System.out.println("Эльф " + " HP " + elf.hp + " Armor " + elf.armor + " Attack " + elf.attack);

        int i = 0;
        while (i !=4){
            Random random = new Random();

            int chance = random.nextInt(2);
            System.out.println(chance);
            System.out.println("________________________________");
            if (chance == 0) orc.attack(elf);
            else elf.attack(orc);
            if(orc.hp == 0 ) i=4;
            if(elf.hp == 0 ) i=4;
            else i++;

        }
        if (orc.hp < elf.hp) System.out.println("Эльф под именем " + elf.getName() + " победил");
        if (elf.hp < orc.hp) System.out.println("Орк под именем " + orc.getName() + " победил");
        if (elf.hp == orc.hp) System.out.println("Ничья!");

    }


    public  static void main(String[] args){
        ArrayList<Orc> orcList = generatorOrc();
        System.out.println("Команда Орки");
        for(Orc elem:orcList) System.out.println(elem.getName());

        ArrayList<Elf> elfList = generatorElf();
        System.out.println("Команда Эльфы");
        for(Elf elem:elfList) System.out.println(elem.getName());

        Random random = new Random();

        int pos1 = random.nextInt(orcList.size());
        int pos2 = random.nextInt(elfList.size());

        attack(orcList.get(pos1),elfList.get(pos2));
    }
}
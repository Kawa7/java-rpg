package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean x=false;
		// Basic shortening of libraries ---------
    	Random rnd = new Random();
		Scanner input = new Scanner(System.in);

		// Character creation --------------------
        Mob player = new Mob();

        player.setId(0);
		player.setHp(20);
		player.setAtk(15);
		player.setDef(5);
		player.setAg(10);
        player.setRole("char");

        System.out.println("Choose your character's name.");
        player.setName(input.next());

        do {
            System.out.println("What's " + player.getName() + "'s perk?\n");
            System.out.println("-- 1. Vitality\n-- 2. Strength\n-- 3. Resistance\n-- 4. Agility");
            switch (input.nextInt()) {
                case 1:
                    player.setHp(player.getHp() + 5);
                    x=true;
                    break;
                case 2:
                    player.setAtk(player.getAtk() + 5);
                    x=true;
                    break;
                case 3:
                    player.setDef(player.getDef() + 5);
                    x=true;
                    break;
                case 4:
                    player.setAg(player.getAg() + 5);
                    x=true;
                    break;
                default:
                    System.out.println("Not a valid option.");
            }
        } while(!x); x=false;

        do {
            System.out.println("What's "+player.getName()+"'s starting item?\n");
            System.out.println("(Armor increases HP instead of Defense.)");
            System.out.println("-- 1. Leather Armor\n-- 2. Dagger\n-- 3. Wooden Shield\n-- 4. None");
            switch(input.nextInt()){
                case 1:
                    player.setHp(player.getHp()+3);
                    x=true;
                    break;
                case 2:
                    player.setAtk(player.getAtk()+3);
                    x=true;
                    break;
                case 3:
                    player.setDef(player.getDef()+3);
                    x=true;
                    break;
                case 4:
                    player.setAg(player.getAg()+5);
                    x=true;
                    break;
                default:
                    System.out.println("Not a valid option.");
            }
        } while(!x); x=false;

		System.out.println("Those are your status:");
		player.getStatus();


		// Goblin creation -----------------------
    	Mob goblin = new Mob();
    	goblin.setId(1);
    	goblin.setRole("mob");
	    goblin.setAtk(rnd.nextInt(5)+10);
	    goblin.setDef(rnd.nextInt(5));
	    goblin.setHp(rnd.nextInt(10)+10);
	    goblin.setAg(rnd.nextInt(5)+5);

        // Goblin Archer creation -----------------------
        Mob gArcher = new Mob();
        gArcher.setId(2);
        gArcher.setRole("mob");
        gArcher.setAtk(rnd.nextInt(7)+10);
        gArcher.setDef(rnd.nextInt(5));
        gArcher.setHp(rnd.nextInt(5)+5);
        gArcher.setAg(rnd.nextInt(5)+20);

        // Armored Goblin creation -----------------------
        Mob gArmor = new Mob();
        gArmor.setId(4);
        gArmor.setRole("mob");
        gArmor.setAtk(rnd.nextInt(5)+10);
        gArmor.setDef(rnd.nextInt(5)+10);
        gArmor.setHp(rnd.nextInt(10)+10);
        gArmor.setAg(rnd.nextInt(5));

        // Strong Goblin creation -----------------------
        Mob gStrong = new Mob();
        gStrong.setId(4);
        gStrong.setRole("mob");
        gStrong.setAtk(rnd.nextInt(10)+15);
        gStrong.setDef(rnd.nextInt(5)+5);
        gStrong.setHp(rnd.nextInt(10)+30);
        gStrong.setAg(rnd.nextInt(5));


    }
}



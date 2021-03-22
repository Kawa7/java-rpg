package com.company;

public class Mob {

    private int id;
    private int hp;
    private int atk;
    private int def;
    private int ag;
    private String role;
    private String name;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public int getHp() { return hp; }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }

    public int getAg() { return ag; }
    public void setAg(int ag) { this.ag = ag; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public void attack() {
        System.out.println(name+" attacks you!");
    }

    public void getStatus() {
        if(this.role.equals("char")){
            System.out.println("Player's Status -------");
        } else if(this.role.equals("mob")){
            System.out.println(this.name+"'s Status");
        }
        System.out.println("Health: "+this.hp);
        System.out.println("Attack: "+this.atk);
        System.out.println("Defense: "+this.def);
        System.out.println("Agility: "+this.ag);
    }
}

package com.burner.pokemongame.entities;
import com.burner.pokemongame.exceptions.entities.runtime.BadArgumentException;

class Ability{

    public  final int abilityId;
    private final String name;
    private final AbilityTypeEnum type;
    private final int attack;
    private final int defence;
    private final int heal;

    //constructor
    public Ability(String name,int prevId, AbilityTypeEnum type, Integer attack, Integer defence, Integer heal){
        this.name = name;
        if (type == null) throw new BadArgumentException("Type can not be null");
        if (attack == null || defence == null || heal == null) throw new BadArgumentException("All fields must be full");
        this.type = type;
        this.abilityId = prevId + 1;
        this.attack = attack;
        this.defence = defence;
        this.heal = heal;
    }

    //getters
    public int getAbilityId(){return this.abilityId;}
    public String getName(){return this.name;}
    public AbilityTypeEnum getType(){return this.type;}
    public int getAttack(){return this.attack;}
    public int getDefence(){return this.defence;}
    public int getHeal(){return this.heal;}

    @Override
    public String toString() {
        return String.format("[%s]\n[%s]\n->attack: [%d]\n->defence: [%d]\n->heal: [%d]", name, type, attack, defence, heal);
    }
}

package com.burner.pokemongame.entities;
import com.burner.pokemongame.exceptions.entities.runtime.BadArgumentException; 

class Drug{
    private final int drugId;
    private final String name;
    private final DrugEffectEnum drugEffect;

    //constructor
    public Drug(int prevId, String name, DrugEffectEnum drugEffect){
        if (drugEffect == null || name == null|| name.trim().isEmpty()) throw new BadArgumentException("Fields cant be null"); 
        this.drugId = prevId +1;
        this.name = name;
        this.drugEffect = drugEffect;
    }

    //getters
    public int getDrugId() {return this.drugId;}
    public String getName() {return this.name;} 
    public DrugEffectEnum getDrugEffect() {return this.drugEffect;}

    @Override
    public String toString(){
        return String.format("[%s]\n[%d]\n<Effect>[%s]\n", name, drugId, drugEffect);
    }
}

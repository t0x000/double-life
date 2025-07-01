package com.burner.pokemongame.entities;

import com.burner.pokemongame.item.*;
import java.util.ArrayList;
import java.util.List; 

@SuppressWarnings("unused")
public class PokemonBuilder {
    private String name;
    private PokemonType type;
    private String gender;
    private int age;
    private String job;
    private int health;
    private int vitalHealth;
    private int exp;
    private int hunger;
    private int thirst;
    private int muscleLevel;
    private int depression;
    private int excretionLevel;
    private boolean casteReservation;
    private boolean disabled;
    private boolean shiny;
    private boolean pokemonLifeInsurance;
    private boolean pokemonHealthInsurance;
    private boolean breedable;
    private boolean isUnionMember;
    private String unionMemberPosition;
    private int unionLoyalty; 
    private String politicalStance;
    private Pokemon mate;
    private int bonesDropped;
    private int insanity;
    private int bloodLust; 
    private String religion; 

    public List<PokemonType> pokemonItLoves = new ArrayList<>();
    public List<PokemonType> pokemonItHates = new ArrayList<>();
    public List<PokemonType> attractedToType = new ArrayList<>();
    public List<String> diseases = new ArrayList<>();
    public List<Ability> abilities = new ArrayList<>();
    public List<Drug> drugs = new ArrayList<>();
    public List<PokemonType> strengths = new ArrayList<>();
    public List<PokemonType> weaknesses = new ArrayList<>();
    public List<Armour> armour = new ArrayList<>();
    public List<Item> pokemonInventory = new ArrayList<>();

    public PokemonBuilder(String name, PokemonType type) {
        this.name = name;
        this.type = type;
        this.health = 100; 
        this.vitalHealth = 5; 
        this.exp = 0;
        this.hunger = 0;
        this.thirst = 0;
        this.muscleLevel = 0;
        this.depression = 0;
        this.excretionLevel = 0;
        this.casteReservation = false;
        this.disabled = false;
        this.shiny = false;
        this.pokemonLifeInsurance = false;
        this.pokemonHealthInsurance = false;
        this.breedable = true;
        this.isUnionMember = false;
        this.unionLoyalty = 0;
        this.bonesDropped = 0;
        this.insanity = 0;
        this.bloodLust = 0;
    }

    //getters
    public String getName(){return this.name;}
    public PokemonType getType(){return this.type;}
    public String getGender(){return this.gender;}
    public int getAge(){return this.age;}
    public String getJob(){return this.job;}
    public int getHealth(){return this.health;}
    public int getVitalHealth(){return this.vitalHealth;}
    public int getExp(){return this.exp;}
    public int getHunger(){return this.hunger;}
    public int getThirst(){return this.thirst;}
    public int getMuscleLevel(){return this.muscleLevel;}
    public int getDepression(){return this.depression;}
    public int getExcretionLevel(){return this.excretionLevel;}
    public boolean getCasteReservation(){return this.casteReservation;}
    public boolean getDisabled(){return this.disabled;}
    public boolean getShiny(){return this.shiny;}
    public boolean getPokemonLifeInsurance(){return this.pokemonLifeInsurance;}
    public boolean getPokemonHealthInsurance(){return this.pokemonHealthInsurance;}
    public boolean getBreedable(){return this.breedable;}
    public boolean getIsUnionMember(){return this.isUnionMember;}
    public String getUnionMemberPosition(){return this.unionMemberPosition;}
    public int getUnionLoyalty(){return this.unionLoyalty;}
    public String getPoliticalStance(){return this.politicalStance;}
    public Pokemon getMate(){return this.mate;}
    public int getBonesDropped(){return this.bonesDropped;}
    public int getInsanity(){return this.insanity;}
    public int getBloodLust(){return this.bloodLust;}
    public String getReligion(){return this.religion;}

    //getters for collections
    public List<PokemonType> getPokemonItLoves() {return this.pokemonItLoves;} 
    public List<PokemonType> getPokemonItHates() {return this.pokemonItHates;}
    public List<PokemonType> getAttractedToType() {return this.attractedToType;}
    public List<String> getDiseases() {return this.diseases;}
    public List<Ability> getAbilities() {return this.abilities;}
    public List<Drug> getDrugs() {return this.drugs;}
    public List<PokemonType> getStrengths() {return this.strengths;}
    public List<PokemonType> getWeaknesses() {return this.weaknesses;}
    public List<Armour> getArmour() {return this.armour;}
    public List<Item> getPokemonInventory() {return this.pokemonInventory;}


    public PokemonBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public PokemonBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PokemonBuilder withJob(String job) {
        this.job = job;
        return this;
    }

    public PokemonBuilder withHealth(int health) {
        this.health = health;
        return this;
    }

    public PokemonBuilder withVitalHealth(int vitalHealth) {
        this.vitalHealth = vitalHealth;
        return this;
    }

    public PokemonBuilder withExp(int exp) {
        this.exp = exp;
        return this;
    }

    public PokemonBuilder withHunger(int hunger) {
        this.hunger = hunger;
        return this;
    }

    public PokemonBuilder withThirst(int thirst) {
        this.thirst = thirst;
        return this;
    }

    public PokemonBuilder withMuscleLevel(int muscleLevel) {
        this.muscleLevel = muscleLevel;
        return this;
    }

    public PokemonBuilder withDepression(int depression) {
        this.depression = depression;
        return this;
    }

    public PokemonBuilder withExcretionLevel(int excretionLevel) {
        this.excretionLevel = excretionLevel;
        return this;
    }

    public PokemonBuilder withCasteReservation(boolean casteReservation) {
        this.casteReservation = casteReservation;
        return this;
    }

    public PokemonBuilder withDisabled(boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    public PokemonBuilder withShiny(boolean shiny) {
        this.shiny = shiny;
        return this;
    }

    public PokemonBuilder withPokemonLifeInsurance(boolean pokemonLifeInsurance) {
        this.pokemonLifeInsurance = pokemonLifeInsurance;
        return this;
    }

    public PokemonBuilder withPokemonHealthInsurance(boolean pokemonHealthInsurance) {
        this.pokemonHealthInsurance = pokemonHealthInsurance;
        return this;
    }

    public PokemonBuilder withBreedable(boolean breedable) {
        this.breedable = breedable;
        return this;
    }

    public PokemonBuilder withIsUnionMember(boolean isUnionMember) {
        this.isUnionMember = isUnionMember;
        return this;
    }

    public PokemonBuilder withUnionMemberPosition(String unionMemberPosition) {
        this.unionMemberPosition = unionMemberPosition;
        return this;
    }

    public PokemonBuilder withUnionLoyalty(int unionLoyalty) {
        this.unionLoyalty = unionLoyalty;
        return this;
    }

    public PokemonBuilder withPoliticalStance(String politicalStance) {
        this.politicalStance = politicalStance;
        return this;
    }

    public PokemonBuilder withMate(Pokemon mate) {
        this.mate = mate;
        return this;
    }

    public PokemonBuilder withBonesDropped(int bonesDropped) {
        this.bonesDropped = bonesDropped;
        return this;
    }

    public PokemonBuilder withInsanity(int insanity) {
        this.insanity = insanity;
        return this;
    }

    public PokemonBuilder withBloodLust(int bloodLust) { // Corrected parameter name
        this.bloodLust = bloodLust;
        return this;
    }

    public PokemonBuilder withReligion(String religion) { // Corrected parameter name
        this.religion = religion;
        return this;
    }

    // Methods for collections (allowing setting an entire list or adding individual items)
    public PokemonBuilder withPokemonItLoves(List<PokemonType> pokemonItLoves) {
        this.pokemonItLoves = new ArrayList<>(pokemonItLoves); // Defensive copy to prevent external modification
        return this;
    }

    public PokemonBuilder addPokemonItLoves(PokemonType pokemonName) {
        this.pokemonItLoves.add(pokemonName);
        return this;
    }

    public PokemonBuilder withPokemonItHates(List<PokemonType> pokemonItHates) {
        this.pokemonItHates = new ArrayList<>(pokemonItHates);
        return this;
    }

    public PokemonBuilder addPokemonItHates(PokemonType pokemonName) {
        this.pokemonItHates.add(pokemonName);
        return this;
    }

    public PokemonBuilder withAttractedToType(List<PokemonType> attractedToType) {
        this.attractedToType = new ArrayList<>(attractedToType);
        return this;
    }

    public PokemonBuilder addAttractedToType(PokemonType type) {
        this.attractedToType.add(type);
        return this;
    }

    public PokemonBuilder withDiseases(List<String> diseases) {
        this.diseases = new ArrayList<>(diseases);
        return this;
    }

    public PokemonBuilder addDisease(String disease) {
        this.diseases.add(disease);
        return this;
    }

    public PokemonBuilder withAbilities(List<Ability> abilities) {
        this.abilities = new ArrayList<>(abilities);
        return this;
    }

    public PokemonBuilder addAbility(Ability ability) {
        this.abilities.add(ability);
        return this;
    }

    public PokemonBuilder withDrugs(List<Drug> drugs) {
        this.drugs = new ArrayList<>(drugs);
        return this;
    }

    public PokemonBuilder addDrug(Drug drug) {
        this.drugs.add(drug);
        return this;
    }

    public PokemonBuilder withStrengths(List<PokemonType> strengths) {
        this.strengths = new ArrayList<>(strengths);
        return this;
    }

    public PokemonBuilder withWeaknesses(List<PokemonType> weaknesses) {
        this.weaknesses = new ArrayList<>(weaknesses);
        return this;
    }

    public PokemonBuilder withArmour(List<Armour> armour) {
        this.armour = new ArrayList<>(armour);
        return this;
    }

    public PokemonBuilder addArmour(Armour armourItem) {
        this.armour.add(armourItem);
        return this;
    }

    public PokemonBuilder withPokemonInventory(List<Item> pokemonInventory) {
        this.pokemonInventory = new ArrayList<>(pokemonInventory);
        return this;
    }

    public PokemonBuilder addItemToInventory(Item item) {
        this.pokemonInventory.add(item);
        return this;
    }

    public PokemonBuilder build() {
        return this;
    }
}


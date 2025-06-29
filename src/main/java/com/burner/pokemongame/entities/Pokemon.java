package com.burner.pokemongame.entities;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
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
    private List<PokemonType> pokemonItLoves;
    private List<PokemonType> pokemonItHates;
    private List<PokemonType> attractedToType;
    private List<String> diseases;
    private List<Ability> abilities;
    private List<Drug> drugs;
    private List<PokemonType> strengths;
    private List<PokemonType> weaknesses;
    private List<Armour> armour;
    private List<Item> pokemonInventory;

    // Constructor is private, accessible only by PokemonBuilder
    public Pokemon(PokemonBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.gender = builder.gender;
        this.age = builder.age;
        this.job = builder.job;
        this.health = builder.health;
        this.vitalHealth = builder.vitalHealth;
        this.exp = builder.exp;
        this.hunger = builder.hunger; 
        this.thirst = builder.thirst; 
        this.muscleLevel = builder.muscleLevel;
        this.depression = builder.depression;
        this.excretionLevel = builder.excretionLevel;
        this.casteReservation = builder.casteReservation;
        this.disabled = builder.disabled;
        this.shiny = builder.shiny;
        this.pokemonLifeInsurance = builder.pokemonLifeInsurance;
        this.pokemonHealthInsurance = builder.pokemonHealthInsurance;
        this.breedable = builder.breedable;
        this.isUnionMember = builder.isUnionMember;
        this.unionMemberPosition = builder.unionMemberPosition; 
        this.unionLoyalty = builder.unionLoyalty; 
        this.politicalStance = builder.politicalStance;
        this.mate = builder.mate;
        this.bonesDropped = builder.bonesDropped;
        this.insanity = builder.insanity;
        this.bloodLust = builder.bloodLust; 
        this.religion = builder.religion; 

        // Initialize lists using defensive copies from the builder's lists
        this.pokemonItLoves = new ArrayList<>(builder.pokemonItLoves);
        this.pokemonItHates = new ArrayList<>(builder.pokemonItHates);
        this.attractedToType = new ArrayList<>(builder.attractedToType);
        this.diseases = new ArrayList<>(builder.diseases);
        this.abilities = new ArrayList<>(builder.abilities);
        this.drugs = new ArrayList<>(builder.drugs);
        this.strengths = new ArrayList<>(builder.strengths);
        this.weaknesses = new ArrayList<>(builder.weaknesses);
        this.armour = new ArrayList<>(builder.armour);
        this.pokemonInventory = new ArrayList<>(builder.pokemonInventory);
    }

    // Setters (Can be made private or removed if Pokemon objects are immutable after creation)
    public void setName(String name){this.name = name;}
    public void setType(PokemonType type){this.type = type;}
    public void setGender(String gender){this.gender = gender;}
    public void setAge(int age){this.age = age;}
    public void setJob(String job){this.job = job;}
    public void setHealth(int health){this.health = health;}
    public void setVitalHealth(int vitalHealth){this.vitalHealth = vitalHealth;}
    public void setExp(int exp){this.exp = exp;}
    public void setHunger(int hunger){this.hunger = hunger;}
    public void setThirst(int thirst){this.thirst = thirst;}
    public void setMuscleLevel(int muscleLevel){this.muscleLevel = muscleLevel;}
    public void setDepression(int depression){this.depression = depression;}
    public void setExcretionLevel(int excretionLevel){this.excretionLevel = excretionLevel;}
    public void setCasteReservation(boolean casteReservation){this.casteReservation = casteReservation;}
    public void setDisabled(boolean disabled){this.disabled = disabled;}
    public void setShiny(boolean shiny){this.shiny = shiny;}
    public void setPokemonLifeInsurance(boolean pokemonLifeInsurance){this.pokemonLifeInsurance = pokemonLifeInsurance;}
    public void setPokemonHealthInsurance(boolean pokemonHealthInsurance){this.pokemonHealthInsurance = pokemonHealthInsurance;}
    public void setBreedable(boolean breedable){this.breedable = breedable;}
    public void setIsUnionMember(boolean isUnionMember){this.isUnionMember = isUnionMember;}
    public void setUnionMemberPosition(String unionMemberPosition){this.unionMemberPosition = unionMemberPosition;}
    public void setUnionLoyalty(int unionLoyalty){this.unionLoyalty = unionLoyalty;} 
    public void setPoliticalStance(String politicalStance){this.politicalStance = politicalStance;}
    public void setMate(String mate){this.mate = mate;}
    public void setBonesDropped(int bonesDropped){this.bonesDropped = bonesDropped;}
    public void setInsanity(int insanity){this.insanity = insanity;}
    public void setBloodLust(int bloodLust){this.bloodLust = bloodLust;} 
    public void setReligion(String religion){this.religion = religion;} 

    // Getters
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
    public List<PokemonType> getPokemonItLoves(){return new ArrayList<>(this.pokemonItLoves);} 
    public List<PokemonType> getPokemonItHates(){return new ArrayList<>(this.pokemonItHates);} 
    public List<PokemonType> getAttractedToType(){return new ArrayList<>(this.attractedToType);} 
    public List<String> getDiseases(){return new ArrayList<>(this.diseases);} 
    public List<Ability> getAbilities(){return new ArrayList<>(this.abilities);} 
    public List<Drug> getDrugs(){return new ArrayList<>(this.drugs);} 
    public List<PokemonType> getStrengths(){return new ArrayList<>(this.strengths);} 
    public List<PokemonType> getWeaknesses(){return new ArrayList<>(this.weaknesses);} 
    public List<Armour> getArmour(){return new ArrayList<>(this.armour);} 
    public List<Item> getPokemonInventory(){return new ArrayList<>(this.pokemonInventory);} 
}

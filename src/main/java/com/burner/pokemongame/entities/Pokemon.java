package com.burner.pokemongame.entities;

import com.burner.pokemongame.item.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        this.name = builder.getName();
        this.type = builder.getType();
        this.gender = builder.getGender();
        this.age = builder.getAge();
        this.job = builder.getJob();
        this.health = builder.getHealth();
        this.vitalHealth = builder.getVitalHealth();
        this.exp = builder.getExp();
        this.hunger = builder.getHunger(); 
        this.thirst = builder.getThirst(); 
        this.muscleLevel = builder.getMuscleLevel();
        this.depression = builder.getDepression();
        this.excretionLevel = builder.getExcretionLevel();
        this.casteReservation = builder.getCasteReservation();
        this.disabled = builder.getDisabled();
        this.shiny = builder.getShiny();
        this.pokemonLifeInsurance = builder.getPokemonLifeInsurance();
        this.pokemonHealthInsurance = builder.getPokemonHealthInsurance();
        this.breedable = builder.getBreedable();
        this.isUnionMember = builder.getIsUnionMember();
        this.unionMemberPosition = builder.getUnionMemberPosition(); 
        this.unionLoyalty = builder.getUnionLoyalty(); 
        this.politicalStance = builder.getPoliticalStance();
        this.mate = builder.getMate();
        this.bonesDropped = builder.getBonesDropped();
        this.insanity = builder.getInsanity();
        this.bloodLust = builder.getBloodLust(); 
        this.religion = builder.getReligion(); 

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
    public void setMate(Pokemon mate){this.mate = mate;}
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
    @Override
    public String toString() {
        return String.format(
            "--- Pokemon Details for %s (%s) ---\n" +
            "  [Name]: %s\n" + // <-- ADDED %s HERE
            "  [Type]: %s\n" + // <-- ADDED %s HERE
            "  -> Gender: %s\n" +
            "  -> Age: %d\n" +
            "  -> Job: %s\n" +
            "  -> Health: %d\n" +
            "  -> Vital Health: %d\n" +
            "  -> Experience: %d\n" +
            "  -> Hunger: %d\n" +
            "  -> Thirst: %d\n" +
            "  -> Muscle Level: %d\n" +
            "  -> Depression: %d\n" +
            "  -> Excretion Level: %d\n" +
            "  -> Caste Reservation: %b\n" +
            "  -> Disabled: %b\n" +
            "  -> Shiny: %b\n" +
            "  -> Life Insurance: %b\n" +
            "  -> Health Insurance: %b\n" +
            "  -> Breedable: %b\n" +
            "  -> Union Member: %b\n" +
            "  -> Union Position: %s\n" +
            "  -> Union Loyalty: %d\n" +
            "  -> Political Stance: %s\n" +
            "  -> Mate: %s\n" +
            "  -> Bones Dropped: %d\n" +
            "  -> Insanity: %d\n" +
            "  -> Blood Lust: %d\n" +
            "  -> Religion: %s\n" +
            "  -> Loves Types: %s\n" +
            "  -> Hates Types: %s\n" +
            "  -> Attracted To: %s\n" +
            "  -> Diseases: %s\n" +
            "  -> Abilities: %s\n" +
            "  -> Drugs: %s\n" +
            "  -> Strengths: %s\n" +
            "  -> Weaknesses: %s\n" +
            "  -> Armour: %s\n" +
            "  -> Inventory: %s\n" +
            "---------------------------------------",
            // ARGUMENTS START HERE
            name, // For the header line: "--- Pokemon Details for %s"
            type, // For the header line: " (%s) ---"
            name, // For "[Name]: %s"
            type, // For "[Type]: %s"
            gender != null ? gender : "N/A",
            age,
            job != null ? job : "N/A",
            health,
            vitalHealth,
            exp,
            hunger,
            thirst,
            muscleLevel,
            depression,
            excretionLevel,
            casteReservation,
            disabled,
            shiny,
            pokemonLifeInsurance,
            pokemonHealthInsurance,
            breedable,
            isUnionMember,
            unionMemberPosition != null ? unionMemberPosition : "N/A",
            unionLoyalty,
            politicalStance != null ? politicalStance : "N/A",
            mate != null ? mate.getName() : "None",
            bonesDropped,
            insanity,
            bloodLust,
            religion != null ? religion : "N/A",
            pokemonItLoves != null && !pokemonItLoves.isEmpty() ?
                pokemonItLoves.stream().map(PokemonType::name).collect(Collectors.joining(", ")) : "None",
            pokemonItHates != null && !pokemonItHates.isEmpty() ?
                pokemonItHates.stream().map(PokemonType::name).collect(Collectors.joining(", ")) : "None",
            attractedToType != null && !attractedToType.isEmpty() ?
                attractedToType.stream().map(PokemonType::name).collect(Collectors.joining(", ")) : "None",
            diseases != null && !diseases.isEmpty() ?
                String.join(", ", diseases) : "None",
            abilities != null && !abilities.isEmpty() ?
                abilities.stream().map(Ability::getName).collect(Collectors.joining(", ")) : "None",
            drugs != null && !drugs.isEmpty() ?
                drugs.stream().map(Drug::getName).collect(Collectors.joining(", ")) : "None",
            strengths != null && !strengths.isEmpty() ?
                strengths.stream().map(PokemonType::name).collect(Collectors.joining(", ")) : "None",
            weaknesses != null && !weaknesses.isEmpty() ?
                weaknesses.stream().map(PokemonType::name).collect(Collectors.joining(", ")) : "None",
            armour != null && !armour.isEmpty() ?
                armour.stream().map(Armour::getName).collect(Collectors.joining(", ")) : "None",
            pokemonInventory != null && !pokemonInventory.isEmpty() ?
                pokemonInventory.stream().map(Item::getName).collect(Collectors.joining(", ")) : "None"
        );
    }
}

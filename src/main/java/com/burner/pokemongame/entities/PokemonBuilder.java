package com.burner.pokemongame.entities;

import com.burner.pokemongame.item.*;
import java.util.ArrayList;
import java.util.List; 

public class PokemonBuilder {
    public String name;
    public PokemonType type;
    public String gender;
    public int age;
    public String job;
    public int health;
    public int vitalHealth;
    public int exp;
    public int hunger;
    public int thirst;
    public int muscleLevel;
    public int depression;
    public int excretionLevel;
    public boolean casteReservation;
    public boolean disabled;
    public boolean shiny;
    public boolean pokemonLifeInsurance;
    public boolean pokemonHealthInsurance;
    public boolean breedable;
    public boolean isUnionMember;
    public String unionMemberPosition;
    public int unionLoyalty; // Corrected spelling to match standard
    public String politicalStance;
    public Pokemon mate;
    public int bonesDropped;
    public int insanity;
    public int bloodLust; // Corrected spelling to match standard
    public String religion; // Corrected spelling

    // Collections initialized to empty ArrayLists to avoid NullPointerExceptions
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
        // Set default values for other fields if necessary
        this.health = 100; // Example default
        this.vitalHealth = 5; // Example default
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


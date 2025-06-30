package com.burner.pokemongame.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import com.burner.pokemongame.item.Item;
import com.burner.pokemongame.exceptions.entities.runtime.InvalidOperationException;

public class Player{
    String name;
    Map<String, Pokemon> pokemons = new HashMap<>();
    Map<String, Item> inventory = new HashMap<>();

    private static final Logger logger = LoggerFactory.getLogger(Player.class);

    public Player(String name){
        this.name = name;
        logger.debug("created {}", name);
        logger.debug("{} has the following properties:\n{}", name, this);
    }

    public void addPokemon(Pokemon pokemon){
        if (pokemon == null) throw new InvalidOperationException("pokemon cant be null in addPokemon");
        pokemons.put(pokemon.getName(), pokemon);
        logger.debug("{} has been added to {}", pokemon.getName(), this.getName());
    }

    public void addItem(Item item){
        if (item == null) throw new InvalidOperationException("item cant be null in addItem");
        if (inventory.containsKey(item.getName()) && item.isStackable()){
            Item existingItem =  inventory.get(item.getName());
            existingItem.setNumberOfItems(existingItem.getNumberOfItems() + 1);
            logger.debug("{} has been added to stackable item of {}", existingItem.getName(), this.getName()); 
            logger.debug("now {} has {} {}",this.getName(), existingItem.getNumberOfItems(), existingItem.getName());
        }
        else{
            item.setNumberOfItems(1);
            inventory.put(item.getName(),item);
            logger.debug("{} has been added to {}", item.getName(), this.getName()); 
        }
    }

    public void addItem(String name, int numberOfItemsToAdd){
        if (inventory.get(name)== null) throw new InvalidOperationException("item cant be null in addItem");
        
        if (inventory.containsKey(name)){
            Item itemToAdd = inventory.get(name);
            if (!itemToAdd.isStackable()) {
                logger.debug("{} is unstackable and cannot be added {}", name, this,getName());
                throw new InvalidOperationException("Item being added is unstackable");
            }
            itemToAdd.setNumberOfItems(itemToAdd.getNumberOfItems() + numberOfItemsToAdd);
            logger.debug("{} number of {} have been added to {}", numberOfItemsToAdd, itemToAdd.getName(), this.getName());
        }
        else{
            logger.warn("{} does not exist in {}", name, this.getName());
        }
    }

    //getters
    public void removePokemon(String name){
        if (pokemons.containsKey(name)){
            pokemons.remove(name);
            logger.debug("{} has been removed from {}", name, this.getName());
        }
        else{
            logger.warn("{} does not exist in {}", name, this.getName());
        }
    }

    public void removeItem(String name){
        if (inventory.get(name)== null) throw new InvalidOperationException("item cant be null in removeItem");
        if (inventory.containsKey(name)){
            inventory.remove(name);
            logger.debug("{} has been removed from {}", name, this.getName());
        }
        else{
            logger.warn("{} does not exist in {}", name, this.getName());
        }
    }

    public void removeItem(String name, int numberOfItemsToRemove){
        if (inventory.get(name)== null) throw new InvalidOperationException("item cant be null in removeItem");
        
        if (inventory.containsKey(name)){
            Item itemToRemove = inventory.get(name);
            if (itemToRemove.getNumberOfItems() < numberOfItemsToRemove){
                logger.warn("Attempted to remove more items than with {}", this.getName());
                throw new InvalidOperationException("failure at removeItem for " + this.getName());
            }
            itemToRemove.setNumberOfItems(itemToRemove.getNumberOfItems() - numberOfItemsToRemove);
            logger.debug("{} number of {} have been removed from {}", numberOfItemsToRemove, itemToRemove.getName(), this.getName());
        }
        else{
            logger.warn("{} does not exist in {}", name, this.getName());
        }
    }
    //getters
    public String getName(){ return this.name;}
    public Map<String, Pokemon> getPokemons(){return Collections.unmodifiableMap(this.pokemons);}
    public Map<String, Item> getInventory(){return Collections.unmodifiableMap(this.inventory);}

    @Override
    public String toString(){
        return String.format("[%s]\n->pokemons: %s\n->inventory: %s", name, pokemons, inventory);
    }
}

package com.burner.pokemongame;

import com.burner.pokemongame.entities.Pokemon;
import com.burner.pokemongame.entities.PokemonBuilder;
import com.burner.pokemongame.entities.PokemonType;

public class App 
{
    public static void main( String[] args )
    {
        Pokemon charizard = new Pokemon(
            new PokemonBuilder("Charizard", PokemonType.FIRE)
            .withAge(10)
            .withExp(100)
            .withHunger(10)
            .withThirst(10)
            .withBloodLust(1000)
            .withInsanity(8000)
            .withGender("male")
            .withShiny(false)
            .withPoliticalStance("communist")
            .withIsUnionMember(true)
            .withUnionMemberPosition("Leader")
            .build()
        );

        System.out.println(charizard);
    }
}

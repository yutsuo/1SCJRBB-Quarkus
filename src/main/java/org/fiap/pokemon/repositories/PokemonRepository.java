package org.fiap.pokemon.repositories;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import javax.enterprise.context.ApplicationScoped;

import org.fiap.pokemon.models.Pokemon;

@ApplicationScoped
public class PokemonRepository implements PanacheMongoRepository<Pokemon> {
    
}
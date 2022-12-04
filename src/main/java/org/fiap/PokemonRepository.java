package org.fiap;

import org.fiap.Pokemon;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PokemonRepository implements PanacheMongoRepository<Pokemon> {
    
}
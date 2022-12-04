package org.fiap.pokemon.controllers;

import org.fiap.pokemon.models.Pokemon;
import org.fiap.pokemon.repositories.PokemonRepository;

import io.quarkus.mongodb.panache.PanacheQuery;
import io.quarkus.mongodb.panache.common.MongoEntity;

import org.bson.types.ObjectId;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@MongoEntity(collection = "Pokemon")
@Path("/pokemon")
public class PokemonController {
    private final PokemonRepository pokemonRepository;

    @Inject
    public PokemonController(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @GET
    public List<Pokemon> getAll() {
        return pokemonRepository.listAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pokemon getPokemon(@PathParam("id") String id) {
        return pokemonRepository.findById(new ObjectId(id));
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void updatePokemon(@PathParam("id") String id, Pokemon pokemon) {
        pokemon.setId(new ObjectId(id));
        pokemonRepository.update(pokemon);
    }

    @POST
    public Response createPokemon(Pokemon pokemon) {
        pokemonRepository.persist(pokemon);
        return Response.ok(pokemon).status(201).build();
    }

    @DELETE
    @Path("/{id}")
    public void deletePokemon(@PathParam("id") String id) {
        pokemonRepository.deleteById(new ObjectId(id));
    }
}

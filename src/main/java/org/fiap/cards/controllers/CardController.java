package org.fiap.cards.controllers;

import org.fiap.cards.models.Card;
import org.fiap.cards.repositories.CardRepository;

import com.mongodb.client.model.Collation;
import com.mongodb.client.model.CollationStrength;

import io.quarkus.mongodb.panache.common.MongoEntity;

import org.bson.types.ObjectId;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@MongoEntity(collection = "Pokecards")
@Path("/card")
public class CardController {
    private final CardRepository cardRepository;

    @Inject
    public CardController(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @GET
    public List<Card> getAll() {
        return cardRepository.listAll();
    }

    // @GET
    // @Path("/{id}")
    // @Produces(MediaType.APPLICATION_JSON)
    // public Card getPokeCard(@PathParam("id") String id) {
    //     return cardRepository.findById(new ObjectId(id));
    // }

    // @PUT
    // @Path("/{id}")
    // @Consumes(MediaType.APPLICATION_JSON)
    // @Produces(MediaType.APPLICATION_JSON)
    // public void updatePokemon(@PathParam("id") String id, Card pokeCard) {
    //     pokeCard.setId(new ObjectId(id));
    //     cardRepository.update(pokeCard);
    // }

    // @POST
    // public Response createPokeCard(Card pokeCard) {
    //     cardRepository.persist(pokeCard);
    //     return Response.ok(pokeCard).status(201).build();
    // }

    // @DELETE
    // @Path("/{id}")
    // public void deletePokeCard(@PathParam("id") String id) {
    //     cardRepository.deleteById(new ObjectId(id));
    // }

    @GET
    @Path("/id/{cardId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Card getPokeCardByCardId(@PathParam("cardId") String cardId) {
        return cardRepository.find("cardId", cardId).firstResult();
    }

    public Collation getCollation() {
        return Collation.builder().locale("en").collationStrength(CollationStrength.SECONDARY).build();
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Card getPokeCardByName(@PathParam("name") String name) {
        return cardRepository.find("name", name).withCollation(getCollation()).firstResult();
    }

}

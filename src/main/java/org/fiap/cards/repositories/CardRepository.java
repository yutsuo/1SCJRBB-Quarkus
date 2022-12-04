package org.fiap.cards.repositories;

import org.fiap.cards.models.Card;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CardRepository implements PanacheMongoRepository<Card> {}
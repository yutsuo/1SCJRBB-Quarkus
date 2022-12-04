package org.fiap.pokemon.models;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

import org.bson.types.ObjectId;

import java.util.List;

@MongoEntity(collection = "Pokemon")
public class Pokemon extends PanacheMongoEntity {
    public ObjectId id;
    private String pokemonId;
    private String name;
    private String img;
    private List<String> type;
    private Stats stats;

    public Pokemon(
            ObjectId id,
            String pokemonId,
            String name,
            String img,
            List<String> type,
            Stats stats) {
        this.id = id;
        this.pokemonId = pokemonId;
        this.name = name;
        this.img = img;
        this.type = type;
        this.stats = stats;
    }

    public Pokemon() {
        super();
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(String pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }


}

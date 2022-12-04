package org.fiap;

import org.fiap.Stats;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.types.ObjectId;
import java.util.List;

public class Pokemon {
    public ObjectId id;
    private String pokemonId;
    private String name;
    private String img;
    private List<String> type;
    private Stats stats;

    // public class Stats {
    //     private String hp;
    //     private String attack;
    //     private String defense;
    //     private String spAttack;
    //     private String spDefense;
    //     private String speed;
    // };

    // private class Moves {
    // private String name;
    // private String type;
    // private String power;
    // private String accuracy;
    // private String pp;

    // };

    // private class damages {
    // private String normal;
    // private String fire;
    // private String water;
    // private String electric;
    // private String grass;
    // private String ice;
    // private String fighting;
    // private String poison;
    // private String ground;
    // private String flying;
    // private String psychic;
    // private String bug;
    // private String rock;
    // private String ghost;
    // private String dragon;
    // private String dark;
    // private String steel;
    // private String fairy;

    // };

    // private class misc {
    // private class sex {
    // private String male;
    // private String female;

    // }

    // private class abilities {
    // private String[] normal;
    // private String[] hidden;
    // }

    // private String classification;
    // private String height;
    // private String weight;
    // private String captureRate;
    // private String eggSteps;
    // private String eggGrowth;
    // private String happiness;
    // private String[] evpoStrings;
    // private String fleeFlag;
    // private String entreeForestLevel;

    // }

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

package org.fiap.cards.models;

import java.util.List;
import javax.annotation.Generated;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.quarkus.mongodb.panache.common.MongoEntity;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"_id",
"cardId",
"name",
"supertype",
"subtypes",
"level",
"hp",
"types",
"evolvesFrom",
"abilities",
"attacks",
"weaknesses",
"retreatCost",
"convertedRetreatCost",
"number",
"artist",
"rarity",
"flavorText",
"nationalPokedexNumbers",
"legalities",
"images"
})
@Generated("jsonschema2pojo")
@MongoEntity(collection = "Pokecards")
public class Card {

@JsonProperty("_id")
private ObjectId id;
@JsonProperty("cardId")
private String cardId;
@JsonProperty("name")
private String name;
@JsonProperty("supertype")
private String supertype;
@JsonProperty("subtypes")
private List<String> subtypes = null;
@JsonProperty("level")
private String level;
@JsonProperty("hp")
private String hp;
@JsonProperty("types")
private List<String> types = null;
@JsonProperty("evolvesFrom")
private String evolvesFrom;
@JsonProperty("abilities")
private List<Ability> abilities = null;
@JsonProperty("attacks")
private List<Attack> attacks = null;
@JsonProperty("weaknesses")
private List<Weakness> weaknesses = null;
@JsonProperty("retreatCost")
private List<String> retreatCost = null;
@JsonProperty("convertedRetreatCost")
private Integer convertedRetreatCost;
@JsonProperty("number")
private String number;
@JsonProperty("artist")
private String artist;
@JsonProperty("rarity")
private String rarity;
@JsonProperty("flavorText")
private String flavorText;
@JsonProperty("nationalPokedexNumbers")
private List<Integer> nationalPokedexNumbers = null;
@JsonProperty("legalities")
private Legalities legalities;
@JsonProperty("images")
private Images images;

/**
* No args constructor for use in serialization
*
*/
public Card() {
}

/**
*
* @param flavorText
* @param supertype
* @param types
* @param images
* @param retreatCost
* @param level
* @param artist
* @param hp
* @param convertedRetreatCost
* @param legalities
* @param evolvesFrom
* @param subtypes
* @param abilities
* @param number
* @param attacks
* @param nationalPokedexNumbers
* @param cardId
* @param weaknesses
* @param name
* @param id
* @param rarity
*/
public Card(ObjectId id, String cardId, String name, String supertype, List<String> subtypes, String level, String hp, List<String> types, String evolvesFrom, List<Ability> abilities, List<Attack> attacks, List<Weakness> weaknesses, List<String> retreatCost, Integer convertedRetreatCost, String number, String artist, String rarity, String flavorText, List<Integer> nationalPokedexNumbers, Legalities legalities, Images images) {
super();
this.id = id;
this.cardId = cardId;
this.name = name;
this.supertype = supertype;
this.subtypes = subtypes;
this.level = level;
this.hp = hp;
this.types = types;
this.evolvesFrom = evolvesFrom;
this.abilities = abilities;
this.attacks = attacks;
this.weaknesses = weaknesses;
this.retreatCost = retreatCost;
this.convertedRetreatCost = convertedRetreatCost;
this.number = number;
this.artist = artist;
this.rarity = rarity;
this.flavorText = flavorText;
this.nationalPokedexNumbers = nationalPokedexNumbers;
this.legalities = legalities;
this.images = images;
}

@JsonProperty("_id")
public ObjectId getId() {
return id;
}

@JsonProperty("_id")
public void setId(ObjectId id) {
this.id = id;
}

@JsonProperty("cardId")
public String getCardId() {
return cardId;
}

@JsonProperty("cardId")
public void setCardId(String cardId) {
this.cardId = cardId;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("supertype")
public String getSupertype() {
return supertype;
}

@JsonProperty("supertype")
public void setSupertype(String supertype) {
this.supertype = supertype;
}

@JsonProperty("subtypes")
public List<String> getSubtypes() {
return subtypes;
}

@JsonProperty("subtypes")
public void setSubtypes(List<String> subtypes) {
this.subtypes = subtypes;
}

@JsonProperty("level")
public String getLevel() {
return level;
}

@JsonProperty("level")
public void setLevel(String level) {
this.level = level;
}

@JsonProperty("hp")
public String getHp() {
return hp;
}

@JsonProperty("hp")
public void setHp(String hp) {
this.hp = hp;
}

@JsonProperty("types")
public List<String> getTypes() {
return types;
}

@JsonProperty("types")
public void setTypes(List<String> types) {
this.types = types;
}

@JsonProperty("evolvesFrom")
public String getEvolvesFrom() {
return evolvesFrom;
}

@JsonProperty("evolvesFrom")
public void setEvolvesFrom(String evolvesFrom) {
this.evolvesFrom = evolvesFrom;
}

@JsonProperty("abilities")
public List<Ability> getAbilities() {
return abilities;
}

@JsonProperty("abilities")
public void setAbilities(List<Ability> abilities) {
this.abilities = abilities;
}

@JsonProperty("attacks")
public List<Attack> getAttacks() {
return attacks;
}

@JsonProperty("attacks")
public void setAttacks(List<Attack> attacks) {
this.attacks = attacks;
}

@JsonProperty("weaknesses")
public List<Weakness> getWeaknesses() {
return weaknesses;
}

@JsonProperty("weaknesses")
public void setWeaknesses(List<Weakness> weaknesses) {
this.weaknesses = weaknesses;
}

@JsonProperty("retreatCost")
public List<String> getRetreatCost() {
return retreatCost;
}

@JsonProperty("retreatCost")
public void setRetreatCost(List<String> retreatCost) {
this.retreatCost = retreatCost;
}

@JsonProperty("convertedRetreatCost")
public Integer getConvertedRetreatCost() {
return convertedRetreatCost;
}

@JsonProperty("convertedRetreatCost")
public void setConvertedRetreatCost(Integer convertedRetreatCost) {
this.convertedRetreatCost = convertedRetreatCost;
}

@JsonProperty("number")
public String getNumber() {
return number;
}

@JsonProperty("number")
public void setNumber(String number) {
this.number = number;
}

@JsonProperty("artist")
public String getArtist() {
return artist;
}

@JsonProperty("artist")
public void setArtist(String artist) {
this.artist = artist;
}

@JsonProperty("rarity")
public String getRarity() {
return rarity;
}

@JsonProperty("rarity")
public void setRarity(String rarity) {
this.rarity = rarity;
}

@JsonProperty("flavorText")
public String getFlavorText() {
return flavorText;
}

@JsonProperty("flavorText")
public void setFlavorText(String flavorText) {
this.flavorText = flavorText;
}

@JsonProperty("nationalPokedexNumbers")
public List<Integer> getNationalPokedexNumbers() {
return nationalPokedexNumbers;
}

@JsonProperty("nationalPokedexNumbers")
public void setNationalPokedexNumbers(List<Integer> nationalPokedexNumbers) {
this.nationalPokedexNumbers = nationalPokedexNumbers;
}

@JsonProperty("legalities")
public Legalities getLegalities() {
return legalities;
}

@JsonProperty("legalities")
public void setLegalities(Legalities legalities) {
this.legalities = legalities;
}

@JsonProperty("images")
public Images getImages() {
return images;
}

@JsonProperty("images")
public void setImages(Images images) {
this.images = images;
}

}
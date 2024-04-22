package Serialization;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import Pokemons.Pokemon;
/*
 * This class is use for serialize and deserialize our Pokemon class into JSON and from JSON to Pokemon class
 * (actually i dont know what i am doing, just follow chatGPT hehe)
 */
public class PokemonSerialization {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String serializePokemonList(List<Pokemon> pokemonList) {
        try {
            return objectMapper.writeValueAsString(pokemonList);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Pokemon> deserializePokemonList(String json) {
        try {
            return objectMapper.readValue(json, new TypeReference<List<Pokemon>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

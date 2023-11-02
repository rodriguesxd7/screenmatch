package br.com.highlevel.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSeries(@JsonAlias("Title") String name,
                          @JsonAlias("imdbRating") String rating,
                          @JsonAlias("totalSeasons") String totalTemp) {
}

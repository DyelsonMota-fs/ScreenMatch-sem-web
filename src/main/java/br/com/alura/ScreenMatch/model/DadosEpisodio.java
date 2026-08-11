package br.com.alura.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosEpisodio(@JsonAlias("Title") String titulo,
                            @JsonAlias("Episode")Integer numero,
                            @JsonAlias("imdbRating")String avaliacao,
                            @JsonAlias("Released")String dataLancamento) {

}

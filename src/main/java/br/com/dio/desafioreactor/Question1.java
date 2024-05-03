package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Collectors;

public class Question1 {

    /*
    Recebe uma lista de longs, incrementa 1 nos valores e retorna um flux dos resultados
     */
    public Flux<Long> inc(final List<Long> numbers){
        // Resolução 1
        List<Long> incrementedValues = numbers.stream()
                .map(value -> value + 1)
                .collect(Collectors.toList());
        return Flux.fromIterable(incrementedValues);
    }

}

package exercicios;

import exercicios.base.Aula;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Aula08 extends Aula {

    public Aula08() {

        var mapaNomeNota = estudantes.stream().collect(toMap(Estudante::getNome, Estudante::getNota));
        mapaNomeNota.forEach((nome, nota) -> System.out.println("Nome: " + nome + " Nota: " + nota));

        /*
        var mapPessoaComanda = new HashMap<>(Map.of(
                "João", 1.75,
                "Maria", 1.65,
                "José", 1.80,
                "Ana", 1.70,
                "Carlos", 1.75,
                "Mariana", 1.65,
                "Pedro", 1.80,
                "Paula", 1.70
        ));

        mapPessoaComanda.merge("Manoel", 100.00, Double::sum);
        mapPessoaComanda.merge("Manoel", 50.00, Double::sum);

        mapPessoaComanda
                .entrySet()
                .stream()
                        .forEach(e -> {
                            var novoValor = e.getValue() >= 100 ? e.getValue() * 0.9 : e.getValue();
                            System.out.println(e.getKey() + ": " + novoValor);
                        });

         */
        /*
        mapPessoaComanda.replaceAll((nome, valor) -> valor >= 100 ? valor * 0.9 : valor);
        mapPessoaComanda.entrySet().removeIf(entry -> entry.getValue() < 100.00);
         */
        //mapPessoaComanda.forEach((nome, valor) -> System.out.println(nome + " - " + valor));



        /*
        var estudante1 = estudantes.getFirst();
        var estudante = estudantes.stream()
                .reduce(estudante1,(e1, e2) -> e1.compareTo(e2) > 0 ? e1 : e2);

        System.out.println(estudante);

        estudantes.stream().sorted().forEach(System.out::println);

         */

    }

    private static double getValue() {
        return 100.00;
    }

    public static void main(String[] args) {
        new Aula08();
    }
}

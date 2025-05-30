package exercicios;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Aula11 {

    private Map<String, List<String>> estadoCidadesMap =
            Map.of("MG", List.of("Belo Horizonte"),
                    "SP", List.of("São Paulo", "Campinas"),
                    "RJ", List.of("Rio de Janeiro", "Niterói", "Cabo Frio"));

    public Aula11() {
        var totalCidadesPorEstado = estadoCidadesMap
                .entrySet()
                .stream()
                .collect(toMap(Map.Entry::getKey, e -> e.getValue().size()));
                ;

        totalCidadesPorEstado.forEach(
                (estado, totalCidades) ->
                        System.out.println("Estado: " + estado + ", Total Cidades: " + totalCidades)
        );
    }

    public static void main(String[] args) { new Aula11(); }
}

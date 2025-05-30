package exercicios;

import exercicios.base.Aula;
import org.jetbrains.annotations.Nullable;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Aula07 extends Aula {

    public Aula07() {
        estudantes.stream()
                .filter(e -> e.getSexo() == 'X')
                .mapToDouble(Estudante::getNota)
                .max()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Nenhum estudante encontrado!"));

        imprimeNota(null);
        imprimeNotaDois(null);

        /*
        double maiorNota = maxOptional
                .orElseThrow(() -> new NoSuchElementException("Nenhum estudante encontrado!"));

        System.out.println(maiorNota);
         */
    }

    private void imprimeNota(Estudante e){
        Objects.requireNonNull(e, "Estudante não pode ser nulo!");
        System.out.println(e.getNome());
    }
    private void imprimeNotaDois(@Nullable Estudante e){
        if(e == null)
            System.out.println("Nenhum estudante para ser exibido!");
        else System.out.println(e.getNome());
    }

    public static void main(String[] args) {
        new Aula07();
    }

    private static double getNotaAleatoria() {
        System.out.println("getNotaAleatoria");
        var x = Math.random();
        var y = Math.random();
        return x + y;
    }
}

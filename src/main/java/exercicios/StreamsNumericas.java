package exercicios;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamsNumericas {
    void main() {

        new Random().ints()
                .limit(10)
                //.takeWhile(i -> i < 20)
                .forEach(System.out::println);

        /*
        var list = IntStream.iterate(10, i -> i >= 0, i -> i - 2)
                .limit(10)
                .mapToObj(i -> new Sensor(i, i*2))
                .toList();
        System.out.println(list);
         */
    }
}

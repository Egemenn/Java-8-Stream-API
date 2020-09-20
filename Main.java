package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;f
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) throws IOException {

        //integer stream - range, forEach
        IntStream
                .range(1,10)
                .forEach(System.out::print);
        System.out.println();


        //integer stream - range, skip
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();


        //integer stream - range, sum
        System.out.println(
        IntStream
                .range(1,5)
                .sum());
        System.out.println();


        //stream - sorted, findFirst, ifPresent
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println();



    }
}

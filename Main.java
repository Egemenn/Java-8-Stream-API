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


        //stream - filter, sorted
        String names[]={"Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Shivika"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
        System.out.println();


        //stream - map, average, ifpresent
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
        System.out.println();

        //stream - map, filter
        List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Shivika");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
        System.out.println();


        //stream - sorted, filter,
        Stream<String> bands = Files.lines(Paths.get("C:\\Users\\10011176\\Desktop\\Java8StreamExamples\\bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length()>13)
                .forEach(System.out::println);
        bands.close();
        System.out.println();



    }
}

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


        //Files. filter, collect
        List<String> bands2 = Files.lines(Paths.get("C:\\Users\\10011176\\Desktop\\Java8StreamExamples\\bands.txt"))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x));


        //stream, Files - map, filter, count
        Stream<String> rows1 = Files.lines(Paths.get("C:\\Users\\10011176\\Desktop\\Java8StreamExamples\\data.txt"));
        int rowCount = (int)rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();
        System.out.println();


        //stream, Files
        Stream<String> rows2 = Files.lines(Paths.get("C:\\Users\\10011176\\Desktop\\Java8StreamExamples\\data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
        rows2.close();
        System.out.println();



    }
}

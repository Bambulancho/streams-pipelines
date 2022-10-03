package com.efimchick.ifmo;

import com.efimchick.ifmo.util.CourseResult;
import com.efimchick.ifmo.util.Person;

import java.util.*;
import java.util.stream.Stream;

public class TestDrive {
    public static void main(String[] args) {
        Person person1 = new Person("Evgen", "Pupkin", 23);
        Person person2 = new Person("Pups", "Gayevich", 20);
        Person person3 = new Person("Olka", "Sigareta", 17);
        Person person4 = new Person("Foo", "Boo", 56);
        Person person5 = new Person("Keks", "Gherych", 5);

        Map<String, Integer> person1Map = Map.of("Phalanxing", 100,"Shieldwalling", 77, "Tercioing", 0, "Wedging", 99);
        Map<String, Integer> person2Map = Map.of("Phalanxing", 88, "Shieldwalling", 78, "Tercioing", 74, "Wedging", 100);
        Map<String, Integer> person3Map = Map.of("Phalanxing", 65, "Shieldwalling", 89, "Tercioing", 99, "Wedging", 97);
        Map<String, Integer> person4Map = Map.of("Phalanxing", 87, "Shieldwalling", 39, "Tercioing", 84, "Wedging", 91);
        Map<String, Integer> person5Map = Map.of("Phalanxing", 45, "Shieldwalling", 73, "Tercioing", 89, "Wedging", 90);

        CourseResult result1 = new CourseResult(person1, person1Map);
        CourseResult result2 = new CourseResult(person2, person2Map);
        CourseResult result3 = new CourseResult(person3, person3Map);
        CourseResult result4 = new CourseResult(person4, person4Map);
        CourseResult result5 = new CourseResult(person5, person5Map);


        Stream<CourseResult> courseResultStream = Stream.of(result1, result2, result3, result4, result5);
        Collecting test = new Collecting();

        String str = courseResultStream.collect(test.printableStringCollector());
        System.out.println(str);


    }
}


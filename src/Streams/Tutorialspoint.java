package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Tutorialspoint {
    public static void Examples() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
        // get list of unique squares
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());

        // get count of empty string
        long count = strings.stream().filter(string -> string.isEmpty()).count();

        random.ints().limit(10).sorted().forEach(System.out::println);

        long count1 = strings.parallelStream().filter(string -> string.isEmpty()).count();

        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();



        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(final String o1, final String o2) {
                return o1.compareTo(o2);
            }
        });

        strings.sort((a,b) -> a.compareTo(b));
        strings.sort(String::compareTo);

        System.out.println(strings);

        String[] men = strings.stream()
                        .filter(p -> p.length() == 2)
                        .toArray(String[]::new);

        Employee[] arrayOfEmpls = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0)
        };

        Integer[] empIds = {1,2,3,4};

        Employee[] employees = Arrays.asList(arrayOfEmpls).stream().toArray(Employee[]::new);

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        /*
        *     Employee employee = Stream.of(empIds)
      .map(employeeRepository::findById)
      .filter(e -> e != null)
      .filter(e -> e.getSalary() > 100000)
      .findFirst()
      .orElse(null);        // .orElseThrow(NoSuchElementException::new);
      * */

        /*
        *     Employee maxSalEmp = empList.stream()
      .max(Comparator.comparing(Employee::getSalary))
      .orElseThrow(NoSuchElementException::new);
        * */



    }

    private static int getCountEmptyStringUsingJava7(List<String> strings) {
        int count = 0;

        for(String string: strings) {
            if(string.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
        List<String> filteredList = new ArrayList<String>();

        for(String string: strings) {
            if(!string.isEmpty()) {
                filteredList.add(string);
            }
        }
        return filteredList;
    }


}
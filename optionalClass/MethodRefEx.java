package optionalClass;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
  public static void main(String[] args) {
    List<String> names=Arrays.asList("harsh","hris","navin");

    List<String> unames=names.stream()
                              .map(String::toUpperCase)
                              .toList();
    unames.forEach(System.out::println);
  }
}

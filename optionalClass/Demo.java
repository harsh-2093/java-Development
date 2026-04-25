package optionalClass;

import java.util.Arrays;
import java.util.List;
// import java.util.Optional;
// import java.util.stream.Stream;

public class Demo {
  public static void main(String[] args) {
    List<String> names=Arrays.asList("nmi","harsh","john","yami");

    String name=names.stream()
                      .filter(str -> str.contains("x"))
                      .findFirst()
                      .orElse("not found");

    System.out.println(name);


  }
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] splitString =  phrase.split("[-\\s]");
        List<Character> characters = Arrays.stream(splitString)
                .map(s -> s.charAt(0))
                .collect(Collectors.toList());
        return characters.stream().map(String::valueOf).collect(Collectors.joining()).toUpperCase();
    }
}

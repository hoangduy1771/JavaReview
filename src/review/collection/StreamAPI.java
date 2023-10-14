package review.collection;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {
        List<Character> spongeBobCartoonCharacters = new ArrayList<>();
        spongeBobCartoonCharacters.add(new Character("SpongeBob Squarepants", 20, "Fry cook/Cashier/Superhero"));
        spongeBobCartoonCharacters.add(new Character("Patrick Star", 25, "Artist/Athlete/Superhero"));
        spongeBobCartoonCharacters.add(new Character("Squidward Tentacles", 40, "Cashier/Artist /Superhero"));
        spongeBobCartoonCharacters.add(new Character("Sandy Cheeks", 20, "Athlete/Scientist/Superhero"));
        spongeBobCartoonCharacters.add(new Character("Eugene H. Krabs", 45, "Manager/Fry cook"));
        spongeBobCartoonCharacters.add(new Character("Sheldon J. Plankton", 35, "Manager/Scientist"));
        spongeBobCartoonCharacters.add(new Character("Mermaid Man", 70, "Superhero/Actor"));
        spongeBobCartoonCharacters.add(new Character("Barnacle Boy", 55, "Superhero/Actor"));

        List<Character> fryCookClub = new ArrayList<>();
        for (Character character : spongeBobCartoonCharacters) {
            if (character.job.toLowerCase().contains("fry cook")) {
                fryCookClub.add(character);
            }
        }
//        fryCookClub.forEach(character -> System.out.println(character.name + ", " + character.job));

        List<Character> youngsterClub = spongeBobCartoonCharacters.stream()
                .filter(character -> character.age < 30).toList();
//        youngsterClub.forEach(character -> System.out.println(character.name + ", " + character.age));


        List<Character> sortedByAgeClub = spongeBobCartoonCharacters.stream()
                .sorted(Comparator.comparing(character -> character.age)).toList();
//        sortedByAgeClub.forEach(character -> System.out.println(character.name + ", " + character.age));

        List<Character> superHeroesSortedByAgeClub = spongeBobCartoonCharacters.stream()
                .filter(character -> character.job.toLowerCase().contains("superhero"))
                .sorted(Comparator.comparing(character -> character.age))
                .toList();
        superHeroesSortedByAgeClub.forEach(character -> System.out.println(character.name + ", " + character.age + ", " + character.job));

    }

    static class Character {
        String name;
        int age;
        String job;

        public Character(String name, int age, String job) {
            this.name = name;
            this.age = age;
            this.job = job;
        }


    }

}

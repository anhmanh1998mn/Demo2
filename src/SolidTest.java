import java.util.ArrayList;
import java.util.List;

public class SolidTest {
    // Single responsibility principle
    public class AnimalObject {
        public String name;

        public AnimalObject() {

        }

        public AnimalObject(String name) {
            this.name = name;
        }
    }

    public class ListAnimal {
        public List<AnimalObject> getListAnimal() {
            List<AnimalObject> list = new ArrayList<>();
            list.add(new AnimalObject("Chicken"));
            list.add(new AnimalObject("Cat"));
            return list;
        }
    }

    public class showListAnimal {
        public void getListAnimal(List<AnimalObject> list) {
            list.forEach(x -> System.out.printf(x.name + "\n"));
        }
    }

    //Open/closed principle
    abstract class IAnimal {
        public abstract String makeSound();
    }

    public class Cat extends IAnimal {

        @Override
        public String makeSound() {
            return "me meo";
        }
    }

    public class Chicken extends IAnimal {

        @Override
        public String makeSound() {
            return "cuc tac";
        }
    }

    //Liskov substitution principle
    interface IFlyableAnimal {
        public void fly();
    }

    public class Bird implements IFlyableAnimal {

        @Override
        public void fly() {

        }
    }

    // Interface segregation principle
    interface IRunnableAnimal {

        void run();
    }

    interface IFlyableAnimal2 {

        void fly();
    }

    public class Snake implements IRunnableAnimal {

        @Override
        public void run() {

        }
    }

    public class BirdObj implements IFlyableAnimal2 {

        @Override
        public void fly() {

        }
    }

    //Dependency inversion principle

    public interface Developer {

        void develop();
    }

    public class BackendDeveloper implements Developer {

        @Override
        public void develop() {
            codeJava();
        }

        private void codeJava() {};
    }

    public class FrontendDeveloper implements Developer {

        @Override
        public void develop() {
            codeJS();
        }

        private void codeJS() {};
    }

    public class Project {

        private List<Developer> developers;

        public Project(List<Developer> developers) {
            this.developers = developers;
        }

        public void build() {
            developers.forEach(developer -> developer.develop());
        }
    }
}

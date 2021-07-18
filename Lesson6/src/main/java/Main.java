public class Main {
    public static void main(String[] args) {

        MilitaryOffice militaryOffice = new MilitaryOffice();
        Registry registry = new Registry();
        militaryOffice.setRegistry(registry);

        Person[] people = new Person[10];
        Person person1 = new Person("Игорь", 33, Sex.MALE, new Address("Минск", "Беларусь"));
        Person person2 = new Person("Александр", 18, Sex.MALE, new Address("Минск", "Беларусь"));
        Person person3 = new Person("Максим", 15, Sex.MALE, new Address("Бобруйск", "Беларусь"));
        Person person4 = new Person("Таня", 23, Sex.FEMALE, new Address("Могилёв", "Беларусь"));
        Person person5 = new Person("Иван", 40, Sex.MALE, new Address("Минск", "Беларусь"));
        Person person6 = new Person("Александр", 19, Sex.MALE, new Address("Сморгонь", "Беларусь"));
        Person person7 = new Person("Илья", 26, Sex.MALE, new Address("Минск", "Беларусь"));
        Person person8 = new Person("Фёдор", 56, Sex.MALE, new Address("Витебск", "Беларусь"));
        Person person9 = new Person("Александр", 40, Sex.MALE, new Address("Минск", "Беларусь"));
        Person person10 = new Person("Иван", 24, Sex.MALE, new Address("Гродно", "Беларусь"));
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;
        people[5] = person6;
        people[6] = person7;
        people[7] = person8;
        people[8] = person9;
        people[9] = person10;

        registry.setPerson(people);

        System.out.println("а) Список годных призывников:");
        militaryOffice.getRegistry().getAllSuitablePersons();

        System.out.println("\nб) Количество годных призывников в городе Минске:");
        militaryOffice.getRegistry().getPersonFromCity("Минск");

        System.out.println("\nв) Количество призывников от 25 до 27 лет:");
        militaryOffice.getRegistry().getPersonOfCertainAge();

        System.out.println("\nг) Количество призывников, у которых имя Александр:");
        militaryOffice.getRegistry().getAllSuitableAlexanders("Александр");


    }
}

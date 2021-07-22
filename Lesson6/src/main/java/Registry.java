import lombok.Getter;
import lombok.Setter;

import javax.sound.midi.Soundbank;

@Getter
@Setter

public class Registry {
    private Person[] person;


    public void getAllSuitablePersons() {
        for (Person p : this.person) {
            if (p.getAge() >= 18 && p.getAge() <= 27 && p.getSex().equals(Sex.MALE)) {
                System.out.println(p);
            }
        }
    }

    public void getPersonFromCity(String city) {
        int count = 0;
        for (Person p : this.person) {
            if (p.getAddress().getCity().equals(city) && p.getAge() >= 18 && p.getAge() <= 27 && p.getSex().equals(Sex.MALE)) {
//                System.out.println(p);
                count++;

            }
        }
        System.out.println(count);
    }

    public void getPersonOfCertainAge() {
        int count = 0;
        for (Person p : this.person) {
            if (p.getAge() >= 25 && p.getAge() <= 27 && p.getSex().equals(Sex.MALE)) {
//                System.out.println(p);
                count++;
            }
        }
        System.out.println(count);
    }

    public void getAllSuitableAlexanders(String name) {
        int count = 0;
        for (Person p : this.person) {
            if (p.getName().equals(name) && p.getAge() >= 18 && p.getAge() <= 27) {
//                System.out.println(p);
                count++;
            }
        }
        System.out.println(count);
    }
}

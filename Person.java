package quizes.q3.tekla_jikhvashvili_2;


import java.util.List;

public class Person {

    private String id;
    private String name, surname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static void main(String[] args) {
        // Create HotelManager instance
        HotelManager hotelManager = new HotelManager(100); // Example with 100 rooms

        // Get list of persons
        List<Person> persons = PersonManager.getPersons();

        // Find a person from the list
        Person targetPerson = null;
        for (Person person : persons) {
            if (person.getName().equals("Tekla") && person.getSurname().equals("Jikhvashvili")) {
                targetPerson = person;
                break;
            }
        }

        // Find another person from the list
        Person otherPerson = null;
        for (Person person : persons) {
            if (person.getName().equals("Bryson") && person.getSurname().equals("Mills")) {
                otherPerson = person;
                break;
            }
        }

        // Check if both persons are found
        if (targetPerson != null && otherPerson != null) {
            // Check-in target person
            boolean checkedInTarget = hotelManager.checkIn(targetPerson, "1"); // Assuming room ID is "1"
            if (checkedInTarget) {
                System.out.println(targetPerson.getName() + " " + targetPerson.getSurname() + " checked in successfully!");
            } else {
                System.out.println("Failed to check in " + targetPerson.getName() + " " + targetPerson.getSurname() + ".");
            }

            // Check-in another person
            boolean checkedInOther = hotelManager.checkIn(otherPerson, "1"); // Assuming same room ID for both
            if (checkedInOther) {
                System.out.println(otherPerson.getName() + " " + otherPerson.getSurname() + " checked in successfully!");
            } else {
                System.out.println("Failed to check in " + otherPerson.getName() + " " + otherPerson.getSurname() + ".");
            }
        } else {
            System.out.println("One or both persons not found in the list.");
        }

        // Display guest information
        hotelManager.displayInfo();
    }
}

package homeworks.oop.Oop7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Иванов Иван", LocalDate.of(2000, 5, 15), "+1234567890", "Россия");
        students[1] = new Student("Петрова Анна", LocalDate.of(1999, 10, 25), "+9876543210", "Украина");
        students[2] = new Student("Smith John", LocalDate.of(2001, 2, 8), "+1122334455", "США");
        students[3] = new Student("García Martínez", LocalDate.of(2002, 7, 12), "+5566778899", "Испания");
        students[4] = new Student("Li Wei", LocalDate.of(2000, 12, 3), "+7788990011", "Китай");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Студент " + (i + 1) + ":");
            System.out.println("Имя: " + students[i].getName());
            System.out.println("Дата рождения: " + students[i].getDateOfBirth());
            System.out.println("Номер телефона: " + students[i].getPhoneNumber());
            System.out.println("Национальность: " + students[i].getNationality());
            int age = students[i].calculateAge();
            System.out.println("Возраст: " + age + " лет");
            System.out.println();
        }
    }
}

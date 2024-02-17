package org.example;
//Создать справочник сотрудников
//        Необходимо:
//        Создать класс справочник сотрудников, который содержит внутри
//        коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Платон", "7999792312");
        Employee emp2 = new Employee("Петя", "79997973123");
        Employee emp3 = new Employee("Вася", "79997979531");
        Employee emp4 = new Employee("Валя", "799979793451");
        Employee emp5 = new Employee("Платон", "8987321345");
        Employee emp6 = new Employee("Влад", "799954571");
        Employee emp7 = new Employee("Вова", "79992343279871");
        Employee emp8 = new Employee("Галина", "7999743549871");
        Employee emp9 = new Employee("Антон", "799979234371");
        Employee emp10 = new Employee("Витя", "79997546541",40, 100002);
        Employee emp11 = new Employee("Федя", "7999797234351", 40,100001);
        Directory<Employee> directory= new Directory<>();
        directory.add(emp1).add(emp2).add(emp3).add(emp11).add(emp10).add(emp4).add(emp5).add(emp9);
        System.out.println(directory.findByExp(40));
        System.out.println(directory.findByTabNumber(100001));
        System.out.println(directory.findPhoneByName("Платон"));
    }

}
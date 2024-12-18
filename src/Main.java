import org.w3c.dom.ls.LSOutput;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static List<Student> studentsAll = new LinkedList<>();
    public static void main(String[] args) {
// todo       Student деген класс тузунуз (свойства: name, age, group).
//        ArrayList тузуп аны 10 студент менен толтурунуз.
//        1) Бардык студенттердин маалыматтарын консолго чыгарыныз.
//        2) Ошол ArrayList ти группасы боюнча фильтрация кылып 2 жаны листке
//        салыныз(Java,JavaScript)
//        3) Жашы 19 дан 23 ко чейинки студенттерди жаны листке салыныз.
//        4) Аты "A"тамгасынан башталган студенттерди жаны листке салыныз
//        Ар бир иш аракет учун озунчо метод тузуп, ал методдорду main класска чакырып иштетиниз.
//                Маанилер main класстан берилуусу керек.
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Show Commands:
                    1-> Show Students:
                    2-> Filter by Group:
                    3-> Filter by age:
                    4-> Filter by First letter""");
            int command = scanner.nextInt();
            switch (command) {
                case 1 -> {
                    studentsAll.add(new Student("Aynura", 20, "java"));
                    studentsAll.add(new Student("Aruuke", 19, "java"));
                    studentsAll.add(new Student("Aybek", 19, "java"));
                    studentsAll.add(new Student("Kanchoro", 21, "java"));
                    studentsAll.add(new Student("Baiel", 20, "java"));
                    studentsAll.add(new Student("Aynaw", 27, "javaScript"));
                    studentsAll.add(new Student("Mairash", 30, "javaScript"));
                    studentsAll.add(new Student("Gulshair", 21, "javaScript"));
                    studentsAll.add(new Student("Belek", 20, "javaScript"));
                    studentsAll.add(new Student("Melis", 29, "javaScript"));
                    System.out.println("Students:  ");
                    System.out.println(studentsAll);
                }
                case 2 -> {
                    System.out.println("Filter by Group:");
                    var javaStudents = filterByGroup(studentsAll,"Java");
                    System.out.println("Java Students: " + javaStudents);
                    var javaScriptStudents = filterByGroup(studentsAll,"JavaScript");
                    System.out.println("JavaScript Students:" + javaScriptStudents);
                }
                case 3 -> {
                    System.out.println("====Filter by Age:====");
                      var filterAge = filterByAge(studentsAll,17,23);
                    System.out.println(filterAge);
                }
                case 4 -> {
                    System.out.println("Filter Name by FirstLetter:");
                    var filter = filterByName(studentsAll,"A");
                    System.out.println(filter);

                }

        }
    }

}
public  static  List <Student> filterByName (List <Student> students, String letter){
        List <Student> studentList = new LinkedList<>();
        for (Student student : students) {
            if (student.getName().startsWith("A")) {
                studentList.add(student);
            }

        }
       return  studentList;
    }
public static List <Student> filterByAge(List<Student> students,int minAge,int maxAge){
   List<Student> listStud = new LinkedList<>();
    for (Student student : students) {
        if (student.getAge() >= minAge && student.getAge()<= maxAge) {
            listStud.add(student);
        }
    }
     return listStud;
    }
    public  static List <Student> filterByGroup(List<Student> students,String group){
       List<Student> listStudent =  new LinkedList<>();
        for (Student student : students) {
            if (student.getGroup().equalsIgnoreCase(group)) {
                listStudent.add(student);
            }
        }
        return listStudent;
    }
}
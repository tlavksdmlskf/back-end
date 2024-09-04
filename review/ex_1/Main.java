package review.ex_1;

public class Main {
    public static void main(String[] args){
        Teacher[] teachers = {new Teacher("연준", "주먹", 18), new Teacher("동영", "꿀잠", 19)};
        Student[] students = {new Student("준석",3,"S12345"), new Student("윤건",1,"$134117.17"), new Student("심판이",2,"ILM3939")};
        teachers[0].addStudent(students[0]);
        teachers[0].addStudent(students[1]);
        teachers[1].addStudent(students[2]);




        System.out.println("=== Teacher Info ===");
        for (Teacher t : teachers){
            t.showInfo();
        }

        System.out.println("=== Student Info ===");
        for (Student s : students){
            s.showInfo();
        }

    }
}

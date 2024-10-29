package review.ex_2;

public class Main {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher("연준", "주먹", 18);
        Teacher teacher2 = new Teacher("동영", "꿀잠", 19);
        Student student1 = new Student("준석", 3, "S12345");
        Student student2 = new Student("윤건", 1, "$134117.17");
        Student student3 = new Student("심판이", 2, "ILM3939");

        // Person 배열에 Teacher와 Student 객체 추가
        Person[] personArray = {teacher1, teacher2, student1, student2, student3};

        // Teacher 객체에 학생 추가
        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student3);

        System.out.println("=== Person Info ===");
        for (Person p : personArray){
            if(p instanceof Teacher){
                p.showInfo();
                ((Teacher)p).showInfo();
                ((Teacher)p).teach();
                System.out.println();
            }else{
                p.showInfo();
                System.out.println();
            }

        }

    }
}

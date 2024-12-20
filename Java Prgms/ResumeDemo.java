interface Resume {
    void biodata();
}

class Teacher implements Resume {
    private String name, qualification, experience, achievements;

    public Teacher(String name, String qualification, String experience, String achievements) {
        this.name = name;
        this.qualification = qualification;
        this.experience = experience;
        this.achievements = achievements;
    }

    @Override
    public void biodata() {
        System.out.println("Teacher's Biodata:");
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience);
        System.out.println("Achievements: " + achievements);
    }
}

class Student implements Resume {
    private String name, result, discipline;

    public Student(String name, String result, String discipline) {
        this.name = name;
        this.result = result;
        this.discipline = discipline;
    }

    @Override
    public void biodata() {
        System.out.println("Student's Biodata:");
        System.out.println("Name: " + name);
        System.out.println("Result: " + result);
        System.out.println("Discipline: " + discipline);
    }
}

public class ResumeDemo {
    public static void main(String[] args) {
        Resume teacher = new Teacher("Alice", "PhD", "10 years", "Best Teacher Award");
        Resume student = new Student("Bob", "A+", "Computer Science");

        // Display biodata for teacher
        teacher.biodata();
        System.out.println();

        // Display biodata for student
        student.biodata();
    }
}

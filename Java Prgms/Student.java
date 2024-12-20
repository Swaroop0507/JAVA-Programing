class Student {
    private String usn;
    private String name;
    private String branch;
    private String phone;

    public Student(String usn, String name, String branch, String phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    public void display() {
        System.out.println("USN: " + usn + ", Name: " + name + ", Branch: " + branch + ", Phone: " + phone);
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("1", "Alice", "CSE", "1234567890"),
            new Student("2", "Bob", "ECE", "0987654321")
        };

        for (Student s : students) {
            s.display();
        }
    }
}

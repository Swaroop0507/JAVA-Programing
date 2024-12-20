class Staff {
    protected String staffId, name, phone;
    protected double salary;

    public Staff(String staffId, String name, String phone, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + staffId + ", Name: " + name + ", Phone: " + phone + ", Salary: " + salary);
    }
}

class Teaching extends Staff {
    private String domain;
    private int experience;

    public Teaching(String id, String name, String phone, double salary, String domain, int experience) {
        super(id, name, phone, salary);
        this.domain = domain;
        this.experience = experience;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Domain: " + domain + ", Experience: " + experience);
    }
}

class Technical extends Staff {
    private String skills;

    public Technical(String id, String name, String phone, double salary, String skills) {
        super(id, name, phone, salary);
        this.skills = skills;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Skills: " + skills);
    }
}

class Contract extends Staff {
    private int duration;

    public Contract(String id, String name, String phone, double salary, int duration) {
        super(id, name, phone, salary);
        this.duration = duration;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Contract Duration: " + duration + " months");
    }
}

public class StaffDemo {
    public static void main(String[] args) {
        // Ensure object initialization is correct
        Staff[] staffMembers = {
            new Teaching("T1", "Alice", "12345", 50000, "Math", 10),
            new Technical("Tech1", "Bob", "54321", 40000, "Java"),
            new Contract("C1", "Charlie", "67890", 30000, 12)
        };

        // Iterate through objects
        for (Staff s : staffMembers) {
            s.display();
            System.out.println();
        }
    }
}

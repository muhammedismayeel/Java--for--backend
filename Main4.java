import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

class Main4 {   // lowercase to match main4.java
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        HashSet<Integer> studentId = new HashSet<>();
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Adding students
        addStudent(studentList, studentId, studentMap, new Student(101, "Alice"));
        addStudent(studentList, studentId, studentMap, new Student(102, "Bob"));
        addStudent(studentList, studentId, studentMap, new Student(103, "Charlie"));
        addStudent(studentList, studentId, studentMap, new Student(101, "Duplicate Alice")); // duplicate

        System.out.println("\n📌 Student List:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        System.out.println("\n📌 Student IDs (no duplicates): " + studentId);
        System.out.println("\n📌 Student Map (ID -> Name): " + studentMap);

        int searchId = 102;
        if (studentMap.containsKey(searchId)) {
            System.out.println("\n🔍 Student with ID " + searchId + ": " + studentMap.get(searchId));
        } else {
            System.out.println("\n❌ Student ID not found.");
        }
    }

    static void addStudent(ArrayList<Student> list, HashSet<Integer> ids, HashMap<Integer, String> map, Student s) {
        if (ids.contains(s.id)) {
            System.out.println("⚠️ Duplicate ID found: " + s.id + " → " + s.name + " not added.");
        } else {
            list.add(s);
            ids.add(s.id);
            map.put(s.id, s.name);
            System.out.println("✅ Added student: " + s);
        }
    }
}


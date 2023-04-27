package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>,  Comparable<StudentGroup> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);        
            }

        };
    }

    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(students.size(), o.students.size());
    }

//     import java.util.Collections;

// public class Main {

//     public static void main(String[] args) {
//         StudentStream stream = new StudentStream(1);

//         StudentGroup group1 = new StudentGroup("Group 1");
//         group1.addStudent(new Student("Student 1"));
//         group1.addStudent(new Student("Student 2"));

//         StudentGroup group2 = new StudentGroup("Group 2");
//         group2.addStudent(new Student("Student 3"));
//         group2.addStudent(new Student("Student 4"));
//         group2.addStudent(new Student("Student 5"));

//         stream.addGroup(group1);
//         stream.addGroup(group2);

//         Collections.sort(stream);

//         for (StudentGroup group : stream) {
//             System.out.println("Group: " + group.getFirstName() + " (" + group.students.size() + " students)");
//             for (Student student : group) {
//                 System.out.println(" - " + student.getFirstName());
//             }
//         }
    // }
    
}
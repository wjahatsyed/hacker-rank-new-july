package comparator.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Syed Wajahat on 7/24/2019.
 */
public class UsingComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(5, "akashs", 3.69));
        studentList.add(new Student(30, "shayla", 3.80));
        studentList.add(new Student(32, "anik", 3.68));
        studentList.add(new Student(2, "swapnil", 3.69));
        studentList.add(new Student(300, "towhid", 3.9));


        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String student2GPA = String.valueOf(o2.getCgpa());
                String student1GPA = String.valueOf(o1.getCgpa());
                int result = student2GPA.compareTo(student1GPA);
                if (result != 0) {
                    return result;
                }

                return o1.getFname().compareTo(o2.getFname());
            }
        };

        Collections.sort(studentList, comparator);


        for (Student st : studentList) {
            System.out.println(st.getFname());
        }

    }
}

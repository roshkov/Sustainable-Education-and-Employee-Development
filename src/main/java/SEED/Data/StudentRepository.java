package SEED.Data;

import SEED.Model.Student;

import java.util.Arrays;
import java.util.List;

public class StudentRepository {

    UniversityRepository unilist = new UniversityRepository();

    private List<Student> ALL_STUDENTS = Arrays.asList(
            new Student(1,"joe", "average",unilist.findById(1) ),
            new Student(2,"frank", "alsoAverage",unilist.findById(1)),
            new Student(3,"some", "notAverage",unilist.findById(2))
    );

    public List<Student> getALL_STUDENTS(){
        return ALL_STUDENTS;
    }

    public Student findById(int id)
    {
        for(Student Student : ALL_STUDENTS) {
            if(id == Student.getId())
                return Student;
        }
        return null;
    }

}

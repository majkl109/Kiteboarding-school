package kiteboarding.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;


@Entity
@Table
public class Kitegroup extends ClassEntity implements Serializable{

    
   
    
    @ManyToOne
    private Kitecourse kitecourse;
    
    @ManyToOne
    private Teacher teacher;
     
    @ManyToOne
    private Student student;
    
    private int numberOfStudents;
     
    @Temporal(TemporalType.DATE)
    private Date startDate;
    

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "kitemember",
            joinColumns = { @JoinColumn(name = "student_id")},
            inverseJoinColumns = { @JoinColumn(name = "kitegroup_id")}
    )
    private List<Student> students = new ArrayList<>();
     
 
     
    public Kitecourse getKitecourse() {
        return kitecourse;
    }

    public void setKitecourse(Kitecourse kitecourse) {
        this.kitecourse = kitecourse;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
  }
    
}



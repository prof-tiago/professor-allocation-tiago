package com.project.professor.allocation.entity;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.util.Date;

@Entity
public class Allocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DayOfWeek day;

    @Temporal(TemporalType.TIME)
    @Column(nullable = false)
    private Date start;

    @Temporal(TemporalType.TIME)
    @Column(nullable = false)
    private Date end;

    @Column(name = "course_id", nullable = false)
    private Long courseId;

    @Column(name = "professor_id", nullable = false)
    private Long professorId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "course_id", nullable = false, insertable = false, updatable = false)
    private Course course;

    @ManyToOne(optional = false)
    @JoinColumn(name = "professor_id", nullable = false, insertable = false, updatable = false)
    private Professor professor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Allocation{" +
                "id=" + id +
                ", day=" + day +
                ", start=" + start +
                ", end=" + end +
                ", courseId=" + courseId +
                ", professorId=" + professorId +
                ", course=" + course +
                ", professor=" + professor +
                '}';
    }
}

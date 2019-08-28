package com.example.listviewperformance;

import java.util.ArrayList;
import java.util.Random;

public class Course {
    String name;
    String teacherName;
    int leactures;

    public Course(String name, String teacherName, int leactures) {
        this.name = name;
        this.teacherName = teacherName;
        this.leactures = leactures;
    }

    public String getName() {
        return name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getLeactures() {
        return leactures;
    }

    public static final String[] teachers = {
            "Harshit", "Arnav", "Prateek", "Aayush", "Deepak", "Garima"
    };

    public static final String[] courseNames = {
            "Launchpad", "Crux", "Python", "NodeJS", "AngularJS", "Android"
    };

    public static ArrayList<Course> generateNRandomCourses(int n) {
        ArrayList<Course> courses = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            Course course = new Course(
                    teachers[r.nextInt(6)],
                    courseNames[r.nextInt(6)],
                    10 + r.nextInt(10)
            );
            courses.add(course);
        }
        return courses;
    }
}

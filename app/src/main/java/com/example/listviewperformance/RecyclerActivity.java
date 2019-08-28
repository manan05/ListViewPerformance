package com.example.listviewperformance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    public static final String TAG = "RV";
    ArrayList<Course> courses = Course.generateNRandomCourses(100);
    RecyclerView rvCourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        rvCourses = findViewById(R.id.rvCourses);
        rvCourses.setLayoutManager(new LinearLayoutManager(this));
        //Always Layout BEFORE Adapter
        //Recycler view wont work because
        //Adapter will have the data but will not know where the data will go
        CourseRecyclerAdapter courseAdapter = new CourseRecyclerAdapter(courses);
        rvCourses.setAdapter(courseAdapter);
    }
}

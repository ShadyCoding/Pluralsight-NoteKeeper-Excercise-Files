package com.jwhh.jim.courseevents;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CourseEventsMainActivity extends AppCompatActivity
        implements CourseEventsDisplayCallbacks {

    ArrayList<String> mCourseEvents;
    ArrayAdapter<String> mCourseEventsAdapter;
    private CourseEventsReceiver mCourseEventsReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_events_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mCourseEvents = new ArrayList<String>();
        mCourseEventsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mCourseEvents);
        final ListView listView = (ListView) findViewById(R.id.list_course_events);
        listView.setAdapter(mCourseEventsAdapter);

        setupCourseEventReceiver();
    }

    private void setupCourseEventReceiver() {
        mCourseEventsReceiver = new CourseEventsReceiver();
        mCourseEventsReceiver.setCourseEventsDisplayCallbacks(this);

        IntentFilter intentFilter = new IntentFilter(CourseEventsReceiver.ACTION_COURSE_EVENT);
        registerReceiver(mCourseEventsReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(mCourseEventsReceiver);
        super.onDestroy();
    }

    @Override
    public void onEventReceived(String courseId, String courseMessage) {
        String displayText = courseId + ": " + courseMessage;
        mCourseEvents.add(displayText);
        mCourseEventsAdapter.notifyDataSetChanged();
    }

}

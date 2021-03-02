package com.genius.runtimeunity;

import android.content.Intent;
import android.os.Bundle;

import com.example.glass.ui.GlassGestureDetector;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onGesture(GlassGestureDetector.Gesture gesture) {
        switch (gesture){
            case TAP:
                startActivity(new Intent(MainActivity.this, UnityPlayerActivity.class));
                return true;

            default:
                return super.onGesture(gesture);
        }
    }
}
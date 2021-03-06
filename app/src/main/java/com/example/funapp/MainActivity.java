package com.example.funapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.funapp.ui.main.InformationFragment;
import com.example.funapp.ui.main.VideoFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {

            //Uri uri = Uri.parse("https://www.youtube.com/watch?v=f3XyYOLfTU4");
            //VideoView simpleVideoView = (VideoView) findViewById(R.id.videoView); // initiate a video view
            //simpleVideoView.setVideoURI(uri);
            //simpleVideoView.play();

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.information_container, InformationFragment.newInstance())
                    .replace(R.id.video_container, VideoFragment.newInstance())
                    .commitNow();
        }
    }
}
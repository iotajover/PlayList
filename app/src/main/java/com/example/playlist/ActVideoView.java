package com.example.playlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class ActVideoView extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_video_view);

        videoView = (VideoView) findViewById(R.id.videoView);
        Intent intent = getIntent(); // get Intent which we set from Previous Activity
        String path = "android.resource://" + getPackageName() + "/" +intent.getIntExtra("image", 0);
        Uri uri = Uri.parse(path);
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}

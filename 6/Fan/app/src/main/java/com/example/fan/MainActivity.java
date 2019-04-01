package com.example.fan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar volumeSeekbar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControls();
    }


    private void initControls()
    {
        try
        {
            volumeSeekbar = findViewById(R.id.seekBar);
//            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//            volumeSeekbar.setMax(audioManager
//                    .getStreamMaxVolume(AudioManager.STREAM_MUSIC));
//            volumeSeekbar.setProgress(audioManager
//                    .getStreamVolume(AudioManager.STREAM_MUSIC));


            volumeSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
            {
                @Override
                public void onStopTrackingTouch(SeekBar arg0)
                {
                    Toast.makeText(getApplicationContext(), "Fan Speed is : "+arg0.getProgress()+"", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onStartTrackingTouch(SeekBar arg0)
                {
                    Toast.makeText(getApplicationContext(), "Fan Speed is : "+arg0.getProgress()+"", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onProgressChanged(SeekBar arg0, int progress, boolean arg2)
                {
//                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,
//                            progress, 0);
                    Toast.makeText(getApplicationContext(), "Fan Speed is : "+arg0.getProgress()+"", Toast.LENGTH_SHORT).show();
                }            });
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}

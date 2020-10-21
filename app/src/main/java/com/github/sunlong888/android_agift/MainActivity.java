package com.github.sunlong888.android_agift;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startPlay();//开始播放
    }

    /**
     * 开始播放
     */
    private void startPlay()
    {
        AudioManager audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE); //获取媒体管理器对象
        int index = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC); //获取设备最大音量值
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,index,AudioManager.FLAG_PLAY_SOUND); //设置获取到的设备最大音量值到本机
        Intent intent = new Intent(MainActivity.this,Mp3.class);//实例化音乐播放的服务对象
        startService(intent);//开启服务
    }

    //用户按下有管理权限的按键（音量+、音量-、返回等）
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        Toast.makeText(this,"你点尼玛呢",Toast.LENGTH_LONG).show();
        return true;
    }

}
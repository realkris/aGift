package com.github.sunlong888.android_agift;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import androidx.annotation.Nullable;

public class Mp3 extends Service
{

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        MediaPlayer player = MediaPlayer.create(this,R.raw.sun);//创建媒体播放器
        player.setLooping(true);//设置是否循环播放
        player.start();//开始播放
        return START_STICKY;
    }

}

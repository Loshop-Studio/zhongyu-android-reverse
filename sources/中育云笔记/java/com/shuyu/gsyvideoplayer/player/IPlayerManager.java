package com.shuyu.gsyvideoplayer.player;

import android.content.Context;
import android.os.Message;
import com.shuyu.gsyvideoplayer.cache.ICacheManager;
import java.util.List;
import p249m7.C10209c;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public interface IPlayerManager {
    int getBufferedPercentage();

    long getCurrentPosition();

    long getDuration();

    IMediaPlayer getMediaPlayer();

    long getNetSpeed();

    int getVideoHeight();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    void initVideoPlayer(Context context, Message message, List<C10209c> list, ICacheManager iCacheManager);

    boolean isPlaying();

    boolean isSurfaceSupportLockCanvas();

    void pause();

    void release();

    void releaseSurface();

    void seekTo(long j10);

    void setNeedMute(boolean z10);

    void setSpeed(float f10, boolean z10);

    void setSpeedPlaying(float f10, boolean z10);

    void setVolume(float f10, float f11);

    void showDisplay(Message message);

    void start();

    void stop();
}

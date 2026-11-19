package com.shuyu.gsyvideoplayer.video.base;

import android.content.Context;
import android.view.Surface;
import com.shuyu.gsyvideoplayer.player.IPlayerManager;
import java.io.BufferedInputStream;
import java.io.File;
import java.util.Map;
import p236l7.InterfaceC10151a;

/* loaded from: classes5.dex */
public interface GSYVideoViewBridge {
    boolean cachePreview(Context context, File file, String str);

    void clearCache(Context context, File file, String str);

    int getBufferedPercentage();

    long getCurrentPosition();

    int getCurrentVideoHeight();

    int getCurrentVideoWidth();

    long getDuration();

    int getLastState();

    long getNetSpeed();

    int getPlayPosition();

    String getPlayTag();

    IPlayerManager getPlayer();

    int getRotateInfoFlag();

    int getVideoHeight();

    int getVideoSarDen();

    int getVideoSarNum();

    int getVideoWidth();

    boolean isCacheFile();

    boolean isPlaying();

    boolean isSurfaceSupportLockCanvas();

    InterfaceC10151a lastListener();

    InterfaceC10151a listener();

    void pause();

    void prepare(BufferedInputStream bufferedInputStream, Map<String, String> map, boolean z10, float f10, boolean z11, File file);

    void prepare(BufferedInputStream bufferedInputStream, Map<String, String> map, boolean z10, float f10, boolean z11, File file, String str);

    void prepare(String str, Map<String, String> map, boolean z10, float f10, boolean z11, File file);

    void prepare(String str, Map<String, String> map, boolean z10, float f10, boolean z11, File file, String str2);

    void releaseMediaPlayer();

    void releaseSurface(Surface surface);

    void seekTo(long j10);

    void setCurrentVideoHeight(int i10);

    void setCurrentVideoWidth(int i10);

    void setDisplay(Surface surface);

    void setLastListener(InterfaceC10151a interfaceC10151a);

    void setLastState(int i10);

    void setListener(InterfaceC10151a interfaceC10151a);

    void setPlayPosition(int i10);

    void setPlayTag(String str);

    void setSpeed(float f10, boolean z10);

    void setSpeedPlaying(float f10, boolean z10);

    void start();

    void stop();
}

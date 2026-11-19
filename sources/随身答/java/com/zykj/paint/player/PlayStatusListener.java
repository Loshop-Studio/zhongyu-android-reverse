package com.zykj.paint.player;

/* loaded from: classes.dex */
public interface PlayStatusListener {
    void onPlayEnd();

    void onPlayPause();

    void onPlayStart();

    void onUpdate(long j9);
}

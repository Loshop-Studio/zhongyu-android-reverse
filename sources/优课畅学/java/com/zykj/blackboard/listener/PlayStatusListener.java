package com.zykj.blackboard.listener;

/* loaded from: classes4.dex */
public interface PlayStatusListener {
    void onPlayEnd();

    void onPlayPause();

    void onPlayResume();

    void onPlayStart();

    void onProgress(long j10);
}

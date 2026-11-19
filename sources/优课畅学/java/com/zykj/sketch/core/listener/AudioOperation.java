package com.zykj.sketch.core.listener;

/* loaded from: classes3.dex */
public interface AudioOperation {
    boolean isRecord();

    void setProgressListener(ProgressListener progressListener);

    void startRecord();

    void stopRecord();
}

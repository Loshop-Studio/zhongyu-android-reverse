package com.alibaba.sdk.android.crashdefend;

/* loaded from: classes.dex */
public interface CrashDefendCallback {
    void onSdkClosed(int i4);

    void onSdkStart(int i4, int i5, int i6);

    void onSdkStop(int i4, int i5, int i6, long j4);
}

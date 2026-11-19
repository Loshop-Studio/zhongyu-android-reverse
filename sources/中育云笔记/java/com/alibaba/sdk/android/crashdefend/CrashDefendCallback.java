package com.alibaba.sdk.android.crashdefend;

/* loaded from: classes3.dex */
public interface CrashDefendCallback {
    void onSdkClosed(int i10);

    void onSdkStart(int i10, int i11, int i12);

    void onSdkStop(int i10, int i11, int i12, long j10);
}

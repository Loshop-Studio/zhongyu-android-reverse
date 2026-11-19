package com.tencent.liteav.basic.module;

/* loaded from: classes4.dex */
public class TXCEventRecorderProxy {

    /* renamed from: a */
    private long f5486a;

    /* renamed from: a */
    public static void m5002a(String str, int i10, long j10, long j11, String str2, int i11) {
        if (str == null || str2 == null) {
            return;
        }
        nativeAddEventMsg(str, i10, j10, j11, str2, i11);
    }

    private static native void nativeAddEventMsg(String str, int i10, long j10, long j11, String str2, int i11);

    private static native void nativeRelease(long j10);

    public void finalize() throws Throwable {
        nativeRelease(this.f5486a);
        this.f5486a = 0L;
        super.finalize();
    }
}

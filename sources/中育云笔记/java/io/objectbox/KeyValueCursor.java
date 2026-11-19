package io.objectbox;

import java.io.Closeable;

/* loaded from: classes6.dex */
public class KeyValueCursor implements Closeable {

    /* renamed from: c */
    public final long f22262c;

    public static native void nativeDestroy(long j10);

    public static native byte[] nativeGetCurrent(long j10);

    public static native byte[] nativeGetEqualOrGreater(long j10, long j11);

    public static native byte[] nativeGetFirst(long j10);

    public static native long nativeGetKey(long j10);

    public static native void nativeGetKey(long j10, long j11);

    public static native byte[] nativeGetLast(long j10);

    public static native byte[] nativeGetLongKey(long j10, long j11);

    public static native byte[] nativeGetNext(long j10);

    public static native byte[] nativeGetPrev(long j10);

    public static native void nativePutLongKey(long j10, long j11, byte[] bArr);

    public static native boolean nativeRemoveAt(long j10, long j11);

    public static native boolean nativeSeek(long j10, long j11);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nativeDestroy(this.f22262c);
    }
}

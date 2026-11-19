package io.objectbox;

import java.io.Closeable;

/* loaded from: classes5.dex */
public class KeyValueCursor implements Closeable {

    /* renamed from: a */
    public final long f14003a;

    public static native void nativeDestroy(long j9);

    public static native byte[] nativeGetCurrent(long j9);

    public static native byte[] nativeGetEqualOrGreater(long j9, long j10);

    public static native byte[] nativeGetFirst(long j9);

    public static native long nativeGetKey(long j9);

    public static native void nativeGetKey(long j9, long j10);

    public static native byte[] nativeGetLast(long j9);

    public static native byte[] nativeGetLongKey(long j9, long j10);

    public static native byte[] nativeGetNext(long j9);

    public static native byte[] nativeGetPrev(long j9);

    public static native void nativePutLongKey(long j9, long j10, byte[] bArr);

    public static native boolean nativeRemoveAt(long j9, long j10);

    public static native boolean nativeSeek(long j9, long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nativeDestroy(this.f14003a);
    }
}

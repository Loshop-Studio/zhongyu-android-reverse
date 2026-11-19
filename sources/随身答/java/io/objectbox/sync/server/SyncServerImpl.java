package io.objectbox.sync.server;

import io.objectbox.sync.listener.SyncChangeListener;
import java.io.Closeable;

/* loaded from: classes5.dex */
public class SyncServerImpl implements Closeable {

    /* renamed from: a */
    public volatile long f14090a;

    private native void nativeAddPeer(long j9, String str, long j10, byte[] bArr);

    private static native long nativeCreate(long j9, String str, String str2);

    private native void nativeDelete(long j9);

    private native int nativeGetPort(long j9);

    private native String nativeGetStatsString(long j9);

    private native boolean nativeIsRunning(long j9);

    private native void nativeSetAuthenticator(long j9, long j10, byte[] bArr);

    private native void nativeSetSyncChangesListener(long j9, SyncChangeListener syncChangeListener);

    private native void nativeStart(long j9);

    private native void nativeStop(long j9);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j9 = this.f14090a;
        this.f14090a = 0L;
        if (j9 != 0) {
            nativeDelete(j9);
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }
}

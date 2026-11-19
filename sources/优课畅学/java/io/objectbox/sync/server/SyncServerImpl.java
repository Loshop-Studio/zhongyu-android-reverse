package io.objectbox.sync.server;

import io.objectbox.sync.listener.SyncChangeListener;
import java.io.Closeable;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class SyncServerImpl implements Closeable {

    /* renamed from: a */
    public volatile long f17021a;

    private native void nativeAddPeer(long j10, String str, long j11, @Nullable byte[] bArr);

    private static native long nativeCreate(long j10, String str, @Nullable String str2);

    private native void nativeDelete(long j10);

    private native int nativeGetPort(long j10);

    private native String nativeGetStatsString(long j10);

    private native boolean nativeIsRunning(long j10);

    private native void nativeSetAuthenticator(long j10, long j11, @Nullable byte[] bArr);

    private native void nativeSetSyncChangesListener(long j10, @Nullable SyncChangeListener syncChangeListener);

    private native void nativeStart(long j10);

    private native void nativeStop(long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f17021a;
        this.f17021a = 0L;
        if (j10 != 0) {
            nativeDelete(j10);
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }
}

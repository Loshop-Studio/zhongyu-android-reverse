package io.objectbox.sync;

import io.objectbox.AbstractC8961d;
import io.objectbox.BoxStore;
import io.objectbox.sync.listener.SyncChangeListener;
import javax.annotation.Nullable;
import p233r6.InterfaceC9940a;

/* loaded from: classes5.dex */
public class SyncClientImpl implements InterfaceC9940a {

    /* renamed from: a */
    public BoxStore f17019a;

    /* renamed from: b */
    public volatile long f17020b;

    public class InternalSyncClientListener {
    }

    private native boolean nativeCancelUpdates(long j10);

    private static native long nativeCreate(long j10, String str, @Nullable String[] strArr);

    private native void nativeDelete(long j10);

    private native int nativeGetState(long j10);

    private native boolean nativeRequestFullSync(long j10, boolean z10);

    private native boolean nativeRequestUpdates(long j10, boolean z10);

    private native void nativeSetListener(long j10, @Nullable InternalSyncClientListener internalSyncClientListener);

    private native void nativeSetLoginInfo(long j10, long j11, @Nullable byte[] bArr);

    private native void nativeSetRequestUpdatesMode(long j10, boolean z10, boolean z11);

    private native void nativeSetSyncChangesListener(long j10, @Nullable SyncChangeListener syncChangeListener);

    private native void nativeSetUncommittedAcks(long j10, boolean z10);

    private native void nativeStart(long j10);

    private native void nativeStop(long j10);

    private native boolean nativeTriggerReconnect(long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10;
        synchronized (this) {
            try {
                BoxStore boxStore = this.f17019a;
                if (boxStore != null) {
                    if (boxStore.m15384u() == this) {
                        AbstractC8961d.m15440b(boxStore, null);
                    }
                    this.f17019a = null;
                }
                j10 = this.f17020b;
                this.f17020b = 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j10 != 0) {
            nativeDelete(j10);
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }
}

package io.objectbox.sync;

import io.objectbox.BoxStore;
import io.objectbox.sync.listener.SyncChangeListener;
import p214q8.AbstractC8983d;
import p269v8.InterfaceC9722a;

/* loaded from: classes5.dex */
public class SyncClientImpl implements InterfaceC9722a {

    /* renamed from: a */
    public BoxStore f13274a;

    /* renamed from: b */
    public volatile long f13275b;

    public class InternalSyncClientListener {
    }

    private native boolean nativeCancelUpdates(long j10);

    private static native long nativeCreate(long j10, String str, String[] strArr);

    private native void nativeDelete(long j10);

    private native int nativeGetState(long j10);

    private native boolean nativeRequestFullSync(long j10, boolean z9);

    private native boolean nativeRequestUpdates(long j10, boolean z9);

    private native void nativeSetListener(long j10, InternalSyncClientListener internalSyncClientListener);

    private native void nativeSetLoginInfo(long j10, long j11, byte[] bArr);

    private native void nativeSetRequestUpdatesMode(long j10, boolean z9, boolean z10);

    private native void nativeSetSyncChangesListener(long j10, SyncChangeListener syncChangeListener);

    private native void nativeSetUncommittedAcks(long j10, boolean z9);

    private native void nativeStart(long j10);

    private native void nativeStop(long j10);

    private native boolean nativeTriggerReconnect(long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10;
        synchronized (this) {
            try {
                BoxStore boxStore = this.f13274a;
                if (boxStore != null) {
                    if (boxStore.m12995y() == this) {
                        AbstractC8983d.m15066b(boxStore, null);
                    }
                    this.f13274a = null;
                }
                j10 = this.f13275b;
                this.f13275b = 0L;
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

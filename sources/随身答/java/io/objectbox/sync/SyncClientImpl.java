package io.objectbox.sync;

import io.objectbox.BoxStore;
import io.objectbox.sync.listener.SyncChangeListener;
import p026b8.AbstractC5209d;
import p120g8.InterfaceC8079a;

/* loaded from: classes5.dex */
public class SyncClientImpl implements InterfaceC8079a {

    /* renamed from: a */
    public BoxStore f14088a;

    /* renamed from: b */
    public volatile long f14089b;

    public class InternalSyncClientListener {
    }

    private native boolean nativeCancelUpdates(long j9);

    private static native long nativeCreate(long j9, String str, String[] strArr);

    private native void nativeDelete(long j9);

    private native int nativeGetState(long j9);

    private native boolean nativeRequestFullSync(long j9, boolean z9);

    private native boolean nativeRequestUpdates(long j9, boolean z9);

    private native void nativeSetListener(long j9, InternalSyncClientListener internalSyncClientListener);

    private native void nativeSetLoginInfo(long j9, long j10, byte[] bArr);

    private native void nativeSetRequestUpdatesMode(long j9, boolean z9, boolean z10);

    private native void nativeSetSyncChangesListener(long j9, SyncChangeListener syncChangeListener);

    private native void nativeSetUncommittedAcks(long j9, boolean z9);

    private native void nativeStart(long j9);

    private native void nativeStop(long j9);

    private native boolean nativeTriggerReconnect(long j9);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j9;
        synchronized (this) {
            try {
                BoxStore boxStore = this.f14088a;
                if (boxStore != null) {
                    if (boxStore.m13115y() == this) {
                        AbstractC5209d.m2277b(boxStore, null);
                    }
                    this.f14088a = null;
                }
                j9 = this.f14089b;
                this.f14089b = 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j9 != 0) {
            nativeDelete(j9);
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }
}

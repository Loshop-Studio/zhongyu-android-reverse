package io.objectbox.sync;

import io.objectbox.BoxStore;
import io.objectbox.sync.listener.SyncChangeListener;
import p210jc.AbstractC9713d;
import p279oc.InterfaceC10466a;

/* loaded from: classes6.dex */
public class SyncClientImpl implements InterfaceC10466a {

    /* renamed from: c */
    public BoxStore f22347c;

    /* renamed from: d */
    public volatile long f22348d;

    public class InternalSyncClientListener {
    }

    private native boolean nativeCancelUpdates(long j10);

    private static native long nativeCreate(long j10, String str, String[] strArr);

    private native void nativeDelete(long j10);

    private native int nativeGetState(long j10);

    private native boolean nativeRequestFullSync(long j10, boolean z10);

    private native boolean nativeRequestUpdates(long j10, boolean z10);

    private native void nativeSetListener(long j10, InternalSyncClientListener internalSyncClientListener);

    private native void nativeSetLoginInfo(long j10, long j11, byte[] bArr);

    private native void nativeSetRequestUpdatesMode(long j10, boolean z10, boolean z11);

    private native void nativeSetSyncChangesListener(long j10, SyncChangeListener syncChangeListener);

    private native void nativeSetUncommittedAcks(long j10, boolean z10);

    private native void nativeStart(long j10);

    private native void nativeStop(long j10);

    private native boolean nativeTriggerReconnect(long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10;
        synchronized (this) {
            try {
                BoxStore boxStore = this.f22347c;
                if (boxStore != null) {
                    if (boxStore.m18940A() == this) {
                        AbstractC9713d.m19250b(boxStore, null);
                    }
                    this.f22347c = null;
                }
                j10 = this.f22348d;
                this.f22348d = 0L;
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

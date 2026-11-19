package io.objectbox.internal;

import io.objectbox.Transaction;
import java.io.Closeable;

/* loaded from: classes6.dex */
public class DebugCursor implements Closeable {

    /* renamed from: c */
    public final Transaction f22288c;

    /* renamed from: d */
    public final long f22289d;

    /* renamed from: e */
    public boolean f22290e;

    public static native long nativeCreate(long j10);

    public static native void nativeDestroy(long j10);

    public static native byte[] nativeGet(long j10, byte[] bArr);

    public static native byte[] nativeSeekOrNext(long j10, byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f22290e) {
            this.f22290e = true;
            Transaction transaction = this.f22288c;
            if (transaction != null && !transaction.m18988j().isClosed()) {
                nativeDestroy(this.f22289d);
            }
        }
    }

    public void finalize() throws Throwable {
        if (this.f22290e) {
            return;
        }
        close();
        super.finalize();
    }
}

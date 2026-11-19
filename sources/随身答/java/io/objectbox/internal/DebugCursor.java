package io.objectbox.internal;

import io.objectbox.Transaction;
import java.io.Closeable;

/* loaded from: classes5.dex */
public class DebugCursor implements Closeable {

    /* renamed from: a */
    public final Transaction f14029a;

    /* renamed from: b */
    public final long f14030b;

    /* renamed from: c */
    public boolean f14031c;

    public static native long nativeCreate(long j9);

    public static native void nativeDestroy(long j9);

    public static native byte[] nativeGet(long j9, byte[] bArr);

    public static native byte[] nativeSeekOrNext(long j9, byte[] bArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f14031c) {
            this.f14031c = true;
            Transaction transaction = this.f14029a;
            if (transaction != null && !transaction.m13136j().isClosed()) {
                nativeDestroy(this.f14030b);
            }
        }
    }

    public void finalize() throws Throwable {
        if (this.f14031c) {
            return;
        }
        close();
        super.finalize();
    }
}
